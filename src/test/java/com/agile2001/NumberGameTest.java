package com.agile2001;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NumberGameTest {

    @Test
    void should_return_数字_given_输入数字_when_运行() {
        // 3 Given
        int number = 1;
        // 2 When
        String expect = new GameNumber(number).execute();
        // 1 Then
        Assertions.assertEquals("1", expect);
    }

    @Test
    void should_return_数字2_given_输入数字2_when_运行() {
        Assertions.assertEquals("2", new GameNumber(2).execute());
    }

    @Test
    void should_return_Fizz_given_被3整除_when_运行() {
        Assertions.assertEquals("Fizz", new GameNumber(3).execute());
        Assertions.assertEquals("Fizz", new GameNumber(6).execute());
    }

    @Test
    void should_return_Fizz_given_包含3_when_运行() {
        Assertions.assertEquals("Fizz", new GameNumber(13).execute());
    }

    @Test
    void should_return_Buzz_given_被5整除_when_运行() {
        Assertions.assertEquals("Buzz", new GameNumber(5).execute());
        Assertions.assertEquals("Buzz", new GameNumber(10).execute());
    }


    @Test
    void should_return_Buzz_given_包含5_when_运行() {
        Assertions.assertEquals("Buzz", new GameNumber(58).execute());
    }

    @Test
    void should_return_FizzBuzz_given_同时被3和5整除_when_运行() {
        Assertions.assertEquals("FizzBuzz", new GameNumber(15).execute());
    }

    @Test
    void should_return_FizzBuzz_given_同时包含3和5_when_运行() {
        Assertions.assertEquals("FizzBuzz", new GameNumber(53).execute());
        Assertions.assertEquals("FizzBuzz", new GameNumber(35).execute());
    }

}
