package net.sf.psstools.lang.elaborator;

public class DataTypeScalar extends DataType {
	
	enum ScalarType {
		Int,
		Bit
	}
	
	private ScalarType				fScalarType;
	private boolean					fIsSigned;
	
	public DataTypeScalar() {
		super(DataType.Type.Scalar);
	}
	
	public void setScalarType(DataTypeScalar.ScalarType type) {
		fScalarType = type;
	}
	
	public DataTypeScalar.ScalarType getScalarType() {
		return fScalarType;
	}
	
	public boolean isSigned() {
		return fIsSigned;
	}
	
	public void setIsSigned(boolean is) {
		fIsSigned = is;
	}

}
