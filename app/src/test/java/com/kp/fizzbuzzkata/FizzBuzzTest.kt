package com.kp.fizzbuzzkata

import org.junit.Assert
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNotEquals
import org.junit.Test

class FizzBuzzTest {

    //Arrange
    private val fizzBuzz = FizzBuzz()

    @Test
    fun `Given convert function should not return Fizz when any value passed which is not divisible by 3`(){
        val expectedResult = fizzBuzz.FIZZ
        //Act
        val actualResult = fizzBuzz.convert(1)
        //Assert
        assertNotEquals(expectedResult, actualResult)
    }

    @Test
    fun `Given convert function should return Fizz when any value passed which is divisible by 3`(){
        val expectedResult = fizzBuzz.FIZZ
        //Act
        val actualResult = fizzBuzz.convert(3)
        //Assert
        assertEquals(expectedResult, actualResult)
    }
}