/****************************************************************************
 * reg_accessor.svh
 ****************************************************************************/

// Forward references
typedef class reg_rw_if;

/**
 * Class: reg_accessor
 * 
 * TODO: Add class documentation
 */
class reg_accessor extends pss_graph;
	pss_port #(reg_rw_if)		reg_if;
	
	// Graph-local variables
	rand int addr;
	rand int data;
	int data_in;

	function new(string name, pss_graph parent);
		super.new(name, parent);
	endfunction
	
	/**
	 * Function: build
	 *
	 * Override from class 
	 */
	virtual function void build();
		reg_if = new("reg_if", this);
	endfunction

	/**
	 * Function: connect
	 *
	 * Override from class 
	 */
	virtual function void connect();

	endfunction

	
	task reg_accessor();
		forever begin
			assert(this.randomize(addr, data) with {
					1;
					});

			// Branch selection
			randcase
				1: begin
					reg_if.ifc.write_reg(addr, data);
				end
				
				1: begin
					reg_if.ifc.read_reg(addr, data_in);
				end
			endcase
		end
	endtask


endclass

