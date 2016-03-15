/*
 * psi_context.h
 *
 *  Created on: Mar 3, 2016
 *      Author: ballance
 */

#ifndef PSI_CONTEXT_H_
#define PSI_CONTEXT_H_
#include <string>
#include <vector>

#include "psi_expr.h"
#include "psi_base.h"
#include "psi_package.h"
#include "psi_struct.h"
#include "psi_action.h"
#include "psi_component.h"
#include "psi_enum_type.h"
#include "psi_import_pkg_stmt.h"

namespace psi {

	class context_c : public virtual expr_factory_c {
		public:
			virtual ~context_c() { }


			inline iterator<package_c> get_packages() {
				return iterator<package_c>(get_packages_i());
			}

			inline iterator<component_c> get_components() {
				return iterator<component_c>(get_components_i());
			}

			/**
			 * Returns the global package. This package will always exist
			 */
			virtual package_c *get_global_package() = 0;

			virtual package_c *mk_package(const std::string &name) = 0;

			virtual import_pkg_stmt_c *mk_import_stmt(
					const std::vector<std::string>		&path,
					bool								is_wildcard=false) = 0;

			virtual component_c *mk_component(
					const std::string	&name,
					component_c			*super_component=0) = 0;

			virtual struct_c *mk_struct(
					const std::string 	&name,
					struct_c			super_struct=0) = 0;

			virtual action_c *mk_action(
					const std::string	&name,
					action_c			*super_action=0,
					bool				is_abstract=false) = 0;


			virtual enum_type_h mk_enum_type(const std::string &name) = 0;

			virtual void add_package(package_c *pkg);

			virtual void add_component(component_c *pkg);

		// Internal methods
		protected:

			virtual item_iterator_c *get_packages_i() = 0;

			virtual item_iterator_c *get_components_i() = 0;

	};

	typedef context_c *context_h;
}



#endif /* PSI_CONTEXT_H_ */
