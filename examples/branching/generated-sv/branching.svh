package branching_pkg;

    virtual class simple_callout;

        pure virtual task callout(
                input bit signed val);
    endclass


    class branching;

        // Interface fields
        simple_callout call_if;

        // Graph fields
        rand bit signed a;
        rand bit signed b;
        rand bit signed c;
        rand bit signed d;
        rand bit signed e;
        rand bit signed f;
        rand bit signed g;
        rand bit signed h;
        rand bit signed i;
        rand bit signed j;
        rand bit signed k;


        task branching(); // TODO: support graph arguments
            begin
                int branch_id;
                assert(std::randomize(branch_id) with {branch_id inside {[0:1]};});
                case (branch_id)
                    0: branch_1_0();
                    1: branch_1_1();
                endcase
            end
        endtask


        task branch_1_0();
            assert(this.randomize(a, b, c));
        endtask


        task branch_1_1();
            assert(this.randomize(d, e, f));
        endtask




        // tostring method
        function string tostring();
            string ret;
            ret = {ret, $psprintf("  a = %0d\n", a)};
            ret = {ret, $psprintf("  b = %0d\n", b)};
            ret = {ret, $psprintf("  c = %0d\n", c)};
            ret = {ret, $psprintf("  d = %0d\n", d)};
            ret = {ret, $psprintf("  e = %0d\n", e)};
            ret = {ret, $psprintf("  f = %0d\n", f)};
            ret = {ret, $psprintf("  g = %0d\n", g)};
            ret = {ret, $psprintf("  h = %0d\n", h)};
            ret = {ret, $psprintf("  i = %0d\n", i)};
            ret = {ret, $psprintf("  j = %0d\n", j)};
            ret = {ret, $psprintf("  k = %0d\n", k)};
            return ret;
        endfunction


    endclass
endpackage
