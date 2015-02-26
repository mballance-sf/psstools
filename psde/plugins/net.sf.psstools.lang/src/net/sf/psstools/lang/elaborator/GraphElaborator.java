package net.sf.psstools.lang.elaborator;

import java.util.ArrayList;
import java.util.List;

import net.sf.psstools.lang.pSS.Model;
import net.sf.psstools.lang.pSS.data_declaration;
import net.sf.psstools.lang.pSS.data_instantiation;
import net.sf.psstools.lang.pSS.data_type;
import net.sf.psstools.lang.pSS.field_declaration;
import net.sf.psstools.lang.pSS.graph_body_item;
import net.sf.psstools.lang.pSS.graph_declaration;
import net.sf.psstools.lang.pSS.graph_or_struct_declaration;
import net.sf.psstools.lang.pSS.integer_type;
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
import net.sf.psstools.lang.pSS.symbol_definition;
import net.sf.psstools.lang.pSS.user_defined_type;

public class GraphElaborator {
	private List<Model>			fModelList;
	private GraphElabResult		fElabResult;
	
	public GraphElaborator() {
		fModelList = new ArrayList<Model>();
	}
	
	public void addModel(Model m) {
		fModelList.add(m);
	}
	
	public GraphElabResult elaborate(String name) throws ElabException {
		graph_or_struct_declaration gs = find_graph_or_struct(name);
		
		if (!(gs instanceof graph_declaration)) {
			error("Not instanceof graph");
		}
	
		graph_declaration g = (graph_declaration)gs;
		elaborate_graph(g);
		
		System.out.println("gs=" + gs);
		return null;
	}
	
	private GraphInstance elaborate_graph(graph_declaration graph) throws ElabException {
		GraphInstance inst = new GraphInstance(graph.getName());
		symbol_definition root_symbol = null;
		
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
				}
			}
		}
		
		if (root_symbol != null) {
			debug("Elaborating root symbol");
			buildRuleProduction(root_symbol.getProduction(), true);
		} else {
			error("Root symbol not specified for graph " + graph.getName());
		}
		
		return inst;
	}
	
	private RuleProduction buildRuleProduction(rule_production production, boolean resolve) throws ElabException {
		RuleProduction ret = null;
//		debug("rule_production: " + production);
		if (production instanceof rule_repeat_stmt) {
			rule_repeat_stmt rstmt = (rule_repeat_stmt)production;
			
			buildRuleProduction(rstmt.getBody(), resolve);
		} else if (production instanceof rule_block_stmt) {
			rule_block_stmt block_stmt = (rule_block_stmt)production;
			
			for (rule_production rp : block_stmt.getStmt_list()) {
				buildRuleProduction(rp, resolve);
			}
		} else if (production instanceof rule_stmt) {
			rule_stmt stmt = (rule_stmt)production;
			
			
			if (!stmt.isParallel() && !stmt.isAlt()) {
				debug("stmt=" + stmt);
				error("unknown rule stmt type");
			}

			ret = new RuleStmtProduction(
					buildRuleProduction(stmt.getLeft(), resolve),
					(stmt.isAlt())?RuleStmtType.Alternative:RuleStmtType.Parallel,
					buildRuleProduction(stmt.getRight(), resolve));
			debug("rule_stmt: " + ((RuleStmtProduction)ret).getStmtType());
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
				} else {
					error("unknown rule sequence item: " + it);
				}
				
				seq_prod.addSeqItemRef(ref);
			}
		} else {
			debug("unknown rule_production: " + production);
		}
		return ret;
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
	
	private void error(String msg) throws ElabException {
		throw new ElabException(msg);
	}
	
	private void debug(String msg) {
		System.out.println("[GraphElaborator] " + msg);
	}

}
