/*
 * psi_expr.h
 *
 *  Created on: Mar 3, 2016
 *      Author: ballance
 */

#ifndef PSI_EXPR_H_
#define PSI_EXPR_H_


namespace psi {

	typedef enum {
		BINARY_EXPR,
		UNARY_EXPR,
		TERNARY_EXPR,
		INSIDE_EXPR
		/*
		CONDITION_EXPR,
		LOGICAL_OR_EXPR,
		LOGICAL_AND_EXPR,
		BINARY_OR_EXPR,
		BINARY_XOR_EXPR,
		BINARY_AND_EXPR,
		LOGICAL_EQUALITY_EXPR,
		LOGICAL_INEQUALITY_EXPR
		 */
	} expr_type_e;

	class expr_c {
		public:
			virtual ~expr_c() { }

			expr_type_e get_expr_type() = 0;
	};

	class ternary_expr_c : public virtual expr_c {
		public:
			virtual ~ternary_expr_c() { }

			virtual expr_c *get_cond() = 0;

			virtual expr_c *get_true_expr() = 0;

			virtual expr_c *get_false_expr() = 0;
	};

	typedef enum {
		BINOP_LOGICAL_OR,		// ||
		BINOP_LOGICAL_AND,		// &&
		BINOP_BINARY_OR,		// |
		BINOP_BINARY_XOR,		// ^
		BINOP_BINARY_AND,		// &
		BINOP_EQ,				// ==
		BINOP_NEQ,				// !=
		BINOP_LT,				// <
		BINOP_LE,				// <=
		BINOP_GT,				// >
		BINOP_GE,				// >=
		BINOP_LSHIFT,			// <<
		BINOP_RSHIFT,			// >>
		BINOP_ADD,				// +
		BINOP_SUB,				// -
		BINOP_MUL,				// *
		BINOP_DIV,				// /
		BINOP_MOD,				// %
		BINOP_EXP				// **
	} binary_expr_op_e;

	class binary_expr_c : public virtual expr_c {
		public:
			virtual ~binary_expr_c() { }

			virtual expr_c *get_lhs() = 0;

			virtual binary_expr_op_e get_op() = 0;

			virtual expr_c *get_rhs() = 0;

	};

	typedef enum {
		UNOP_PLUS,
		UNOP_MINUS,
		UNOP_NOT,
		UNOP_NEG,
		UNOP_AND,
		UNOP_OR,
		UNOP_XOR
	} unary_expr_op_e;

	class unary_expr_c : public virtual expr_c {
		public:

			virtual ~unary_expr_c() { }

			virtual unary_expr_op_e get_op() = 0;

			virtual expr_c *get_expr() = 0;
	};

	class expr_factory_c {
		public:
			virtual ~expr_factory_c() { }

			virtual ternary_expr_c *mk_ternary_expr(
					expr_c			*cond,
					expr_c			*true_expr,
					expr_c			*false_expr) = 0;

			virtual binary_expr_c *mk_binary_expr(
					expr_c					*lhs,
					binary_expr_op_e		op,
					expr_c					*rhs) = 0;

			virtual unary_expr_c *mk_unary_expr(
					unary_expr_op_e			op,
					expr_c					*expr) = 0;

	};
}



#endif /* PSI_EXPR_H_ */
