/*
 * psi_package.h
 *
 *  Created on: Mar 3, 2016
 *      Author: ballance
 */

#ifndef PSI_PACKAGE_H_
#define PSI_PACKAGE_H_
#include <string>
#include "psi_enum_type.h"
#include "psi_struct.h"

namespace psi {

	class package_c {
		public:

			virtual ~package_c() { }

			virtual void add(enum_type_c *enum_type) = 0;

			virtual void add(struct_c *struct_type) = 0;

	};

}


#endif /* PSI_PACKAGE_H_ */
