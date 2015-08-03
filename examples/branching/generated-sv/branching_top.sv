
module branching_top;

  import branching_pkg::*;

  class simple_callout_ext extends simple_callout;

    virtual task callout(bit signed val);
      $display("callout: %0d", val);
    endtask

  endclass

  initial begin
    automatic branching b = new;
    automatic simple_callout_ext callout_if = new;

    b.call_if = callout_if;

    repeat(10) begin
    b.branching();

    $display("Result:\n%s", b.tostring());
    end
  end

endmodule

