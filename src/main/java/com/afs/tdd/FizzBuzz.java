package com.afs.tdd;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FizzBuzz {
    public String countOff(int number) {
        String message = Stream.of(
                        isMultipleOf3(number) ? "Fizz" : "",
                        isMultipleOf5(number) ? "Buzz" : "",
                        isMultipleOf7(number) ? "Whizz" : "")
                .collect(Collectors.joining());

        return !message.isEmpty() ? message : Integer.toString(number);
    }

    public boolean isMultipleOf3(int number) {
        return number % 3 == 0;
    }

    public boolean isMultipleOf5(int number) {
        return number % 5 == 0;
    }

    public boolean isMultipleOf7(int number) {
        return number % 7 == 0;
    }
}
