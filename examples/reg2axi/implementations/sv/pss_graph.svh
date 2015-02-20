/****************************************************************************
 * pss_graph.svh
 ****************************************************************************/

// Forward declarations
typedef class pss_port_base;

/**
 * Class: pss_graph
 * 
 * TODO: Add class documentation
 */
class pss_graph;
	pss_graph				m_children[$];
	pss_port_base			m_ports[$];
	
	pss_graph				m_parent;

	function new(string name, pss_graph parent);
		if (parent != null) begin
			parent.m_children.push_back(this);
		end
		m_parent = parent;
	endfunction

	virtual function void build();
	endfunction
	
	virtual function void connect();
	endfunction
	
endclass

