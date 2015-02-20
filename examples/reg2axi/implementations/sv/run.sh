#!/bin/sh

. $HOME/.bashrc

vsim -c -do "run 1000; quit -f" reg2axi
