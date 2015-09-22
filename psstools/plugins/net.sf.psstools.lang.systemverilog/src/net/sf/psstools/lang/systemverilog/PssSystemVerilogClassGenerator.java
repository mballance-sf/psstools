package net.sf.psstools.lang.systemverilog;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import net.sf.psstools.lang.elaborator.ActionParameter;
import net.sf.psstools.lang.elaborator.DataField;
import net.sf.psstools.lang.elaborator.DataType;
import net.sf.psstools.lang.elaborator.DataTypeGraph;
import net.sf.psstools.lang.elaborator.DataTypeScalar;
import net.sf.psstools.lang.elaborator.GraphElabResult;
import net.sf.psstools.lang.elaborator.GraphInstance;
import net.sf.psstools.lang.elaborator.GraphInterface;
import net.sf.psstools.lang.elaborator.InterfaceAction;
import net.sf.psstools.lang.elaborator.InterfaceDeclaration;
import net.sf.psstools.lang.elaborator.processor.GraphActionCallProcDirective;
import net.sf.psstools.lang.elaborator.processor.GraphChoiceNodeProcDirective;
import net.sf.psstools.lang.elaborator.processor.GraphChoiceProcDirective;
import net.sf.psstools.lang.elaborator.processor.GraphProcDirective;
import net.sf.psstools.lang.elaborator.processor.GraphProcessingStrategy;
import net.sf.psstools.lang.elaborator.processor.GraphRandSetDirective;
import net.sf.psstools.lang.elaborator.processor.GraphRepeatProcDirective;
import net.sf.psstools.lang.elaborator.rules.RuleSeqItemRef;

import org.eclipse.xtext.generator.IFileSystemAccess;

public class PssSystemVerilogClassGenerator {
	private IFileSystemAccess				fFSA;
	private GraphElabResult					fElabResult;
	private Stack<Integer>					fAltStack;
	private Stack<String>					fIndentStack;
	private PrintStream						fPS;
	private List<GraphProcDirective>		fDeferredAlternativeList;
	private List<Integer>					fDeferredAlternativeIdList;
	private int								fBranchId=1;
	
	public PssSystemVerilogClassGenerator(
			IFileSystemAccess				fsa,
			GraphElabResult					elab_result) {
		fFSA = fsa;
		fElabResult = elab_result;
		fAltStack = new Stack<Integer>();
		fIndentStack = new Stack<String>();
		fDeferredAlternativeList = new ArrayList<GraphProcDirective>();
		fDeferredAlternativeIdList = new ArrayList<Integer>();
	}

	public void generate() {
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		fPS = new PrintStream(bos);
		String graphname = fElabResult.getGraph().getName();

		println("package " + graphname + "_pkg;");
		indent();
		
		println();
		
		generate_interface_classes();
		
		println();
		
		println("class " + graphname + ";");
		indent();
		
		// Instantiate interface fields
		println();
		generate_interface_fields();
		
		// Instantiate class fields
		println();
		
		generate_graph_fields();
		println();
		println();
		
		generate_graph_body();
		println();
		println();
		
		generate_tostring();
		println();
		println();
		
		unindent();
		println("endclass");
		
		unindent();
		println("endpackage");
	
		fPS.flush();
		fFSA.generateFile(graphname + ".svh", bos.toString());
	}
	
	private void generate_interface_classes() {
//		for (InterfaceDeclaration ifc_decl : fElabResult.getGraph().getInterfaceDecls()) {
//			
//			println("virtual class " + ifc_decl.getName() + ";");
//			println();
//			indent();
//			
//			for (InterfaceAction action : ifc_decl.getActions()) {
//				println("pure virtual task " + action.getName() + "(");
//				indent();
//				indent();
//				for (int i=0; i<action.getParameters().size(); i++) {
//					ActionParameter p = action.getParameters().get(i);
//					DataType type = p.getType();
//					
//					String port_decl = "";
//					
//					switch (p.getDirection()) {
//						case In: port_decl = "input "; break;
//						case Out: port_decl = "output "; break;
//						case InOut: port_decl = "inout "; break;
//					}
//
//					port_decl += getTypeString(p.getType());
//					port_decl += " ";
//					port_decl += p.getName();
//					
//					if (i+1 < action.getParameters().size()) {
//						port_decl += ",";
//					} else {
//						port_decl += ");";
//					}
//					
//					println(port_decl);
//				}
//				unindent();
//				unindent();
//				
//				if (action.getParameters().size() == 0) {
//					println(");");
//				}
//			}
//		
//			unindent();
//			println("endclass");
//			println();
//		}
	}
	
	private void generate_interface_fields() {
		DataTypeGraph graph = fElabResult.getGraph();

		println("// Interface fields");
	
//		for (GraphInterface ifc : graph.getInterfaces()) {
//			println(ifc.getInterfaceTypeName() + " " + ifc.getName() + ";");
//		}
	}
	
	private void generate_graph_fields() {
		DataTypeGraph graph = fElabResult.getGraph();
	
		println("// Graph fields");
//		for (DataField field : graph.getFields()) {
//			String definition = 
//				((field.isRand())?"rand ":"") + 
//				getTypeString(field.getType());
//			
//			println(definition + " " + field.getName() + ";");
//		}
	}
	
	private void generate_graph_body() {
		String graphname = fElabResult.getGraph().getName();

		println("task " + graphname + "(); // TODO: support graph arguments");
		GraphProcessingStrategy strategy = fElabResult.getProcessingStrategy();
		indent();
		
		// TODO: reset constraints on entry
	
		// begin traversing graph
		GraphProcDirective root = strategy.getProcessingDirectives();
		for (GraphProcDirective pd : root.getChildren()) {
			implement_strategy(0, pd);
		}
		
		unindent();
		println("endtask");
		
		println();
		println();
		
		List<GraphProcDirective> deferred_alts = new ArrayList<GraphProcDirective>();
		List<Integer> deferred_alt_ids = new ArrayList<Integer>();
		while (fDeferredAlternativeList.size() > 0) {
			deferred_alts.clear();
			deferred_alt_ids.clear();
			deferred_alts.addAll(fDeferredAlternativeList);
			deferred_alt_ids.addAll(fDeferredAlternativeIdList);
			fDeferredAlternativeList.clear();
			fDeferredAlternativeIdList.clear();
			
			for (int i=0; i<deferred_alts.size(); i++) {
				GraphProcDirective alt = deferred_alts.get(i);
				int branch_id = deferred_alt_ids.get(i);

				implement_strategy(branch_id, alt);
				println();
				println();
			}
		}
	}
	
	private void generate_tostring() {
		DataTypeGraph graph = fElabResult.getGraph();
	
//		println("// tostring method");
//		println("function string tostring();");
//		indent();
//		println("string ret;");
//		
//		for (DataField field : graph.getFields()) {
//			DataType type = field.getType();
//			
//			switch (type.getType()) {
//				case Scalar: {
////					ScalarDataField sfield = (ScalarDataField)field;
//					// TODO: handle enumerated values
//					println("ret = {ret, $psprintf(\"  " + field.getName() + " = %0d\\n\", " + field.getName() + ")};");
//				} break;
//			}
//		}
//		
//		println("return ret;");
//		unindent();
//		println("endfunction");
	}	
	
	private void implement_strategy(int branch_id, GraphProcDirective directive) {
		switch (directive.getType()) {
			case RandSet: {
				GraphRandSetDirective rsd = (GraphRandSetDirective)directive;
				if (rsd.getRefs().size() > 0) {
					StringBuilder line = new StringBuilder();
					line.append("assert(this.randomize(");
					for (RuleSeqItemRef ref : rsd.getRefs()) {
						line.append(ref.getName());
						line.append(", ");
					}
					line.setLength(line.length()-2);
					line.append("));");
					println(line.toString());
				}
			} break;
			
			case ChoicePoint: {
				// Should just lay out this level for now, and come back to the sub-level 
				// rules later
				GraphChoiceProcDirective cpd = (GraphChoiceProcDirective)directive;
				
				println("begin");
				indent();
				println("int branch_id;");
				println("assert(std::randomize(branch_id) with {branch_id inside {[0:" +
						(cpd.getChildren().size()-1) + "]};});");
				println("case (branch_id)");
				indent();
				
				for (int i=0; i<cpd.getChildren().size(); i++) {
					println("" + i + ": branch_" + fBranchId + "_" + i + "();");
					fDeferredAlternativeList.add(cpd.getChildren().get(i));
					fDeferredAlternativeIdList.add(fBranchId);
				}
				fBranchId++;
				unindent();
				println("endcase");
				unindent();
				println("end");
			} break;
			
			case ChoiceNode: {
				GraphChoiceNodeProcDirective cnd = (GraphChoiceNodeProcDirective)directive;
				println("task branch_" + branch_id + "_" + cnd.getId() + "();");
				indent();
				for (GraphProcDirective pd : cnd.getChildren()) {
					implement_strategy(branch_id, pd);
				}
				unindent();
				println("endtask");
			} break;
			
			case Repeat: {
				GraphRepeatProcDirective rd = (GraphRepeatProcDirective)directive;
				
				println("forever begin");
				indent();
				for (GraphProcDirective pd : rd.getChildren()) {
					implement_strategy(branch_id, pd);
				}
				unindent();
				println("end");
			} break;
			
			case ActionCall: {
				GraphActionCallProcDirective call = (GraphActionCallProcDirective)directive;
				StringBuilder call_s = new StringBuilder();
				call_s.append(call.getActionPath() + "(");
				
				for (int i=0; i<call.getParameters().size(); i++) {
					call.getParameters().get(i).toStringBuilder(call_s);

					if (i+1 < call.getParameters().size()) {
						call_s.append(", ");
					}
				}
				call_s.append(");");
				
				println(call_s.toString());
			} break;
			
		}
	}
	
	private String getTypeString(DataType type) {
		String ret = null;
		
		switch (type.getType()) {
			case Scalar: {
				DataTypeScalar scalar = (DataTypeScalar)type;
				ret = "bit";
				
				if (scalar.isSigned()) {
					ret += " signed";
				}
				} break;
				
			case UserDefined:
				ret = "user_defined";
				break;
		}
		
		return ret;
	}

	private void println() {
		fPS.println();
	}
	private void println(String line) {
		String ind = "";
		if (fIndentStack.size() > 0) {
			ind = fIndentStack.peek();
		}
		fPS.print(ind);
		fPS.println(line);
	}
	
	private void indent() {
		String ind = "";
		if (fIndentStack.size() > 0) {
			ind = fIndentStack.peek();
		}
		ind += "    ";
		fIndentStack.push(ind);
	}

	private void unindent() {
		if (fIndentStack.size() > 0) {
			fIndentStack.pop();
		}
	}
}
