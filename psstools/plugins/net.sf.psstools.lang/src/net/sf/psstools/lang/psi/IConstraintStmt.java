package net.sf.psstools.lang.psi;

public interface IConstraintStmt {
	
	enum Type {
		CONSTRAINT_SET,
		CONSTRAINT_IF_STMT		
	}

	IConstraintStmt.Type getType();
}
