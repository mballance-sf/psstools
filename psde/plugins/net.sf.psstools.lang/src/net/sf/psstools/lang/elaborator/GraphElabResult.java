package net.sf.psstools.lang.elaborator;

import net.sf.psstools.lang.elaborator.processor.GraphProcessingStrategy;

public class GraphElabResult {
	private GraphInstance				fGraph;
	private GraphProcessingStrategy		fProcessingStrategy;
	
	public void setGraph(GraphInstance instance) {
		fGraph = instance;
	}
	
	public GraphInstance getGraph() {
		return fGraph;
	}
	
	public void setProcessingStrategy(GraphProcessingStrategy strategy) {
		fProcessingStrategy = strategy;
	}
	
	public GraphProcessingStrategy getProcessingStrategy() {
		return fProcessingStrategy;
	}

}
