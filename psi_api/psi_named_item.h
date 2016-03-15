/*
 * psi_named_item.h
 *
 *  Created on: Mar 14, 2016
 *      Author: ballance
 */

#ifndef PSI_NAMED_ITEM_H_
#define PSI_NAMED_ITEM_H_
#include <string>

namespace psi {

	class named_item {
		public:

			virtual ~named_item() { }

			const std::string &get_name() = 0;
	};

}




#endif /* PSI_NAMED_ITEM_H_ */
