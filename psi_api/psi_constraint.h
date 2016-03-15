/*
 * psi_constraint.h
 *
 *  Created on: Mar 3, 2016
 *      Author: ballance
 */

#ifndef PSI_CONSTRAINT_H_
#define PSI_CONSTRAINT_H_
#include "psi_expr.h"
#include <vector>

namespace psi {

	typedef enum {
		CONSTRAINT_SET,
		CONSTRAINT_IF_STMT
	} constraint_type_e;

	class constraint_stmt_c {

		public:
			virtual ~constraint_stmt_c() {}

			virtual constraint_type_e get_type() = 0;

	};

	class constraint_if_stmt_c : public virtual constraint_stmt_c {

		public:

			virtual ~constraint_if_stmt_c() { }

			virtual expr_c *get_cond_expr() = 0;

			virtual constraint_stmt_c *get_true() = 0;

			virtual constraint_stmt_c *get_false() = 0;

	};

	class constraint_set_c : public virtual constraint_stmt_c {
		public:
			virtual ~constraint_set_c() { }

			virtual void add_constraint_stmt(constraint_stmt_c *c) = 0;

			const std::vector<constraint_stmt_c *> &get_constraint_stmts() = 0;
	};

	class constraint_block_c {

		public:
			virtual ~constraint_block_c() { }

			const std::string &get_name() = 0;

			virtual bool is_anonymous() = 0;

			virtual bool is_dynamic() = 0;

			virtual constraint_set_c *get_constraint_set() = 0;

	};

}



#endif /* PSI_CONSTRAINT_H_ */
