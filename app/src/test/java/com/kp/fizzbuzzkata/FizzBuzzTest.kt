package com.kp.fizzbuzzkata

import org.junit.Assert
import org.junit.Assert.assertNotEquals
import org.junit.Test

class FizzBuzzTest {

    //Arrange
    private val fizzBuzz = FizzBuzz()

    @Test
    fun `Given test function should not return Fizz when 1 is passed to the function`(){
        val expectedResult = fizzBuzz.FIZZ
        //Act
        val actualResult = fizzBuzz.convert(1)
        //Assert
        assertNotEquals(expectedResult, actualResult)
    }
}