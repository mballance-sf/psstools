package net.sf.psstools.lang.elaborator;

public class DataTypeNamed extends DataType {
	private String				fName;
	
	public DataTypeNamed(Type type, String name) {
		super(type);
		fName = name;
	}
	
	public String getName() {
		return fName;
	}
	
	public void setName(String name) {
		fName = name;
	}

}
