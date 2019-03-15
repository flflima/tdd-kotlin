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

    @Test
    fun `Must understand the symbol X`() {
        val number = RomanNumeralConverter().convert("X")
        assertEquals(10, number)
    }

    @Test
    fun `Must understand the symbol L`() {
        val number = RomanNumeralConverter().convert("L")
        assertEquals(50, number)
    }

    @Test
    fun `Must understand two symbols like II`() {
        val number = RomanNumeralConverter().convert("II")
        assertEquals(2, number)
    }

    @Test
    fun `Must understand two symbols like XV`() {
        val number = RomanNumeralConverter().convert("XV")
        assertEquals(15, number)
    }

    @Test
    fun `Must understand symbols like CII`() {
        val number = RomanNumeralConverter().convert("CII")
        assertEquals(102, number)
    }

    @Test
    fun `Must understand symbols like IV`() {
        val number = RomanNumeralConverter().convert("IV")
        assertEquals(4, number)
    }

    @Test
    fun `Must understand symbols like IX`() {
        val number = RomanNumeralConverter().convert("IX")
        assertEquals(9, number)
    }

    @Test
    fun `Must understand symbols like CIV`() {
        val number = RomanNumeralConverter().convert("CIV")
        assertEquals(104, number)
    }

    @Test
    fun `Must understand symbols like MCMXC`() {
        val number = RomanNumeralConverter().convert("MCMXC")
        assertEquals(1990, number)
    }

    @Test
    fun `Must understand symbols like CMII`() {
        val number = RomanNumeralConverter().convert("CMII")
        assertEquals(902, number)
    }

    @Test
    fun `Must understand symbols like XXIV`() {
        val number = RomanNumeralConverter().convert("XXIV")
        assertEquals(24, number)
    }
}