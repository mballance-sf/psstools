package net.sf.psstools.lang.elaborator;

public class RuleProduction {
	private RuleProductionType					fType;
	
	public RuleProduction(RuleProductionType type) {
		fType = type;
	}
	
	public RuleProductionType getType() { 
		return fType;
	}

}
