/****************************************************************************
 * pss_export.svh
 ****************************************************************************/

/**
 * Class: pss_export
 * 
 * TODO: Add class documentation
 */
class pss_export #(type interface_t) extends pss_port_base;
	interface_t					ifc;

	function new(string name, pss_graph parent);
		super.new(name, parent);
	endfunction

	virtual function void connect();
	endfunction

endclass

