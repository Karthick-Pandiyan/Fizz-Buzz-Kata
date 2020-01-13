package com.kp.fizzbuzzkata

class FizzBuzz {
    val FIZZ = "Fizz"
    val BUZZ = "Buzz"
    val FIZZBUZZ = "FizzBuzz"

    fun convert(convertTOFizzBuss: Int): String {
        if(convertTOFizzBuss % FizzBuzzType.FIFTEEN.value == FizzBuzzType.ZERO.value)
            return FIZZBUZZ
        if (convertTOFizzBuss % FizzBuzzType.FIVE.value == FizzBuzzType.ZERO.value)
            return BUZZ
        if (convertTOFizzBuss % FizzBuzzType.THREE.value == FizzBuzzType.ZERO.value)
            return FIZZ

        return convertTOFizzBuss.toString()
    }
}

enum class FizzBuzzType(val value: Int){
    ZERO(0), THREE(3), FIVE(5), FIFTEEN(15)
}
