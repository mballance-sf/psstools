package net.sf.psstools.lang.elaborator.rules;

import net.sf.psstools.lang.elaborator.DataField;

public class RuleSeqItemRef {
	
	private String					fName;
	private RuleSeqItemRefType		fType;
	private DataField				fField;
	
	public RuleSeqItemRef(String name, RuleSeqItemRefType type) {
		fName = name;
		fType = type;
	}
	
	public String getName() {
		return fName;
	}
	
	public RuleSeqItemRefType getType() {
		return fType;
	}
	
	public void setDataField(DataField field) {
		fField = field;
	}
	
	public DataField getDataField() {
		return fField;
	}

}
