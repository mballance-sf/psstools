package net.sf.psstools.lang.elaborator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.util.TreeIterator;

import net.sf.psstools.lang.elaborator.processor.GraphChoiceProcDirective;
import net.sf.psstools.lang.elaborator.processor.GraphProcDirective;
import net.sf.psstools.lang.elaborator.processor.GraphProcDirectiveDumper;
import net.sf.psstools.lang.elaborator.processor.GraphProcDirectiveFactory;
import net.sf.psstools.lang.elaborator.processor.GraphProcDirectiveType;
import net.sf.psstools.lang.elaborator.processor.GraphProcessingStrategy;
import net.sf.psstools.lang.elaborator.processor.GraphRandSetDirective;
import net.sf.psstools.lang.elaborator.rules.RuleBlockProduction;
import net.sf.psstools.lang.elaborator.rules.RuleProduction;
import net.sf.psstools.lang.elaborator.rules.RuleProductionType;
import net.sf.psstools.lang.elaborator.rules.RuleRepeatProduction;
import net.sf.psstools.lang.elaborator.rules.RuleSeqItemRef;
import net.sf.psstools.lang.elaborator.rules.RuleSeqItemRefType;
import net.sf.psstools.lang.elaborator.rules.RuleSeqProduction;
import net.sf.psstools.lang.elaborator.rules.RuleStmtProduction;
import net.sf.psstools.lang.elaborator.rules.RuleStmtType;
import net.sf.psstools.lang.pSS.Model;
import net.sf.psstools.lang.pSS.data_declaration;
import net.sf.psstools.lang.pSS.data_instantiation;
import net.sf.psstools.lang.pSS.data_type;
import net.sf.psstools.lang.pSS.field_declaration;
import net.sf.psstools.lang.pSS.graph_body_item;
import net.sf.psstools.lang.pSS.graph_declaration;
import net.sf.psstools.lang.pSS.graph_or_struct_declaration;
import net.sf.psstools.lang.pSS.integer_type;
import net.sf.psstools.lang.pSS.interface_declaration;
import net.sf.psstools.lang.pSS.port_declaration;
import net.sf.psstools.lang.pSS.portable_stimulus_description;
import net.sf.psstools.lang.pSS.rule_block_stmt;
import net.sf.psstools.lang.pSS.rule_expr_stmt;
import net.sf.psstools.lang.pSS.rule_interface_action_call;
import net.sf.psstools.lang.pSS.rule_production;
import net.sf.psstools.lang.pSS.rule_repeat_stmt;
import net.sf.psstools.lang.pSS.rule_seq_item;
import net.sf.psstools.lang.pSS.rule_sequence;
import net.sf.psstools.lang.pSS.rule_stmt;
import net.sf.psstools.lang.pSS.rule_stmt_primary;
import net.sf.psstools.lang.pSS.rule_variable_reference;
import net.sf.psstools.lang.pSS.struct_declaration;
import net.sf.psstools.lang.pSS.symbol_declaration;
import net.sf.psstools.lang.pSS.symbol_definition;
import net.sf.psstools.lang.pSS.user_defined_type;

public class GraphElaborator {
	
	enum ElabOptions {
		BUILD_PROCESSING_STRATEGY
	}

	private List<Model>						fModelList;
	private GraphElabResult					fElabResult;
	private Stack<Object>					fScopeStack;
	private Map<ElabOptions, Object>		fElabOptions;
	
	public GraphElaborator() {
		fModelList = new ArrayList<Model>();
		fScopeStack = new Stack<Object>();
		fElabOptions = new HashMap<GraphElaborator.ElabOptions, Object>();
		
		// Set default options
		setElabOption(ElabOptions.BUILD_PROCESSING_STRATEGY, true);
	}
	
	public GraphElaborator(TreeIterator<Notifier> contents) {
		this();
	
		while (contents.hasNext()) {
			Notifier n = contents.next();
			if (n instanceof Model) {
				addModel((Model)n);
			}
		}
	}
	
	public void setElabOption(ElabOptions option, boolean value) {
		fElabOptions.remove(option);
		fElabOptions.put(option, Boolean.valueOf(value));
	}
	
	private boolean getBoolElabOption(ElabOptions option) {
		if (!fElabOptions.containsKey(option)) {
			return false;
		} else {
			Object obj = fElabOptions.get(option);
			if (obj instanceof Boolean) {
				return ((Boolean)obj).booleanValue();
			} else {
				return false;
			}
		}
	}
	
	public void addModel(Model m) {
		fModelList.add(m);
	}
	
	public GraphElabResult elaborate(String name) throws ElabException {
		GraphElabResult result = new GraphElabResult();
		graph_or_struct_declaration gs = find_graph_or_struct(name);
		
		if (!(gs instanceof graph_declaration)) {
			error("Not instanceof graph");
		}
	
		graph_declaration g = (graph_declaration)gs;
		GraphInstance graph = elaborate_graph(g);
		result.setGraph(graph);
		
		if (getBoolElabOption(ElabOptions.BUILD_PROCESSING_STRATEGY)) {
			GraphProcessingStrategy strategy = computeGraphProcessingStrategy(graph);
			result.setProcessingStrategy(strategy);
		}
		
		return result;
	}
	
	private GraphInstance elaborate_graph(graph_declaration graph) throws ElabException {
		GraphInstance inst = new GraphInstance(graph.getName());
		symbol_definition root_symbol = null;
		
		fScopeStack.clear();
		
		// Build the ports and identify interface types that will need to be built
//		for (port_declaration p : graph.getPorts()) {
//			GraphInterfacePort port = new GraphInterfacePort(
//					p.getName(), 
//					p.getIfc_type(), 
//					p.isExport());
//		}
		
		// Find all structs and ensure they're registered with the ElabResult
		for (graph_body_item it : graph.getBody()) {
			if (it instanceof field_declaration) {
				field_declaration fd = (field_declaration)it;
				data_declaration d = fd.getDeclaration();
				
				
				if (d.getType() instanceof user_defined_type) {
					user_defined_type udt = (user_defined_type)d.getType();
					
					debug("user-defined type: " + udt.getTypename());
					
				} else if (d.getType() instanceof integer_type) {
					integer_type int_type = (integer_type)d.getType();
					
					for (data_instantiation di : d.getInstances()) {
						ScalarDataField field = new ScalarDataField(di.getName());
						field.setIsRand(fd.isRand());
						debug("Adding field \"" + di.getName() + "\" of type " + int_type.getAtom_type());
						if (int_type.getAtom_type().equals("bit")) {
							field.setType(ScalarDataType.Bit);
							field.setIsSigned(int_type.isSigned());
						} else if (int_type.getAtom_type().equals("int")) {
							field.setType(ScalarDataType.Int);
							field.setIsSigned(!int_type.isUnsigned());
						} else {
							error("unknown integer atom type: " + int_type.getAtom_type());
						}
						
						inst.addField(field);
					}
					
				} else {
					error("unknown data-field type " + d.getType());
				}
			} else if (it instanceof symbol_definition) {
				symbol_definition def = (symbol_definition)it;
				if (def.getSymbol_name().equals(graph.getName())) {
					// Root symbol
					root_symbol = def;
				} else {
					// Build out without resolution 
//					buildRuleProduction(def, false);
				}
			} else if (it instanceof symbol_declaration) {
				symbol_declaration decl = (symbol_declaration)it;
			}
		}
		
		if (root_symbol != null) {
			debug("Elaborating root symbol");
			fScopeStack.push(inst);
			RuleProduction root = buildRuleProduction(root_symbol.getProduction(), true);
			inst.setRootRule(root);
			fScopeStack.pop();
		} else {
			error("Root symbol not specified for graph " + graph.getName());
		}
		
		return inst;
	}
	
//	private GraphConstraint buildConstraint()
	
	private RuleProduction buildRuleProduction(rule_production production, boolean resolve) throws ElabException {
		RuleProduction ret = null;
//		debug("rule_production: " + production);
		if (production instanceof rule_repeat_stmt) {
			rule_repeat_stmt rstmt = (rule_repeat_stmt)production;
			
			RuleRepeatProduction repeat = new RuleRepeatProduction(
					buildRuleProduction(rstmt.getBody(), resolve));
			ret = repeat;
		} else if (production instanceof rule_block_stmt) {
			rule_block_stmt block_stmt = (rule_block_stmt)production;
			RuleBlockProduction block = new RuleBlockProduction();
			
			for (rule_production rp : block_stmt.getStmt_list()) {
				block.addChild(buildRuleProduction(rp, resolve));
			}
			ret = block;
		} else if (production instanceof rule_stmt) {
			rule_stmt stmt = (rule_stmt)production;
			
			
			if (!stmt.isParallel() && !stmt.isAlt()) {
				debug("stmt=" + stmt);
				error("unknown rule stmt type");
			}

			RuleStmtProduction stmt_ret = new RuleStmtProduction(
					(stmt.isAlt())?RuleStmtType.Alternative:RuleStmtType.Parallel);
			
			RuleProduction left = buildRuleProduction(stmt.getLeft(), resolve);
			RuleProduction right = buildRuleProduction(stmt.getRight(), resolve);
			
			if (left.getType() == RuleProductionType.AltParallel &&
					((RuleStmtProduction)left).getStmtType() == stmt_ret.getStmtType()) {
				for (RuleProduction p : ((RuleStmtProduction)left).getChildren()) {
					stmt_ret.addChild(p);
				}
			} else {
				stmt_ret.addChild(left);
			}
			if (right.getType() == RuleProductionType.AltParallel &&
					((RuleStmtProduction)right).getStmtType() == stmt_ret.getStmtType()) {
				for (RuleProduction p : ((RuleStmtProduction)right).getChildren()) {
					stmt_ret.addChild(p);
				}
			} else {
				stmt_ret.addChild(right);
			}
			
			ret = stmt_ret;
		} else if (production instanceof rule_sequence) {
			rule_sequence seq = (rule_sequence)production;
			RuleSeqProduction seq_prod = new RuleSeqProduction();
			for (rule_seq_item it : seq.getItems()) {
				RuleSeqItemRef ref = null;
				if (it instanceof rule_interface_action_call) {
					rule_interface_action_call call = (rule_interface_action_call)it;
					debug("rule_interface_action_call: " + 
							call.getAction().getIfc() + "." + call.getAction().getAction());
					ref = new RuleSeqItemRef(
							call.getAction().getIfc() + "." + call.getAction().getAction(),
							RuleSeqItemRefType.ActionCall);
				} else if (it instanceof rule_variable_reference) {
					rule_variable_reference var_ref = (rule_variable_reference)it;
					debug("rule_variable_reference: " + var_ref.getItem());
					
					ref = new RuleSeqItemRef(var_ref.getItem(), RuleSeqItemRefType.RuleVariable);
					
					if (resolve) {
						// find the variable
						DataField field = findVariable(ref.getName());
						ref.setDataField(field);
						debug("Resolve ref " + ref.getName() + " to " + field);
					}
				} else {
					error("unknown rule sequence item: " + it);
				}
				
				seq_prod.addSeqItemRef(ref);
			}
			ret = seq_prod;
		} else {
			debug("unknown rule_production: " + production);
		}
		
		if (ret == null) {
			error("null return for " + production);
		}
		return ret;
	}
	
	private DataField findVariable(String name) throws ElabException {
		// Implied context
		Object scope = fScopeStack.peek();
		
		GraphInstance inst = (GraphInstance)scope;
		
		for (DataField f : inst.getFields()) {
			if (f.getName().equals(name)) {
				return f;
			}
		}
		
		return null;
	}

	private GraphProcessingStrategy computeGraphProcessingStrategy(GraphInstance instance) throws ElabException {
		GraphProcessingStrategy strategy = new GraphProcessingStrategy();
		
		RuleProduction production = instance.getRootRule();

		GraphProcDirectiveFactory factory = new GraphProcDirectiveFactory();
		GraphProcDirective root = factory.build(production);
		
		strategy.setProcessingDirectives(root);
		
		GraphProcDirectiveDumper.dump(System.out, root);
	
		return strategy;
	}
	
//	private void addIntegerFields()
	
	private data_type resolve_user_defined_type(user_defined_type type) {
		return null;
	}
	
	private graph_or_struct_declaration find_graph_or_struct(String name) {
		for (Model m : fModelList) {
			for (portable_stimulus_description d : m.getRoot()) {
				if (d instanceof graph_declaration) {
					if (((graph_declaration)d).getName().equals(name)) {
						return (graph_declaration)d;
					}
				} else if (d instanceof struct_declaration) {
					if (((struct_declaration)d).getName().equals(name)) {
						return (struct_declaration)d;
					}
				}
			}
		}
		
		return null;
	}
	
	private interface_declaration find_interface_declaration(String name) {
		for (Model m : fModelList) {
			for (portable_stimulus_description d : m.getRoot()) {
				if (d instanceof interface_declaration) {
					if (((interface_declaration)d).getName().equals(name)) {
						return (interface_declaration)d;
					}
				} 
			}
		}
		
		return null;
	}
	
	private void error(String msg) throws ElabException {
		throw new ElabException(msg);
	}
	
	private void debug(String msg) {
		System.out.println("[GraphElaborator] " + msg);
	}

}
