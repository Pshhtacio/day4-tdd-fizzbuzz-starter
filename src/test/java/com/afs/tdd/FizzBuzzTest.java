package com.afs.tdd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FizzBuzzTest {
    @Test
    void should_return_the_given_number_when_countOff_given_a_normal_number(){
        //Given
        int normalNumber = 1;
        FizzBuzz fizzBuzz = new FizzBuzz();
        //When
        String result = fizzBuzz.countOff(normalNumber);
        //Then
        Assertions.assertEquals("1", result);
    }

    void should_return_Fizz_when_countOff_given_a_number_multiple_of_3(){}
    void should_return_Buzz_when_countOff_given_a_number_multiple_of_5(){}
    void should_return_FizzBuzz_when_countOff_given_a_number_multiple_of_15(){}
}
