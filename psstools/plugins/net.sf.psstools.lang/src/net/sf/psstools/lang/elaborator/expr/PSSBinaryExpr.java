package net.sf.psstools.lang.elaborator.expr;

public class PSSBinaryExpr extends PSSExpr {
	private PSSExpr				fLhs;
	private PSSExpr				fRhs;
	private PSSBinaryExprOp		fOp;
	
	public PSSBinaryExpr(PSSExpr lhs, PSSBinaryExprOp op, PSSExpr rhs) {
		super(PSSExprType.Binary);
		fLhs = lhs;
		fOp = op;
		fRhs = rhs;
	}
	
	public PSSBinaryExprOp op() {
		return fOp;
	}
	
	public PSSExpr lhs() {
		return fLhs;
	}

	public PSSExpr rhs() {
		return fRhs; 
	}

	@Override
	public void toStringBuilder(StringBuilder sb) {
		if (fLhs != null) {
			fLhs.toStringBuilder(sb);
		} else {
			sb.append("NULL");
		}
		
		sb.append(" " + fOp.getOpStr() + " ");
		
		if (fRhs != null) {
			fRhs.toStringBuilder(sb);
		} else {
			sb.append("NULL");
		}
	}
	
	
}
