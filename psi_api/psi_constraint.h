/*
 * psi_constraint.h
 *
 *  Created on: Mar 3, 2016
 *      Author: ballance
 */

#ifndef PSI_CONSTRAINT_H_
#define PSI_CONSTRAINT_H_
#include "psi_expr.h"

namespace psi {

	class constraint_stmt_c {

		public:
			virtual ~constraint_stmt_c() {}

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
	};

	class constraint_c {
		public:

			virtual ~constraint_c() { }



	};

}




#endif /* PSI_CONSTRAINT_H_ */
