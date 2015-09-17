package net.sf.psstools.lang.elaborator;

public class ActionParameter {
	private ActionParameterDirection	fDirection;
	private DataType					fDataType;
	private String						fName;
	
	public ActionParameter(
			DataType	 				type, 
			ActionParameterDirection 	direction, 
			String 						name) {
		fDirection = direction;
		fDataType = type;
		fName = name;
	}
	
	public ActionParameterDirection getDirection() {
		return fDirection;
	}
	
	public void setDirection(ActionParameterDirection dir) {
		fDirection = dir;
	}
	
	public DataType getType() {
		return fDataType;
	}
	
	public String getName() {
		return fName;
	}

}
