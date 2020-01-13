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

    @Test
    fun `Given convert function should not return Buzz when any value which is not divisible by 5`(){
        val expectedResult = fizzBuzz.BUZZ
        //Act
        val actualResult = fizzBuzz.convert(3)
        //Assert
        assertNotEquals(expectedResult, actualResult)
    }

    @Test
    fun `Given convert function should return Buzz when any value which is divisible by 5`(){
        val expectedResult = fizzBuzz.BUZZ
        //Act
        val actualResult = fizzBuzz.convert(5)
        //Assert
        assertEquals(expectedResult, actualResult)
    }

    @Test
    fun `Given convert function should not return FizzBuzz when any value which is not divisible by 15`(){
        val expectedResult = "FizzBuzz"
        //Act
        val actualResult = fizzBuzz.convert(3)
        //Assert
        assertNotEquals(expectedResult, actualResult)
    }
}