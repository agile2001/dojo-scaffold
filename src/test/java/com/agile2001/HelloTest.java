package com.agile2001;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HelloTest {

    @Test
    void should_return__given__when_Name() {
        Hello hello = new Hello();
        String result = hello.hello();
        Assertions.assertEquals("Hello", result);
    }
}
