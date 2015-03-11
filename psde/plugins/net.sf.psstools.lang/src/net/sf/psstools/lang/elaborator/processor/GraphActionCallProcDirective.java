package net.sf.psstools.lang.elaborator.processor;

import java.util.ArrayList;
import java.util.List;

import net.sf.psstools.lang.elaborator.expr.PSSExpr;

public class GraphActionCallProcDirective extends GraphProcDirective {
	private String						fActionPath;
	private List<PSSExpr>				fParameters;
	
	
	public GraphActionCallProcDirective(String action_path) {
		super(GraphProcDirectiveType.ActionCall);
		fParameters = new ArrayList<PSSExpr>();
		fActionPath = action_path;
	}
	
	public String getActionPath() {
		return fActionPath;
	}
	
	public List<PSSExpr> getParameters() {
		return fParameters;
	}
	
	public void addParameter(PSSExpr p) {
		fParameters.add(p);
	}
	
	public void addParameters(List<PSSExpr> parameters) {
		fParameters.addAll(parameters);
	}

}
