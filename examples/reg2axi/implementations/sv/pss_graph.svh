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
	string					m_name;
	pss_graph				m_children[$];
	pss_port_base			m_ports[$];
	
	pss_graph				m_parent;

	function new(string name, pss_graph parent);
		if (parent != null) begin
			parent.m_children.push_back(this);
		end
		m_parent = parent;
		m_name = name;
	endfunction

	virtual function void build();
	endfunction
	
	virtual function void connect();
	endfunction
	
	static function void do_build(pss_graph g);
		int entry_size;
		$display("--> do_build %s", g.m_name);
		
		entry_size = g.m_children.size();
		
		for (int i=0; i<g.m_children.size(); i++) begin
			do_build(g.m_children[i]);
		end
		
		g.build();
	
		for (int i=entry_size; i<g.m_children.size(); i++) begin
			do_build(g.m_children[i]);
		end
		
		$display("<-- do_build %s", g.m_name);
	endfunction
	
	static function void do_connect(pss_graph g);
		for (int i=0; i<g.m_children.size(); i++) begin
			do_connect(g.m_children[i]);
		end
		g.connect();
	endfunction
	

endclass

