package net.sf.psstools.lang.ui.views.graph;

import net.sf.psstools.lang.Tuple;
import net.sf.psstools.lang.elaborator.rules.RuleBlockProduction;
import net.sf.psstools.lang.elaborator.rules.RuleProduction;
import net.sf.psstools.lang.elaborator.rules.RuleSeqItemRef;
import net.sf.psstools.lang.elaborator.rules.RuleSeqProduction;
import net.sf.psstools.lang.elaborator.rules.RuleStmtProduction;

public class GraphViewNodeFactory {
	
	public static Tuple<GraphViewNode, GraphViewNode> build(RuleProduction root) {
		GraphViewNode ret = new GraphViewNode(root);
		GraphViewNode curr = ret;
		Tuple<GraphViewNode, GraphViewNode> s;
		
		switch (root.getType()) {
			case Block: {
				RuleBlockProduction p = (RuleBlockProduction)root;
				for (RuleProduction c : p.getChildren()) {
					s = build(c);
					curr.addConnection(s.first());
					curr = s.second();
				}
				} break;
				
			case AltParallel: {
				RuleStmtProduction p = (RuleStmtProduction)root;
				GraphViewNode conv = new GraphViewNode(null);
				for (RuleProduction c : p.getChildren()) {
					s = build(c);
					curr.addConnection(s.first());
					s.second().addConnection(conv);
				}
				curr = conv;
				} break;
				
			case Sequence: {
				RuleSeqProduction p = (RuleSeqProduction)root;
				
				for (RuleSeqItemRef c : p.getSeqItems()) {
					GraphViewNode n = new GraphViewNode(c);
					curr.addConnection(n);
					curr = n;
				}
				
				} break;
		}
		
		return new Tuple<GraphViewNode, GraphViewNode>(ret, curr);
	}

}
