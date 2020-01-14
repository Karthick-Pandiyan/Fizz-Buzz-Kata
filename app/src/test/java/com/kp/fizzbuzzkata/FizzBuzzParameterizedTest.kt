package com.kp.fizzbuzzkata

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.Parameterized

@RunWith(Parameterized::class)
class FizzTestParameterizedTest(private val inputValue: Int, private val expectedValue: String) {

    private val fizz = FizzBuzz()
    companion object {
        @JvmStatic
        @Parameterized.Parameters
        fun data() : Collection<Array<Any>> {
            return listOf(
                arrayOf(1, "1"),
                arrayOf(2, "2"),
                arrayOf(3, "Fizz"),
                arrayOf(4, "4"),
                arrayOf(5, "Buzz"),
                arrayOf(6, "Fizz"),
                arrayOf(7, "7"),
                arrayOf(8, "8"),
                arrayOf(9, "Fizz"),
                arrayOf(10, "Buzz"),
                arrayOf(11, "11"),
                arrayOf(12, "Fizz"),
                arrayOf(13, "Fizz"),
                arrayOf(14, "14"),
                arrayOf(15, "FizzBuzz"))
        }
    }

    @Test
    fun `Check acceptance criteria with passing multiple test`() {
        assertThat(fizz.convert(inputValue), equalTo(expectedValue));
    }
}