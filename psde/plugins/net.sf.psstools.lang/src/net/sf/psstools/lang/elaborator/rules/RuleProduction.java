package net.sf.psstools.lang.elaborator.rules;

public class RuleProduction {
	private RuleProductionType					fType;
	private RuleProduction						fParent;
	
	public RuleProduction(RuleProductionType type) {
		fType = type;
	}
	
	public RuleProductionType getType() { 
		return fType;
	}
	
	public RuleProduction getParent() {
		return fParent;
	}
	
	public void setParent(RuleProduction p) {
		fParent = p;
	}

}
