package net.sf.psstools.lang.elaborator.processor;

import java.util.ArrayList;
import java.util.List;

public class GraphProcDirective {

	private GraphProcDirective					fParent;
	private GraphProcDirectiveType				fType;
	private List<GraphProcDirective>			fChildren;
	
	public GraphProcDirective() {
		this(GraphProcDirectiveType.Root);
	}
	
	protected GraphProcDirective(GraphProcDirectiveType type) {
		fType = type;
		fChildren = new ArrayList<GraphProcDirective>();
	}
	
	public GraphProcDirective getParent() {
		return fParent;
	}
	
	public void setParent(GraphProcDirective parent) {
		fParent = parent;
	}

	public GraphProcDirectiveType getType() {
		return fType;
	}
	
	public void addChild(GraphProcDirective child) {
		fChildren.add(child);
	}
	
	public List<GraphProcDirective> getChildren() {
		return fChildren;
	}
}
