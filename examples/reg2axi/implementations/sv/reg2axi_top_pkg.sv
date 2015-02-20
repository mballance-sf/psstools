/****************************************************************************
 * reg2axi_top_pkg.sv
 ****************************************************************************/

/**
 * Package: reg2axi_top_pkg
 * 
 * TODO: Add package documentation
 */
package reg2axi_top_pkg;
	import pss_stdlib_pkg::*;
	
	`include "axi_if.svh"
	`include "axi4_reg_rw_translator.svh"
	`include "axi4_trans_req.svh"
	`include "axi4_trans_rsp.svh"
	`include "reg_rw_if.svh"
	`include "reg2axi_top.svh"

endpackage

