package com.afs.tdd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FizzBuzzTest {
    FizzBuzz fizzBuzz = new FizzBuzz();
    @Test
    void should_return_the_given_number_when_countOff_given_a_normal_number(){
        //Given
        int normalNumber = 1;
        //When
        String result = fizzBuzz.countOff(normalNumber);
        //Then
        assertEquals("1", result);
    }

    @Test
    void should_return_Fizz_when_countOff_given_a_number_multiple_of_3(){
        int numberMultipleOf3 = 3;
        String result = fizzBuzz.countOff(numberMultipleOf3);
        assertEquals("Fizz", result);
    }
    @Test
    void should_return_Buzz_when_countOff_given_a_number_multiple_of_5(){
        int numberMultipleOf5 = 5;
        String result = fizzBuzz.countOff(numberMultipleOf5);
        assertEquals("Buzz", result);
    }
    void should_return_FizzBuzz_when_countOff_given_a_number_multiple_of_15(){}
}
