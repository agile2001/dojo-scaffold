package com.agile2001;

import java.util.List;
import org.approvaltests.Approvals;
import org.junit.jupiter.api.Test;

public class FizzBuzzTest {

    @Test
    void should_return__given_从1到100_when_打印FizzBuzz() throws Exception {
        FizzBuzz fizzBuzz = new FizzBuzz();
        List<String> result = fizzBuzz.getNumbers();
        Approvals.verify(String.join("\n", result));
    }
}
