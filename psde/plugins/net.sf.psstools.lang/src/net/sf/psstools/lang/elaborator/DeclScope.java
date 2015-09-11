package net.sf.psstools.lang.elaborator;

import java.util.ArrayList;
import java.util.List;

import net.sf.psstools.lang.elaborator.DataType.Type;
import net.sf.psstools.lang.pSS.type_identifier;

public class DeclScope implements IDeclScope {
	private List<DataType>					fTypeDecl;
	private List<DataField>					fFields;
	
	public DeclScope() {
		fTypeDecl = new ArrayList<>();
		fFields = new ArrayList<>();
	}

	@Override
	public DataField findVariable(String name) {
		for (DataField f : fFields) {
			if (f.getName().equals(name)) {
				return f;
			}
		}
		return null;
	}

	@Override
	public void addVariable(DataField field) {
		fFields.add(field);
	}

	@Override
	public DataType findType(type_identifier name) {
		DataType t = null;
		
		for (DataType dt : fTypeDecl) {
			if (dt.getType() == Type.Struct) {
				if (((DataTypeStruct)dt).getName().equals(name)) {
					t = dt;
					break;
				}
			} else if (dt.getType() == Type.Graph) {
				// TODO:
			} else if (dt.getType() == Type.UserDefined) {
			}
		}
		return t;
	}

	@Override
	public void addType(DataType type) {
		fTypeDecl.add(type);
	}

}
