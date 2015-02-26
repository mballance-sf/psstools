package net.sf.psstools.lang.elaborator;

public class ScalarDataField extends DataField {
	private ScalarDataType				fType;
	private boolean						fIsSigned;
	private Range						fRange;
	private OpenRangeList				fInsideList;
	
	public ScalarDataField(String name) {
		super(name);
	}
	
	public void setType(ScalarDataType type) {
		fType = type;
	}
	
	public ScalarDataType getType() { return fType; }
	
	public boolean isSigned() { return fIsSigned; }
	
	public void setIsSigned(boolean is) { fIsSigned = is; }

}
