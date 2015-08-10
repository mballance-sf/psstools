package net.sf.psstools.lang.elaborator;

public interface IDeclScope {
	
	public DataField findVariable(String name);
	
	public void addVariable(DataField field);
	
	public DataType findType(String name);
	
	public void addType(DataType type);

}
