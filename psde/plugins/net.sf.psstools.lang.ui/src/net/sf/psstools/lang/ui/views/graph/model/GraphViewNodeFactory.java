package net.sf.psstools.lang.ui.views.graph.model;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

import net.sf.psstools.lang.Tuple;
import net.sf.psstools.lang.elaborator.rules.RuleBlockProduction;
import net.sf.psstools.lang.elaborator.rules.RuleProduction;
import net.sf.psstools.lang.elaborator.rules.RuleRepeatProduction;
import net.sf.psstools.lang.elaborator.rules.RuleSeqItemRef;
import net.sf.psstools.lang.elaborator.rules.RuleSeqProduction;
import net.sf.psstools.lang.elaborator.rules.RuleStmtProduction;

public class GraphViewNodeFactory {
	
	public static Tuple<GraphNode, GraphNode> build(RuleProduction root) {
		Tuple<GraphNode, GraphNode> ret = null;
		Set<GraphNode> set = new HashSet<>();
		try {
		GraphNode root_ret = new GraphNode(GraphNodeType.Root, root);
		ret = build(root_ret, root);
//		root_ret.addConnection(ret.first());
		ret.first(root_ret);
		
		System.out.println("--> dump");
		dump("", set, ret.first());
		System.out.println("<-- dump");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return ret;
	}
	
	private static Tuple<GraphNode, GraphNode> build(GraphNode parent, RuleProduction root) {
		GraphNode ret = null;
		Tuple<GraphNode, GraphNode> s;
		
		GraphNode curr = parent;
		
		System.out.println("--> build parent=" + parent.getType() + " root=" + root);
		
		switch (root.getType()) {
			case Block: {
				RuleBlockProduction p = (RuleBlockProduction)root;
				for (RuleProduction c : p.getChildren()) {
					s = build(curr, c);
					if (ret == null) {
						ret = s.first();
					}
//					curr.addConnection(s.first());
					curr = s.second();
				}
				} break;
				
			case AltParallel: {
				RuleStmtProduction p = (RuleStmtProduction)root;
				ret = new GraphNode(GraphNodeType.Branch);
				parent.addConnection(ret);
				GraphNode conv = new GraphNode(GraphNodeType.Join);
				for (RuleProduction c : p.getChildren()) {
					System.out.println("  " + c);
					s = build(ret, c);
//					ret.addConnection(s.first());
					s.second().addConnection(conv);
				}
				curr = conv;
				} break;
				
			case Sequence: {
				RuleSeqProduction p = (RuleSeqProduction)root;

				for (RuleSeqItemRef c : p.getSeqItems()) {
					GraphNode n = new GraphNode(GraphNodeType.Item, c);
					if (ret == null) {
						ret = n;
					}
					curr.addConnection(n);
					curr = n;
				}
				} break;
				
			case Repeat: {
				RuleRepeatProduction p = (RuleRepeatProduction)root;
				ret = new GraphNode(GraphNodeType.Join);
				parent.addConnection(ret);
				
				s = build(ret, p.getProduction());
				curr = new GraphNode(GraphNodeType.Join);
				s.second().addConnection(curr);
				ret.addConnection(curr);
				} break;
		}
		
		System.out.println("<-- build ret=" + ret.getType() + " curr=" + curr.getType());
		for (GraphNode n : curr.getConnected()) {
			System.out.println("  n: " + n.getType());
		}
		return new Tuple<GraphNode, GraphNode>(ret, curr);		
	}
	
	private static void dump(String ind, Set<GraphNode> visited, GraphNode n) {
		if (!visited.add(n)) {
			System.out.println(ind + n.getType() + " already visited");
			return;
		}
		System.out.println(ind + n.getType() + " " + n.toString());
		for (GraphNode s : n.getConnected()) {
			dump(ind + "  ", visited, s);
		}
	}

}
