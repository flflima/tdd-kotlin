package br.com.dev.roman.application

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class RomanNumeralsConverterTest {

    @Test
    fun `Must understand the symbol I`() {
        val roman = RomanNumeralConverter()
        val number = roman.convert("I")
        assertEquals(1, number)
    }

    @Test
    fun `Must understand the symbol V`() {
        val roman = RomanNumeralConverter()
        val number = roman.convert("V")
        assertEquals(5, number)
    }
}