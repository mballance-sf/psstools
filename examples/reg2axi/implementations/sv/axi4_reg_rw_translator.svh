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
		
		axi_impl = new(this);
	endfunction
	
	virtual function void connect();
		// Provide implementation of reg_rw_if
		reg_ifm.ifc = axi_impl;
	endfunction

endclass

class axi4_reg_rw_translator_read_reg;
	rand axi4_trans_req		read_trans;
	axi4_trans_rsp			read_rsp;
	
	// traversal parameters
	int 					read_addr;
	int						read_data;
	
	// Handle to container
	axi4_reg_rw_translator		container;
	
	constraint c {
//		read_trans.burst <= 2;
	}
	
	constraint read_c { // dynamic
		read_trans.axi_addr == read_addr;
		read_trans.is_write == 0;
	}
	
	function new(axi4_reg_rw_translator container);
		this.container = container;
		
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
		
		container.axi.ifc.start_axi_trans(read_trans);
		container.axi.ifc.finish_axi_trans(read_rsp);
			
		read_data = read_rsp.axi_read_data;
	
		// Propagate output parameters back
		p_read_data = read_data; 
	endtask
		
endclass

class axi4_reg_rw_translator_write_reg;
		
	
	// Handle to parent
	axi4_reg_rw_translator		container;
	
	// 
	rand axi4_trans_req			write_trans;
	axi4_trans_rsp				write_rsp;
	
	// Traversal parameters
	int							write_addr;
	int							write_data;
	
	function new(axi4_reg_rw_translator container);
		this.container = container;
		
		write_trans = new;
		write_rsp = new;
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

		// TODO: write implementation
		container.axi.ifc.start_axi_trans(write_trans);
		container.axi.ifc.finish_axi_trans(write_rsp);
		
	endtask
	
endclass

class axi4_reg_rw_translator_axi_if_impl extends reg_rw_if;
	// Handle to container
	axi4_reg_rw_translator_read_reg			read_reg_impl;
	axi4_reg_rw_translator_write_reg		write_reg_impl;
	
	function new(axi4_reg_rw_translator parent);
		read_reg_impl  = new(parent);
		write_reg_impl = new(parent);
	endfunction
	
	/**
	 * Task: read_reg
	 *
	 * Override from class 
	 */
	virtual task read_reg(input int addr, output int data);
		read_reg_impl.read_reg(addr, data);
	endtask

	/**
	 * Task: write_reg
	 *
	 * Override from class 
	 */
	virtual task write_reg(input int addr, input int data);
		write_reg_impl.write_reg(addr, data);
	endtask
	
endclass
