package net.sf.psstools.lang.elaborator.expr;

public class PSSLiteralExpr extends PSSExpr {
	private String				fValue;
	
	public PSSLiteralExpr(String value) {
		super(PSSExprType.Literal);
		fValue = value;
	}
	
	public String getValue() {
		return fValue;
	}

	@Override
	public void toStringBuilder(StringBuilder sb) {
		sb.append(fValue);
	}

}
