package net.sf.psstools.lang.systemverilog;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import net.sf.psstools.lang.elaborator.DataField;
import net.sf.psstools.lang.elaborator.GraphElabResult;
import net.sf.psstools.lang.elaborator.GraphInstance;
import net.sf.psstools.lang.elaborator.ScalarDataField;
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
	
	public PssSystemVerilogClassGenerator(
			IFileSystemAccess				fsa,
			GraphElabResult					elab_result) {
		fFSA = fsa;
		fElabResult = elab_result;
		fAltStack = new Stack<Integer>();
		fIndentStack = new Stack<String>();
		fDeferredAlternativeList = new ArrayList<GraphProcDirective>();
	}

	public void generate() {
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		fPS = new PrintStream(bos);
		String graphname = fElabResult.getGraph().getName();

		println("package " + graphname + "_pkg;");
		indent();
		
		println();
		
		println("class " + graphname + ";");
		indent();
		
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
	
	private void generate_graph_fields() {
		GraphInstance graph = fElabResult.getGraph();
	
		println("// Graph fields");
		for (DataField field : graph.getFields()) {
			switch (field.getType()) {
				case Scalar: {
					ScalarDataField sfield = (ScalarDataField)field;
					String definition = 
							((field.isRand())?"rand ":"") + 
							"bit " +
							((sfield.isSigned())?"signed ":"");
					println(definition + " " + field.getName() + ";");
					break;
				}
			}
		}
	}
	
	private void generate_graph_body() {
		String graphname = fElabResult.getGraph().getName();
		int branch_id = 0;

		println("task " + graphname + "(); // TODO: support graph arguments");
		GraphProcessingStrategy strategy = fElabResult.getProcessingStrategy();
		indent();
		
		// TODO: reset constraints on entry
	
		// begin traversing graph
		GraphProcDirective root = strategy.getProcessingDirectives();
		for (GraphProcDirective pd : root.getChildren()) {
			implement_strategy(branch_id, pd);
		}
		
		unindent();
		println("endtask");
		
		println();
		println();
		
		List<GraphProcDirective> deferred_alts = new ArrayList<GraphProcDirective>();
		while (fDeferredAlternativeList.size() > 0) {
			branch_id++;
			deferred_alts.clear();
			deferred_alts.addAll(fDeferredAlternativeList);
			fDeferredAlternativeList.clear();
			
	
			for (GraphProcDirective alt : deferred_alts) {
				implement_strategy(branch_id, alt);
				println();
				println();
			}
		}
	}
	
	private void generate_tostring() {
		GraphInstance graph = fElabResult.getGraph();
	
		println("// tostring method");
		println("function string tostring();");
		indent();
		println("string ret;");
		
		for (DataField field : graph.getFields()) {
			switch (field.getType()) {
				case Scalar: {
//					ScalarDataField sfield = (ScalarDataField)field;
					// TODO: handle enumerated values
					println("ret = {ret, $psprintf(\"  " + field.getName() + " = %0d\\n\", " + field.getName() + ")};");
				} break;
			}
		}
		
		println("return ret;");
		unindent();
		println("endfunction");
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
					println("" + i + ": branch_" + (branch_id+1) + "_" + i + "();");
					fDeferredAlternativeList.add(cpd.getChildren().get(i));
				}
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
		}
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
		ind += " ";
		fIndentStack.push(ind);
	}

	private void unindent() {
		if (fIndentStack.size() > 0) {
			fIndentStack.pop();
		}
	}
}
