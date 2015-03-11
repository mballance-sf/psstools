package net.sf.psstools.lang.elaborator.expr;

public class PSSVariableRefExpr extends PSSExpr {
	private String					fVar;
	private PSSExpr					fLhs;
	private PSSExpr					fRhs;
	
	public PSSVariableRefExpr(String var, PSSExpr lhs, PSSExpr rhs) {
		super(PSSExprType.VariableRef);
		fVar = var;
		fLhs = lhs;
		fRhs = rhs;
	}

	@Override
	public void toStringBuilder(StringBuilder sb) {
		sb.append(fVar);
		if (fLhs != null) {
			sb.append("[");
			fLhs.toStringBuilder(sb);
			
			if (fRhs != null) {
				sb.append(":");
				fRhs.toStringBuilder(sb);
			}
			sb.append("]");
		}
	}

}
