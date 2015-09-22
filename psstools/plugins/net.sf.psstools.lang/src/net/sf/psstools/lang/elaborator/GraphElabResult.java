package net.sf.psstools.lang.elaborator;

import net.sf.psstools.lang.elaborator.processor.GraphProcessingStrategy;

public class GraphElabResult {
	private DataTypeGraph				fGraph;
	private GraphProcessingStrategy		fProcessingStrategy;
	
	public void setGraph(DataTypeGraph instance) {
		fGraph = instance;
	}
	
	public DataTypeGraph getGraph() {
		return fGraph;
	}
	
	public void setProcessingStrategy(GraphProcessingStrategy strategy) {
		fProcessingStrategy = strategy;
	}
	
	public GraphProcessingStrategy getProcessingStrategy() {
		return fProcessingStrategy;
	}

}
