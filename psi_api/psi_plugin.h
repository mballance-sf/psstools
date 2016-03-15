/*
 * pss_plugin.h
 *
 *  Created on: Mar 3, 2016
 *      Author: ballance
 */

#ifndef PSI_PLUGIN_H_
#define PSI_PLUGIN_H_
#include <stdint.h>
#include "psi_context.h"

namespace psi {

	typedef enum {
		PROCESS_PHASE1,
		PROCESS_PHASE2
	} process_phase_e;

	/**
	 * \brief The plugin_c class specifies the API that a PSI plug-in must implement
	 */
	class plugin_c {
		public:
			virtual ~plugin_c() {}

			/**
			 * Process the PSS model
			 *
			 * The currently-defined phases are:
			 * - 1: PSS model elements are declared using the PSI API.
			 *   The elements declared during phase1 will be available during
			 *   processing of the PSS domain-specific language files
			 *
			 * - 2: PSS model elements are declared using the PSI API.
			 *   Elements declared in the PSS domain-specific language files
			 *   are available during phase2.
			 */
			virtual void process(
					context_c			*ctxt,
					process_phase_e		phase) = 0;


	};

}



#endif /* PSI_PLUGIN_H_ */
