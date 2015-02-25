/****************************************************************************
 * reg_rw_if.svh
 ****************************************************************************/

/**
 * Class: reg_rw_if
 * 
 * TODO: Add class documentation
 */
virtual class reg_rw_if;

	function new();

	endfunction

	pure virtual task write_reg(input int addr, input int data);

	pure virtual task read_reg(input int addr, output int data);

endclass

