package net.sf.psstools.lang.elaborator;

public class DataField {
	protected String					fName;
	protected boolean					fIsRand;
	protected DataType					fType;
	
	public DataField(DataType type, String name) {
		fType = type;
		fName = name;
	}
	
	public DataType getType() {
		return fType;
	}
	
	public String getName() {
		return fName;
	}
	
	public void setIsRand(boolean is_rand) { fIsRand = is_rand; }
	
	public boolean isRand() { return fIsRand; }
	
}
