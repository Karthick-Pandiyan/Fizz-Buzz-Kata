package com.kp.fizzbuzzkata

class FizzBuzz {

    fun convert(convertTOFizzBuss: Int): String {
        if (convertTOFizzBuss % 3 == 0)
            return "Fizz"

        return convertTOFizzBuss.toString()
    }
}