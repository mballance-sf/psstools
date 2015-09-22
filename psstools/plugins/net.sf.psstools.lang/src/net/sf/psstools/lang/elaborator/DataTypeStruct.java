package net.sf.psstools.lang.elaborator;

import java.util.ArrayList;
import java.util.List;

import net.sf.psstools.lang.pSS.type_identifier;

public class DataTypeStruct extends DataType implements IDeclScope {
	private String					fName;
	private List<DataField>			fFields;
	private DataTypeStruct			fSuperStruct;
	
	public DataTypeStruct(String name) {
		super(DataType.Type.Struct);
		fName = name;
		fFields = new ArrayList<DataField>();
	}
	
	public String getName() {
		return fName;
	}
	
	public DataTypeStruct getSuper() {
		return fSuperStruct;
	}
	
	public void setSuper(DataTypeStruct s) {
		fSuperStruct = s;
	}
	
	public List<DataField> getFields() {
		return fFields;
	}
	
	public void addField(DataField field) {
		fFields.add(field);
	}

	@Override
	public DataField findVariable(String name) {
		for (DataField f : fFields) {
			if (f.getName().equals(name)) {
				return f;
			}
		}
		
		if (fSuperStruct != null) {
			return fSuperStruct.findVariable(name);
		}
		return null;
	}

	@Override
	public void addVariable(DataField field) {
		fFields.add(field);
	}

	@Override
	public DataType findType(type_identifier name) { return null; }

	@Override
	public void addType(DataType type) { }

	
}
