package org.codingdojo.kata.args;


import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.jupiter.api.Test;

public class ArgSpecTest {
    @Test
    public void should_create_arg_spec_out_of_text() {
        ArgSpec argSpec = new ArgSpec("l:boolean");
        assertThat(argSpec.label, is("l"));
        assertThat(argSpec.type, is("boolean"));
    }

    @Test
    public void should_support_literal_equality() {
        assertThat(new ArgSpec("l:boolean"), is(new ArgSpec("l:boolean")));
    }
}