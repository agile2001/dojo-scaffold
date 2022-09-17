package com.agile2001;

import com.google.common.base.Strings;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FizzBuzz {

    public static void main(String[] args) {
        new FizzBuzz().execute();
    }

    protected void print(List<String> execute) {
        System.out.println(String.join("\n", execute));
    }

    public void execute() {
        List<String> numbers = getNumbers();
        print(numbers);
    }

    protected List<String> getNumbers() {
        return IntStream.rangeClosed(1, 100)
            .mapToObj(item -> new GameNumber(item).execute())
            .collect(Collectors.toList());
    }
}
