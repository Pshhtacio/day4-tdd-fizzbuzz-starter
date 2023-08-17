package com.afs.tdd;

public class FizzBuzz {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public String countOff(int normalNumber) {
        return normalNumber%3 == 0 ? "Fizz" : Integer.toString(normalNumber);
    }
}