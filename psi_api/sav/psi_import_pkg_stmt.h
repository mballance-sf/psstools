/*
 * psi_import_pkg.h
 *
 *  Created on: Mar 14, 2016
 *      Author: ballance
 */

#ifndef PSI_IMPORT_PKG_STMT_H_
#define PSI_IMPORT_PKG_STMT_H_
#include <string>
#include <vector>

namespace psi {

	class import_pkg_stmt_c {
		public:
			virtual ~import_pkg_stmt_c() { }

			virtual const std::vector<std::string> &get_path() = 0;

			virtual bool is_wildcard() = 0;

	};
}




#endif /* PSI_IMPORT_PKG_STMT_H_ */
