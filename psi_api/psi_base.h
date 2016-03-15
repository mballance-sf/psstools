/*
 * psi_base.h
 *
 *  Created on: Mar 3, 2016
 *      Author: ballance
 */

#ifndef PSI_BASE_H_
#define PSI_BASE_H_

namespace psi {

	typedef enum {
		ITEM_PACKAGE,
		ITEM_ACTION,
		ITEM_COMPONENT,

	} item_type_e;

	class item_base_c {


	};

	class named_item_c {

	};

	class item_iterator_c {
		public:

			virtual ~item_iterator_c() { }

			virtual bool has_next() = 0;

			virtual item_base_c *next() = 0;

			virtual void dispose() = 0;
	};

	template <class T> class iterator {
		private:
			item_iterator_c			*m_it;

		public:

			iterator(item_iterator_c *it) {
				m_it = it;
			}

			~iterator() {
				if (m_it) {
					m_it->dispose();
				}
				m_it = 0;
			}

			inline bool has_next() {
				if (m_it != 0) {
					if (m_it->has_next()) {
						return true;
					} else {
						m_it->dispose();
						m_it = 0;
					}
				}
				return false;
			}

			inline T *next() {
				if (m_it != 0) {
					return static_cast<T *>(m_it->next());
				} else {
					return 0;
				}
			}
	};
}


#endif /* PSI_BASE_H_ */
