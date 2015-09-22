package net.sf.psstools.lang.elaborator;

import net.sf.psstools.lang.pSS.type_identifier;

public interface IDeclScope {
	
	public DataField findVariable(String name);
	
	public void addVariable(DataField field);
	
	public DataType findType(type_identifier name);
	
	public void addType(DataType type);

}
