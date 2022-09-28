package com.agile2001;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NumberGameTest {

    @Test
    void should_return_数字_given_输入数字_when_运行() {
        // 3 Given
        int number = 1;
        // 2 When
        String result = new GameNumber(number).execute();
        // 1 Then
        Assertions.assertEquals("1", result);
    }

}
