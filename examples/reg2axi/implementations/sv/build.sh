#!/bin/sh

. $HOME/.bashrc

pwd=`pwd`

vlib work
vlog -sv $pwd/pss_stdlib_pkg.sv
vlog -sv $pwd/reg2axi_top_pkg.sv
vlog -sv $pwd/reg2axi.sv
