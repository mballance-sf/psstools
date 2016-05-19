
#ifndef PSI_STRUCT_H_
#define PSI_STRUCT_H_
#include "psi_named_item.h"

namespace psi {

	class struct_c : public virtual named_item {

		public:

			virtual ~struct_c() { }

			virtual struct_c *get_super() = 0;

//			virtual void add_field(field_hndl *hndl) = 0;
	};


}

#endif /* PSI_STRUCT_H_ */
