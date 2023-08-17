package com.afs.tdd;

public class FizzBuzz {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public String countOff(int number) {
        if(isMultipleOf3(number)){
            return "Fizz";
        } else if (isMultipleOf5(number)) {
            return "Buzz";
        }
        return Integer.toString(number);
    }

    public boolean isMultipleOf3(int number){
        return number%3 == 0;
    }
    public boolean isMultipleOf5(int number){
        return number%5 == 0;
    }
}