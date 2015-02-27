package net.sf.psstools.lang.elaborator.processor;

public class GraphChoiceNodeProcDirective extends GraphProcDirective {
	private int							fChoiceId;
	
	public GraphChoiceNodeProcDirective(int id) {
		super(GraphProcDirectiveType.ChoiceNode);
		fChoiceId = id;
	}
	
	public int getId() {
		return fChoiceId;
	}

}
