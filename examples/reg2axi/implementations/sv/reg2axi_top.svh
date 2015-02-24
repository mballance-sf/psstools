/****************************************************************************
 * reg2axi_top.svh
 ****************************************************************************/

// Forward declarations
typedef class reg_rw_if;
typedef class reg_accessor;
typedef class axi4_reg_rw_translator;

/**
 * Class: reg2axi_top
 * 
 * TODO: Add class documentation
 */
class reg2axi_top extends pss_graph;
	pss_port #(axi_if)				env_if;
	
	// Ignore override for now
//	reg_rw_if						reg2xlator_if;
	reg_accessor					reg_acc;
	axi4_reg_rw_translator			xlator;
	
	function new(string name="rg2axi_top");
		// Root graph doesn't have a parent
		super.new(name, null);
	endfunction
	
	/**
	 * Function: build
	 *
	 * Override from class 
	 */
	virtual function void build();
//		reg2xlator_if = new("reg2xlator_if", this);
		reg_acc = new("reg_acc", this);
		xlator = new("xlator", this);
		env_if = new("env_if", this);
	endfunction

	/**
	 * Function: connect
	 *
	 * Override from class 
	 */
	virtual function void connect();
		reg_acc.reg_if.connect(xlator.reg_ifm.ifc);
		// Implmentation will come from the outside
		env_if.sub = xlator.axi;
	endfunction

	
	
	task reg2axi_top();
		reg_acc.reg_accessor();
	endtask


endclass

