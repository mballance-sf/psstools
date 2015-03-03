package net.sf.psstools.lang.elaborator;

import net.sf.psstools.lang.elaborator.expr.PSSBinaryExpr;
import net.sf.psstools.lang.elaborator.expr.PSSBinaryExprOp;
import net.sf.psstools.lang.elaborator.expr.PSSExpr;
import net.sf.psstools.lang.pSS.binary_and_expr;
import net.sf.psstools.lang.pSS.binary_or_expr;
import net.sf.psstools.lang.pSS.binary_xor_expr;
import net.sf.psstools.lang.pSS.expression;
import net.sf.psstools.lang.pSS.logical_and_expr;
import net.sf.psstools.lang.pSS.logical_equality_expr;
import net.sf.psstools.lang.pSS.logical_or_expr;

public class GraphExpressionElaborator {
	
	public PSSExpr elaborate(expression expr) {
		PSSExpr ret = null;
		
		if (expr instanceof logical_and_expr) {
			ret = new PSSBinaryExpr(
					elaborate(((logical_and_expr)expr).getLeft()),
					PSSBinaryExprOp.LogicalAnd,
					elaborate(((logical_and_expr)expr).getRight()));
		} else if (expr instanceof logical_or_expr) {
			ret = new PSSBinaryExpr(
					elaborate(((logical_or_expr)expr).getLeft()),
					PSSBinaryExprOp.LogicalOr,
					elaborate(((logical_or_expr)expr).getRight()));
		} else if (expr instanceof binary_or_expr) {
			ret = new PSSBinaryExpr(
					elaborate(((binary_or_expr)expr).getLeft()),
					PSSBinaryExprOp.BinaryOr,
					elaborate(((binary_or_expr)expr).getRight()));
		} else if (expr instanceof binary_and_expr) {
			ret = new PSSBinaryExpr(
					elaborate(((binary_and_expr)expr).getLeft()),
					PSSBinaryExprOp.BinaryAnd,
					elaborate(((binary_and_expr)expr).getRight()));
		} else if (expr instanceof binary_xor_expr) {
			ret = new PSSBinaryExpr(
					elaborate(((binary_xor_expr)expr).getLeft()),
					PSSBinaryExprOp.BinaryXor,
					elaborate(((binary_xor_expr)expr).getRight()));
		} else if (expr instanceof logical_equality_expr) {
			ret = new PSSBinaryExpr(
					elaborate(((logical_equality_expr)expr).getLeft()),
					(((logical_equality_expr)expr).getOp().equals("=="))?PSSBinaryExprOp.Eq:PSSBinaryExprOp.NotEq,
					elaborate(((logical_equality_expr)expr).getRight()));
		} else {
			
		}
		return ret;
	}

}
