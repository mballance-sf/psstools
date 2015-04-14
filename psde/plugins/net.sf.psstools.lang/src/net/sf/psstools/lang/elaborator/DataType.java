package net.sf.psstools.lang.elaborator;

public class DataType {
	
	public enum Type {
		Scalar,
		UserDefined,
		Struct,
		Symbol,
		Graph,
		Interface
	}
	
	private Type				fType;

	public DataType(DataType.Type type) {
		fType = type;
	}
	
	public DataType.Type getType() {
		return fType;
	}
	

}
