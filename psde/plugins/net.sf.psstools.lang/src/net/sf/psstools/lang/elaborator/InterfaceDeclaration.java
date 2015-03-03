package net.sf.psstools.lang.elaborator;

import java.util.ArrayList;
import java.util.List;

public class InterfaceDeclaration {
	private String						fName;
	private List<InterfaceAction>		fActions;
	
	public InterfaceDeclaration(String name) {
		fName = name;
		fActions = new ArrayList<InterfaceAction>();
	}
	
	public String getName() {
		return fName;
	}
	
	public void addAction(InterfaceAction action) {
		fActions.add(action);
	}
	
	public List<InterfaceAction> getActions() {
		return fActions;
	}

}
