/****************************************************************************
 * pss_port.svh
 ****************************************************************************/

/**
 * Class: pss_port
 * 
 * TODO: Add class documentation
 */
class pss_port #(type interface_t) extends pss_port_base;
	interface_t							ifc;
	pss_port #(interface_t)				sub;

	function new(string name, pss_graph parent);
		super.new(name, parent);
	endfunction
	
	function void connect(interface_t ifc);
		this.ifc = ifc;
		if (sub != null) begin
			sub.connect(ifc);
		end
	endfunction
	

endclass

