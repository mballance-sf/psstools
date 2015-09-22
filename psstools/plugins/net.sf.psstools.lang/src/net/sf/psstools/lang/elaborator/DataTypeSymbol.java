package net.sf.psstools.lang.elaborator;

import net.sf.psstools.lang.elaborator.rules.RuleProduction;

public class DataTypeSymbol extends DataType {
	private RuleProduction			fProduction;
	
	public DataTypeSymbol() {
		super(Type.Symbol);
	}
	
	public void setProduction(RuleProduction p) {
		fProduction = p;
	}
	
	public RuleProduction getProduction() {
		return fProduction;
	}

}
