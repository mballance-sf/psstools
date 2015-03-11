package net.sf.psstools.lang.ui.views.graph;

import java.util.ArrayList;
import java.util.List;

import net.sf.psstools.lang.elaborator.rules.RuleProduction;
import net.sf.psstools.lang.elaborator.rules.RuleSeqItemRef;

public class GraphViewNode {
	private Object					fTarget;
	private List<GraphViewNode>		fConnected;
	
	public GraphViewNode(Object target) {
		fTarget = target;
		fConnected = new ArrayList<GraphViewNode>();
	}

	public Object getTarget() {
		return fTarget;
	}
	
	public String toString() {
		if (fTarget == null) {
			return "NULL";
		} else if (fTarget instanceof RuleProduction) {
			return "RP"; // fTarget.toString();
		} else if (fTarget instanceof RuleSeqItemRef) {
			return ((RuleSeqItemRef)fTarget).getName();
		} else {
			return "UNKNOWN";
		}
	}
	
	public List<GraphViewNode> getConnected() {
		return fConnected;
	}
	
	public void addConnection(GraphViewNode p) {
		fConnected.add(p);
	}
	
}
