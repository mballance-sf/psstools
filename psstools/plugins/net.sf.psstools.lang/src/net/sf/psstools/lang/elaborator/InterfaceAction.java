package net.sf.psstools.lang.elaborator;

import java.util.ArrayList;
import java.util.List;

public class InterfaceAction {
	private String						fName;
	private List<ActionParameter>		fParameters;

	public InterfaceAction(String name) {
		fName = name;
		fParameters = new ArrayList<ActionParameter>();
	}
	
	public String getName() {
		return fName;
	}
	
	public void addParameter(ActionParameter p) {
		fParameters.add(p);
	}
	
	public List<ActionParameter> getParameters() {
		return fParameters;
	}

}
