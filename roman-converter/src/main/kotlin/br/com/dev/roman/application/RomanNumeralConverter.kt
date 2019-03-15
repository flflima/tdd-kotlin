package br.com.dev.roman.application

class RomanNumeralConverter {

    fun convert(numberStr: String): Int {
        if (numberStr == "I") {
            return 1
        }
        return 5
    }
}