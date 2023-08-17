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
}
