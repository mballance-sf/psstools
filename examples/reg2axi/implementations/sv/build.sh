#!/bin/sh

which_vlog=`which vlog`

if test "x$which_vlog" = "x"; then
. $HOME/.bashrc
fi

pwd=`pwd`

vlib work
vlog -sv +incdir+$pwd/pss_stdlib $pwd/pss_stdlib/pss_stdlib_pkg.sv
vlog -sv $pwd/reg2axi_top_pkg.sv
vlog -sv $pwd/reg2axi.sv
