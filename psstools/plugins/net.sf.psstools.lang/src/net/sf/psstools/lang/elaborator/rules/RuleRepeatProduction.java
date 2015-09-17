package net.sf.psstools.lang.elaborator.rules;

public class RuleRepeatProduction extends RuleProduction {
	
	private RuleProduction				fProduction;

	public RuleRepeatProduction(RuleProduction production) {
		super(RuleProductionType.Repeat);
		fProduction = production;
	}
	
	public RuleProduction getProduction() {
		return fProduction;
	}
}
