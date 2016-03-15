/*
 * pss_action.h
 *
 *  Created on: Mar 2, 2016
 *      Author: ballance
 */

#ifndef PSI_ACTION_H_
#define PSI_ACTION_H_

#include "psi_struct.h"


namespace psi {

	/**
	 * \class action_c
	 * Basics of the action class
	 *
	 */
	class action_c : public struct_c {
		public:
			virtual ~action_c() {}

			/**
			 * Returns whether this is an abstract action
			 */
			virtual bool is_abstract() = 0;

			/**
			 * Specifies whether this action is abstract
			 */
			virtual void set_abstract(bool is_abstract) = 0;

			/**
			 * Returns this action's super-action (the action is extends from).
			 * Returns NULL if this action does not have a super-action
			 */
			virtual action_c *get_super() = 0;

	};

}



#endif /* PSI_ACTION_H_ */
