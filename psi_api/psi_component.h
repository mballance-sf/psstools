/*
 * psi_component.h
 *
 *  Created on: Mar 3, 2016
 *      Author: ballance
 */

#ifndef PSI_COMPONENT_H_
#define PSI_COMPONENT_H_
#include "psi_named_item.h"
#include "psi_struct.h"

namespace psi {

	class component_c : public virtual named_item_c {
		public:

			virtual ~component_c() { }

			void add_struct(struct_c *struct_decl) = 0;

	};

}




#endif /* PSI_COMPONENT_H_ */
