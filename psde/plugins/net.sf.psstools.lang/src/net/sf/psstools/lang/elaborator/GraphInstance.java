package net.sf.psstools.lang.elaborator;

import java.util.ArrayList;
import java.util.List;

import net.sf.psstools.lang.elaborator.rules.RuleProduction;

public class GraphInstance {

	private String						fName;
	private List<DataField>				fDataFields;
	private RuleProduction				fRootRule;

	public GraphInstance(String name) {
		fName = name;
		fDataFields = new ArrayList<DataField>();
	}
	
	public String getName() {
		return fName;
	}
	
	public void addField(DataField field) {
		fDataFields.add(field);
	}
	
	public List<DataField> getFields() {
		return fDataFields;
	}
	
	public RuleProduction getRootRule() {
		return fRootRule;
	}
	
	public void setRootRule(RuleProduction r) {
		fRootRule = r;
	}
}
