/****************************************************************************
 * reg2axi.sv
 ****************************************************************************/

/**
 * Module: reg2axi
 * 
 * TODO: Add module documentation
 */
module reg2axi;
	import pss_stdlib_pkg::*;
	import reg2axi_top_pkg::*;
	
	class axi_if_impl extends axi_if;

		/**
		 * Task: finish_axi_trans
		 *
		 * Override from class 
		 */
		virtual task finish_axi_trans(axi4_trans_rsp rsp);
			$display("finish_axi_trans");
			#1;
		endtask

		/**
		 * Task: start_axi_trans
		 *
		 * Override from class 
		 */
		virtual task start_axi_trans(input axi4_trans_req req);
			$display("start_axi_trans: %s", (req.is_write)?"WRITE":"READ");
			#1;
		endtask
		
	endclass
	
	initial begin
		axi_if_impl					axi_impl;
		automatic reg2axi_top		reg2axi_graph;
	
		reg2axi_graph = new("reg2axi_graph");
		axi_impl = new;
		
		pss_graph::do_build(reg2axi_graph);
		
		// Connect interface implementation
		pss_graph::do_connect(reg2axi_graph);
		
		reg2axi_graph.env_if.connect(axi_impl);
		
		reg2axi_graph.reg2axi_top();
	end

endmodule

