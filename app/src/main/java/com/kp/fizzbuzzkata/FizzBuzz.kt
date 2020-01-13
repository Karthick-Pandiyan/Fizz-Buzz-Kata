package com.kp.fizzbuzzkata

import com.kp.fizzbuzzkata.FizzBuzzConstant.Companion.BUZZ
import com.kp.fizzbuzzkata.FizzBuzzConstant.Companion.FIVE
import com.kp.fizzbuzzkata.FizzBuzzConstant.Companion.FIZZ
import com.kp.fizzbuzzkata.FizzBuzzConstant.Companion.FIZZBUZZ
import com.kp.fizzbuzzkata.FizzBuzzConstant.Companion.THREE

class FizzBuzz {

    fun convert(convertToFizzBuzz: Int): String {

        return when{
            isDivisibleBy15(convertToFizzBuzz) -> FIZZBUZZ
            isDivisibleBy5(convertToFizzBuzz) -> BUZZ
            isDivisibleBy3(convertToFizzBuzz) -> FIZZ
            else -> convertToFizzBuzz.toString()
        }
    }

    private fun isDivisibleBy3(convertToFizzBuzz: Int) =
        convertToFizzBuzz % FizzBuzzType.THREE.value == FizzBuzzType.ZERO.value || has3InIt(
            convertToFizzBuzz
        )

    private fun isDivisibleBy5(convertToFizzBuzz: Int) =
        convertToFizzBuzz % FizzBuzzType.FIVE.value == FizzBuzzType.ZERO.value || has5InIt(
            convertToFizzBuzz
        )

    private fun isDivisibleBy15(convertToFizzBuzz: Int) =
        convertToFizzBuzz % FizzBuzzType.FIFTEEN.value == FizzBuzzType.ZERO.value

    private fun has5InIt(convertToFizzBuzz: Int) = convertToFizzBuzz.toString().contains(FIVE)
    private fun has3InIt(convertToFizzBuzz: Int) = convertToFizzBuzz.toString().contains(THREE)

}
