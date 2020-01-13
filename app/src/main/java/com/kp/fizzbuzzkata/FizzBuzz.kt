package com.kp.fizzbuzzkata

class FizzBuzz {
    val FIZZ = "Fizz"
    val BUZZ = "Buzz"

    fun convert(convertTOFizzBuss: Int): String {
        if(convertTOFizzBuss % 15 == 0)
            return "FizzBuzz"
        if (convertTOFizzBuss % FizzBuzzType.FIVE.value == FizzBuzzType.ZERO.value)
            return BUZZ
        if (convertTOFizzBuss % FizzBuzzType.THREE.value == FizzBuzzType.ZERO.value)
            return FIZZ

        return convertTOFizzBuss.toString()
    }
}

enum class FizzBuzzType(val value: Int){
    ZERO(0), THREE(3), FIVE(5)
}
