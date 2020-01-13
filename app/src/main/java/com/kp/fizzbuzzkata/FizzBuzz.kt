package com.kp.fizzbuzzkata

class FizzBuzz {
    val FIZZ = "Fizz"

    fun convert(convertTOFizzBuss: Int): String {
        if (convertTOFizzBuss % FizzBuzzType.THREE.value == FizzBuzzType.ZERO.value)
            return FIZZ

        return convertTOFizzBuss.toString()
    }
}

enum class FizzBuzzType(val value: Int){
    ZERO(0), THREE(3)
}
