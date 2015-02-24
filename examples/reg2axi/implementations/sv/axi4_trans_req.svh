/****************************************************************************
 * axi4_trans_req.svh
 ****************************************************************************/

/**
 * Class: axi4_trans_req
 * 
 * TODO: Add class documentation
 */
class axi4_trans_req;
	rand bit[31:0]			axi_addr;
	rand bit[31:0]			axi_write_data;
	rand bit				is_write;
	rand bit[3:0]			prot;
	rand bit[1:0]			lock;

	function new();
	endfunction

endclass

