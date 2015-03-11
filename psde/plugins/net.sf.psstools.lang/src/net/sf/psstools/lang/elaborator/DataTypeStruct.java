package net.sf.psstools.lang.elaborator;

import java.util.List;

public class DataTypeStruct extends DataType {
	private String					fName;
	private List<DataField>			fFields;
	
	public DataTypeStruct(String name) {
		super(DataType.Type.Struct);
		fName = name;
	}
	
	public String getName() {
		return fName;
	}
	
	public List<DataField> getFields() {
		return fFields;
	}
	
	public void addField(DataField field) {
		fFields.add(field);
	}

}
