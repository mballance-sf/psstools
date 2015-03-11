package net.sf.psstools.lang.elaborator.expr;

public abstract class PSSExpr {
	private PSSExprType				fType;
	
	protected PSSExpr(PSSExprType type) {
		fType = type;
	}
	
	public PSSExprType getType() {
		return fType;
	}
	
	public abstract void toStringBuilder(StringBuilder sb);

}
