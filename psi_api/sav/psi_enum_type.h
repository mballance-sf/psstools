/*
 * enum_type.h
 *
 *  Created on: Mar 3, 2016
 *      Author: ballance
 */

#ifndef PSI_ENUM_TYPE_H_
#define PSI_ENUM_TYPE_H_
#include <string>
#include "psi_expr.h"

namespace psi {

	class enumerator_c {
		public:
			virtual ~enumerator_c() { }

			virtual const std::string &get_name() = 0;

			virtual expr_h get_expr() = 0;
	};

	class enum_type_c {

		public:

			virtual ~enum_type_c() { }

			void add(
					const std::string 	&name,
					expr_c 				*value=0) = 0;

			inline iterator<enumerator_c> get_enumerators() {
				return iterator<enumerator_c>(get_enumerators_i());
			}

		protected:

			virtual item_iterator_c *get_enumerators_i() = 0;

	};
	typedef enum_type_c *enum_type_h;

}



#endif /* PSI_ENUM_TYPE_H_ */
