package net.sf.psstools.lang.elaborator.processor;

import java.util.ArrayList;
import java.util.List;

/*
 * Collects information on points at which choices must be
 * made about how to process the graph, and what information
 * must be considered at these points
 */
public class GraphProcessingStrategy {
	
	private GraphProcDirective					fProcessingDirectives;
	
	public GraphProcessingStrategy() {
	}
	
	public void setProcessingDirectives(GraphProcDirective directive) {
		fProcessingDirectives = directive;
	}
	
	public GraphProcDirective getProcessingDirectives() {
		return fProcessingDirectives;
	}
	
}
