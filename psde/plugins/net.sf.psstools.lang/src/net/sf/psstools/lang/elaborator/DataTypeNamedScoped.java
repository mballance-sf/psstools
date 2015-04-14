package net.sf.psstools.lang.elaborator;

public class DataTypeNamedScoped extends DataTypeNamed implements IDeclScope {
	private DeclScope				fScope;
	private DataType				fSuper;
	
	public DataTypeNamedScoped(Type type, String name) {
		super(type, name);
		fScope = new DeclScope();
	}
	
	public DataType getSuper() {
		return fSuper;
	}
	
	public void setSuper(DataType s) {
		fSuper = s;
	}
	
	@Override
	public DataField findVariable(String name) {
		DataField ret = null;
		
		if ((ret = fScope.findVariable(name)) != null) {
			return ret;
		}
	
		if (fSuper != null && fSuper instanceof IDeclScope) {
			ret = ((IDeclScope)fSuper).findVariable(name);
		}
	
		return ret;
	}

	@Override
	public void addVariable(DataField field) {
		fScope.addVariable(field);
	}

	@Override
	public DataType findType(String name) {
		DataType type = null;
		
		if ((type = fScope.findType(name)) != null) {
			return type;
		}
		
		if (fSuper != null && fSuper instanceof IDeclScope) {
			type = ((IDeclScope)fSuper).findType(name);
		}
		
		return type;
	}

	@Override
	public void addType(DataType type) {
		fScope.addType(type);
	}

}
