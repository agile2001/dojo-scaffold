package com.agile2001;

public class GameNumber {

    private final int number;

    public GameNumber(int number) {
        this.number = number;
    }

    public String execute() {
        if (isRelatedTo(3) && isRelatedTo(5)) {
            return "FizzBuzz";
        }
        if (isRelatedTo(3)) {
            return "Fizz";
        }
        if (isRelatedTo(5)) {
            return "Buzz";
        }
        return String.valueOf(number);
    }

    private boolean isRelatedTo(int x) {
        return number % x == 0 || String.valueOf(number).contains(String.valueOf(x));
    }
}
