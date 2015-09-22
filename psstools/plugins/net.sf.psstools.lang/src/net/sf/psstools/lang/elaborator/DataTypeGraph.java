package net.sf.psstools.lang.elaborator;

import net.sf.psstools.lang.elaborator.rules.RuleProduction;


public class DataTypeGraph extends DataTypeNamedScoped {
	private RuleProduction			fRoot;
	
	public DataTypeGraph(String name) {
		super(Type.Graph, name);
	}
	
	public void setRoot(RuleProduction root) {
		fRoot = root;
	}
	
	public RuleProduction getRoot() {
		return fRoot;
	}

	
}
