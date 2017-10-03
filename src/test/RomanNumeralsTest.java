package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import main.RomanNumeral;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class RomanNumeralsTest {

    private static RomanNumeral romanNumeral;

    @BeforeAll
    static void prepareRomanNumerals() {
        romanNumeral = new RomanNumeral();
    }

    @Test
    void convertsZero() {
        assertEquals("", romanNumeral.convert(0));
    }

    @Test
    void convertsOne() {
        assertEquals("I", romanNumeral.convert(1));
    }

    @Test
    void convertsTwo() {
        assertEquals("II", romanNumeral.convert(2));
    }

    @Test
    void convertsFour() {
        assertEquals("IV", romanNumeral.convert(4));
    }

    @Test
    void convertsFive() {
        assertEquals("V", romanNumeral.convert(5));
    }

    @Test
    void convertsNine() {
        assertEquals("IX", romanNumeral.convert(9));
    }

    @Test
    void convertsTen() {
        assertEquals("X", romanNumeral.convert(10));
    }

    @Test
    void convertsTwelve() {
        assertEquals("XII", romanNumeral.convert(12));
    }

    @Test
    void  convertsFifteen() {
        assertEquals("XV", romanNumeral.convert(15));
    }

    @Test
    void convertsTwenty() {
        assertEquals("XX", romanNumeral.convert(20));
    }

    @Test
    void convertsForty() {
        assertEquals("XL", romanNumeral.convert(40));
    }

    @Test
    void convertsFifty() {
        assertEquals("L", romanNumeral.convert(50));
    }

    @Test
    void convertsNinety() {
        assertEquals("XC", romanNumeral.convert(90));
    }

    @Test
    void convertsHundred() {
        assertEquals("C", romanNumeral.convert(100));
    }

    @Test
    void convertsFourHundred() {
        assertEquals("CD", romanNumeral.convert(400));
    }

    @Test
    void convertsFiveHundred() {
        assertEquals("D", romanNumeral.convert(500));
    }

    @Test
    void convertsThreeHundredSeventyfour() {
        assertEquals("CCCLXXIV", romanNumeral.convert(374));
    }
}
