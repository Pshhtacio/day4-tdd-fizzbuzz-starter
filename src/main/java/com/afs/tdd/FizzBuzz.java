package com.afs.tdd;

public class FizzBuzz {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public String countOff(int number) {
        StringBuilder message = new StringBuilder();
        if (!isMultipleOf3(number) && !isMultipleOf5(number)) {
            message.append(Integer.toString(number));
        }
        if(isMultipleOf3(number)){
            message.append("Fizz");
        }
        if (isMultipleOf5(number)){
            message.append("Buzz");
        }
        return message.toString();
    }

    public boolean isMultipleOf3(int number){
        return number%3 == 0;
    }
    public boolean isMultipleOf5(int number){
        return number%5 == 0;
    }
}