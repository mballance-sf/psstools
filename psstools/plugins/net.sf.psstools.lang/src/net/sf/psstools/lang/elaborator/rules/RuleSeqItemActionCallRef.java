package net.sf.psstools.lang.elaborator.rules;

import java.util.ArrayList;
import java.util.List;

import net.sf.psstools.lang.elaborator.expr.PSSExpr;

public class RuleSeqItemActionCallRef extends RuleSeqItemRef {
	private String				fActionName;
	private List<PSSExpr>		fParameters;
//	private List<E>
	
	public RuleSeqItemActionCallRef(String ifc, String action) {
		super(ifc, RuleSeqItemRefType.ActionCall);
		fActionName = action;
		fParameters = new ArrayList<PSSExpr>();
	}
	
	public String getActionName() {
		return fActionName;
	}
	
	public void addParameter(PSSExpr expr) {
		fParameters.add(expr);
	}

	public List<PSSExpr> getParameters() {
		return fParameters;
	}
}
