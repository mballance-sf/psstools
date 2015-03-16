package net.sf.psstools.lang.ui.views.graph.model;

import java.util.ArrayList;
import java.util.List;

import net.sf.psstools.lang.elaborator.rules.RuleProduction;
import net.sf.psstools.lang.elaborator.rules.RuleSeqItemRef;

public class GraphNode {
	private GraphNodeType		fType;
	private Object				fTarget;
	private List<GraphNode>		fConnected;
	
	public GraphNode(GraphNodeType type) {
		fType = type;
		fTarget = null;
		fConnected = new ArrayList<GraphNode>();
	}
	
	public GraphNode(GraphNodeType type, Object target) {
		this(type);
		fTarget = target;
	}
	
	public GraphNodeType getType() {
		return fType;
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
	
	public List<GraphNode> getConnected() {
		return fConnected;
	}
	
	public void addConnection(GraphNode p) {
		fConnected.add(p);
	}
	
}
