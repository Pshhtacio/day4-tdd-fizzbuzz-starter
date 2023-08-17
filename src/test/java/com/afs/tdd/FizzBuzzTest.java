package com.afs.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {
    FizzBuzz fizzBuzz = new FizzBuzz();

    @Test
    void should_return_the_given_number_when_countOff_given_a_normal_number() {
        //Given
        int normalNumber = 1;
        //When
        String result = fizzBuzz.countOff(normalNumber);
        //Then
        assertEquals("1", result);
    }

    @Test
    void should_return_Fizz_when_countOff_given_a_number_multiple_of_3() {
        int numberMultipleOf3 = 3;
        String result = fizzBuzz.countOff(numberMultipleOf3);
        assertEquals("Fizz", result);
    }

    @Test
    void should_return_Buzz_when_countOff_given_a_number_multiple_of_5() {
        int numberMultipleOf5 = 5;
        String result = fizzBuzz.countOff(numberMultipleOf5);
        assertEquals("Buzz", result);
    }

    @Test
    void should_return_FizzBuzz_when_countOff_given_a_number_multiple_of_3_and_5() {
        int numberMultipleOf3And5 = 15;
        String result = fizzBuzz.countOff(numberMultipleOf3And5);
        assertEquals("FizzBuzz", result);
    }

    @Test
    void should_return_Whizz_when_countOff_given_a_number_multiple_of_7() {
        int numberMultipleOf7 = 7;
        String result = fizzBuzz.countOff(numberMultipleOf7);
        assertEquals("Whizz", result);
    }
    @Test
    void should_return_FizzWhizz_when_countOff_given_a_number_multiple_of_3_and_7() {
        int numberMultipleOf3And7 = 21;
        String result = fizzBuzz.countOff(numberMultipleOf3And7);
        assertEquals("FizzWhizz", result);
    }
    @Test
    void should_return_BuzzWhizz_when_countOff_given_a_number_multiple_of_5_and_7() {
        int numberMultipleOf5And7 = 35;
        String result = fizzBuzz.countOff(numberMultipleOf5And7);
        assertEquals("BuzzWhizz", result);
    }
}
