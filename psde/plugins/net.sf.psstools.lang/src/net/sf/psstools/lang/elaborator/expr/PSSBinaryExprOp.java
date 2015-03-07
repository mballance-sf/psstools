package net.sf.psstools.lang.elaborator.expr;

public enum PSSBinaryExprOp {
	LogicalAnd,
	LogicalOr,
	BinaryAnd,
	BinaryOr,
	BinaryXor,
	Eq,
	NotEq;

	String getOpStr() {
		switch (this) {
			case LogicalAnd: return "&&";
			case LogicalOr: return "||";
			case BinaryAnd: return "&";
			case BinaryOr: return "|";
			case BinaryXor: return "^";
			case Eq: return "==";
			case NotEq: return "!=";
		}
		return "" + this;
	}
}
