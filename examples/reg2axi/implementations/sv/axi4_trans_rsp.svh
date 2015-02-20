/****************************************************************************
 * axi4_trans_rsp.svh
 ****************************************************************************/

/**
 * Class: axi4_trans_rsp
 * 
 * TODO: Add class documentation
 */
class axi4_trans_rsp;
	rand bit[1:0]			resp;
	rand bit[31:0]			axi_read_data;

	function new();
	endfunction

endclass

