package net.sf.psstools.lang.elaborator.rules;

import java.util.List;

import net.sf.psstools.lang.elaborator.GraphInterface;
import net.sf.psstools.lang.elaborator.InterfaceAction;

public class RuleActionCallProduction extends RuleProduction {
	private GraphInterface				fInterface;
	private InterfaceAction				fAction;
	private List<String>				fParameters;
	
	public RuleActionCallProduction(GraphInterface ifc, InterfaceAction action) {
		super(RuleProductionType.ActionCall);
		fInterface = ifc;
		fAction = action;
	}
	
	public void addParameter(String param) {
		fParameters.add(param);
	}
	
	public List<String> getParameters() {
		return fParameters;
	}

}
