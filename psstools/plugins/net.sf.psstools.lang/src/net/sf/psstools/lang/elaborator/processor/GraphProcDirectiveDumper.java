package net.sf.psstools.lang.elaborator.processor;

import java.io.PrintStream;

import net.sf.psstools.lang.elaborator.rules.RuleSeqItemRef;

public class GraphProcDirectiveDumper {
	
	
	public static void dump(PrintStream ps, GraphProcDirective root) {
		dump("", ps, root);
	}
	
	private static void dump(String ind, PrintStream ps, GraphProcDirective pd) {
		ps.print(ind + "" + pd.getType());
		
		if (pd.getType() == GraphProcDirectiveType.RandSet) {
			for (RuleSeqItemRef ref : ((GraphRandSetDirective)pd).getRefs()) {
				ps.print(" " + ref.getName());
			}
		}
		ps.println();
		
		for (GraphProcDirective c : pd.getChildren()) {
			dump(ind + "  ", ps, c);
		}
	}

}
