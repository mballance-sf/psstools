package net.sf.psstools.lang.elaborator;

public class DataField {
	protected boolean					fIsRand;
	protected String					fName;
	
	public DataField(String name) {
		fName = name;
	}
	
	public void setIsRand(boolean is_rand) { fIsRand = is_rand; }
	
	public boolean isRand() { return fIsRand; }

}
