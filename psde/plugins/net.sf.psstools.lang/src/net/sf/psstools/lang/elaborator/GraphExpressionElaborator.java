package net.sf.psstools.lang.elaborator;

import net.sf.psstools.lang.elaborator.expr.PSSBinaryExpr;
import net.sf.psstools.lang.elaborator.expr.PSSBinaryExprOp;
import net.sf.psstools.lang.elaborator.expr.PSSExpr;
import net.sf.psstools.lang.elaborator.expr.PSSLiteralExpr;
import net.sf.psstools.lang.elaborator.expr.PSSVariableRefExpr;
import net.sf.psstools.lang.pSS.binary_and_expr;
import net.sf.psstools.lang.pSS.binary_or_expr;
import net.sf.psstools.lang.pSS.binary_xor_expr;
import net.sf.psstools.lang.pSS.expression;
import net.sf.psstools.lang.pSS.hierarchical_id;
import net.sf.psstools.lang.pSS.literal;
import net.sf.psstools.lang.pSS.logical_and_expr;
import net.sf.psstools.lang.pSS.logical_equality_expr;
import net.sf.psstools.lang.pSS.logical_or_expr;
import net.sf.psstools.lang.pSS.primary;
import net.sf.psstools.lang.pSS.variable_ref;
import net.sf.psstools.lang.services.PSSGrammarAccess.PrimaryElements;

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
		} else if (expr instanceof variable_ref) {
			variable_ref ref = (variable_ref)expr;
			ret = new PSSVariableRefExpr(
					elaborate_hierarchical_id(ref.getExpr()),
					(ref.getLhs() != null)?elaborate(ref.getLhs()):null,
					(ref.getRhs() != null)?elaborate(ref.getRhs()):null);
		} else if (expr instanceof literal) {
			ret = new PSSLiteralExpr("" + ((literal)expr).getValue());
		} else {
			System.out.println("Unhandled expr: " + expr);
		}
		return ret;
	}

	private String elaborate_hierarchical_id(hierarchical_id id) {
		return id.getValue();
	}
}
