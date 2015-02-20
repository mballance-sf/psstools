/****************************************************************************
 * axi4_reg_rw_translator.svh
 ****************************************************************************/

// Forward declarations
typedef class axi4_reg_rw_translator_axi_if_impl;
typedef class reg_rw_if;
typedef class axi_if;
	
/**
 * Class: axi4_reg_rw_translator
 * 
 * TODO: Add class documentation
 */
class axi4_reg_rw_translator extends pss_graph;
	pss_export #(reg_rw_if)			reg_ifm;
	pss_port #(axi_if)				axi;
	
	axi4_reg_rw_translator_axi_if_impl			axi_impl;

	function new(string name, pss_graph parent);
		super.new(name, parent);
	endfunction

	virtual function void build();
		reg_ifm = new("reg_ifm", this);
		axi = new("axi", this);
		
		axi_impl = new("axi_impl", this);
	endfunction
	
	virtual function void connect();
	endfunction

endclass

class axi4_reg_rw_translator_read_reg extends pss_graph;
	rand axi4_trans_req		read_trans;
	axi4_trans_rsp			read_rsp;
	
	// traversal parameters
	int 					read_addr;
	int						read_data;
	
	// Handle to container
	axi4_reg_rw_translator		container_h;
	
	constraint c {
//		read_trans.burst <= 2;
	}
	
	constraint read_c { // dynamic
		read_trans.axi_addr == read_addr;
		read_trans.is_write == 0;
	}
	
	function new(string name, pss_graph parent);
		super.new(name, parent);
	endfunction
	
	virtual function void build();
		pss_graph container = m_parent.m_parent;
		$cast(container_h, container);
		
		read_trans = new;
		read_rsp = new;
	endfunction
	
	task read_reg(int p_read_addr, output int p_read_data);
		// Initialize dynamic constraints
		read_c.constraint_mode(0);
		
		// Propagate input parameters
		read_addr = p_read_addr;
		
		// Graph procedure
		// traverse dynamic constraint
		read_c.constraint_mode(1);
	
		// Must perform lookahead to determine how many members to randomize
		assert(this.randomize(read_trans) with {
				// Incorporate inline constraints
				// inline
				read_trans.is_write == 0;
				1;
			});
		
		container_h.axi.ifc.start_axi_trans(read_trans);
		container_h.axi.ifc.finish_axi_trans(read_rsp);
			
		read_data = read_rsp.axi_read_data;
	
		// Propagate output parameters back
		p_read_data = read_data; 
	endtask
		
endclass

class axi4_reg_rw_translator_write_reg extends pss_graph;
	// Handle to container
	axi4_reg_rw_translator		container_h;
	
	// 
	rand axi4_trans_req			write_trans;
	axi4_trans_rsp				write_rsp;
	
	// Traversal parameters
	int							write_addr;
	int							write_data;
	
	function new(string name, pss_graph parent);
		super.new(name, parent);
	endfunction
	
	virtual function void build();
		pss_graph container = m_parent.m_parent;
		$cast(container_h, container);
	endfunction

	constraint write_c { // dynamic
		write_trans.axi_addr == write_addr;
		write_trans.is_write == 1;
	}
	
	task write_reg(int write_addr, int write_data);
		// Disable dynamic constraints
		write_c.constraint_mode(0);
	
		// Graph procedure
		write_c.constraint_mode(1);
		assert(this.randomize(write_trans) with {
				1; 
				});
	
		
	endtask
	
endclass

class axi4_reg_rw_translator_axi_if_impl extends pss_graph;
	// Handle to container
	axi4_reg_rw_translator		container_h;
	
	function new(string name, pss_graph parent);
		super.new(name, parent);
	endfunction
	
	virtual function void build();
		pss_graph container = m_parent.m_parent;
		$cast(container_h, container);
	endfunction
	
endclass
