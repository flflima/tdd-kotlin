package br.com.dev.roman.application

import br.com.dev.roman.resource.enumerator.RomanNumeral

/**
 * Converts given number in Roman to decimal format
 */
class RomanNumeralConverter {

    fun convert(numberStr: String): Int {
        var count = 0

        for (i in numberStr.indices) {
            var actualNumber = RomanNumeral.numerals[numberStr[i]] ?: 0

            if (i + 1 < numberStr.length) {
                if (actualNumber < RomanNumeral.numerals[numberStr[i + 1]] ?: 0) {
                    actualNumber *= -1
                }
            }

            count += actualNumber
        }

        return count
    }
}