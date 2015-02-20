/****************************************************************************
 * pss_port_base.svh
 ****************************************************************************/

/**
 * Class: pss_port_base
 * 
 * TODO: Add class documentation
 */
class pss_port_base;

	function new(string name, pss_graph parent);
		if (parent != null) begin
			parent.m_ports.push_back(this);
		end
	endfunction

	virtual function void connect();
	endfunction

endclass

