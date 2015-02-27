package net.sf.psstools.lang.systemverilog;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import net.sf.psstools.lang.elaborator.GraphElabResult;
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
		
		println("class " + graphname + ";");

		indent();
		generate_graph_body();
		unindent();
		
		println("endclass");
	
		fPS.flush();
		fFSA.generateFile(graphname + ".svh", bos.toString());
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
		
		List<GraphProcDirective> deferred_alts = new ArrayList<GraphProcDirective>();
		while (fDeferredAlternativeList.size() > 0) {
			branch_id++;
			deferred_alts.clear();
			deferred_alts.addAll(fDeferredAlternativeList);
			fDeferredAlternativeList.clear();
	
			for (GraphProcDirective alt : deferred_alts) {
				implement_strategy(branch_id, alt);
			}
		}
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
						cpd.getChildren().size() + "-1]};});");
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
