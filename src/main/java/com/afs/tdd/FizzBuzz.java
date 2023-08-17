package com.afs.tdd;

public class FizzBuzz {
    public String countOff(int number) {
        StringBuilder message = new StringBuilder();
        if (!isMultipleOf3(number) && !isMultipleOf5(number) && !isMultipleOf7(number)) {
            return Integer.toString(number);
        }
        if (isMultipleOf3(number)) {
            message.append("Fizz");
        }
        if (isMultipleOf5(number)) {
            message.append("Buzz");
        }
        if (isMultipleOf7(number)) {
            message.append("Whizz");
        }

        return message.toString();
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