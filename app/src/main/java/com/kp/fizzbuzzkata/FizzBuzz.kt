package com.kp.fizzbuzzkata

import com.kp.fizzbuzzkata.FizzBuzzConstant.Companion.BUZZ
import com.kp.fizzbuzzkata.FizzBuzzConstant.Companion.FIVE
import com.kp.fizzbuzzkata.FizzBuzzConstant.Companion.FIZZ
import com.kp.fizzbuzzkata.FizzBuzzConstant.Companion.FIZZBUZZ
import com.kp.fizzbuzzkata.FizzBuzzConstant.Companion.THREE

class FizzBuzz {

    fun convert(convertToFizzBuzz: Int): String {
        if(convertToFizzBuzz % FizzBuzzType.FIFTEEN.value == FizzBuzzType.ZERO.value)
            return FIZZBUZZ
        if (convertToFizzBuzz % FizzBuzzType.FIVE.value == FizzBuzzType.ZERO.value ||
            has5InIt(convertToFizzBuzz))
            return BUZZ
        if (convertToFizzBuzz % FizzBuzzType.THREE.value == FizzBuzzType.ZERO.value ||
            has3InIt(convertToFizzBuzz))
            return FIZZ

        return convertToFizzBuzz.toString()
    }

    private fun has5InIt(convertToFizzBuzz: Int) = convertToFizzBuzz.toString().contains(FIVE)
    private fun has3InIt(convertToFizzBuzz: Int) = convertToFizzBuzz.toString().contains(THREE)

}
