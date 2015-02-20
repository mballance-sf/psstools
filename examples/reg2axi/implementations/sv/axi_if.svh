/****************************************************************************
 * axi_if.svh
 ****************************************************************************/

// Forward declarations
typedef class axi4_trans_req;
typedef class axi4_trans_rsp;


/**
 * Class: axi_if
 * 
 * TODO: Add class documentation
 */
virtual class axi_if;

	function new();

	endfunction

	pure virtual task start_axi_trans(axi4_trans_req req);

	pure virtual task finish_axi_trans(output axi4_trans_rsp rsp);

endclass

