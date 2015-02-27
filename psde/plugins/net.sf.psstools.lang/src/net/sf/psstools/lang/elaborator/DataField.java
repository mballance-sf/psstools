package net.sf.psstools.lang.elaborator;

public class DataField {
	protected String					fName;
	protected boolean					fIsRand;
	
	public DataField(String name) {
		fName = name;
	}
	
	public String getName() {
		return fName;
	}
	
	public void setIsRand(boolean is_rand) { fIsRand = is_rand; }
	
	public boolean isRand() { return fIsRand; }

}
