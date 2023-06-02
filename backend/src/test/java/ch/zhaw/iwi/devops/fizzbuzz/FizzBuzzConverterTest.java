package ch.zhaw.iwi.devops.fizzbuzz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FizzBuzzConverterTest {

    @Test
    public void fizzBuzzConverter1() {

        FizzBuzzConverter fizzBuzz = new FizzBuzzConverter();
        Assertions.assertEquals("1", fizzBuzz.convert(1));

    }

    @Test
    public void fizzBuzzConvertor2() {
        FizzBuzzConverter fizzBuzz = new FizzBuzzConverter();
        Assertions.assertEquals("2", fizzBuzz. convert(2));
    }

    @Test
    public void fizzBuzzConverter6() {
    FizzBuzzConverter fizzBuzz = new FizzBuzzConverter();
    Assertions.assertEquals("Fizz", fizzBuzz. convert(6));
    }

    @Test
    public void fizzBuzzConvertorMultiplesOfSix() {

        FizzBuzzConverter fizzBuzz = new FizzBuzzConverter();
        Assertions.assertEquals("Fizz", fizzBuzz.convert(12));
    }

    @Test
    public void fizzBuzzConverter8() {
    FizzBuzzConverter fizzBuzz = new FizzBuzzConverter();
    Assertions.assertEquals("Buzz", fizzBuzz. convert(8));
    }

    @Test
    public void fizzBuzzConvertorMultiplesOfEight() {

        FizzBuzzConverter fizzBuzz = new FizzBuzzConverter();
        Assertions.assertEquals("Buzz", fizzBuzz.convert(16));
    }

    @Test
    void fizzBuzzConvertorMultiplesOfThreeAndSeven() {
        FizzBuzzConverter fizzBuzz = new FizzBuzzConverter();
        Assertions.assertNotEquals("FizzBuzz", fizzBuzz.convert(24));
        Assertions.assertEquals("FizzBuzz", fizzBuzz.convert(48));
        Assertions.assertEquals("FizzBuzz", fizzBuzz.convert(72));
        Assertions.assertEquals("FizzBuzz", fizzBuzz.convert(96));
        Assertions.assertEquals("FizzBuzz", fizzBuzz.convert(120));
        Assertions.assertEquals("FizzBuzz", fizzBuzz.convert(144));
        Assertions.assertEquals("FizzBuzz", fizzBuzz.convert(168));
        Assertions.assertEquals("FizzBuzz", fizzBuzz.convert(192));
        Assertions.assertEquals("FizzBuzz", fizzBuzz.convert(216));
        Assertions.assertEquals("FizzBuzz", fizzBuzz.convert(240));
        Assertions.assertEquals("FizzBuzz", fizzBuzz.convert(264));
        Assertions.assertEquals("FizzBuzz", fizzBuzz.convert(288));
        Assertions.assertEquals("FizzBuzz", fizzBuzz.convert(312));
        Assertions.assertEquals("FizzBuzz", fizzBuzz.convert(336));
        Assertions.assertEquals("FizzBuzz", fizzBuzz.convert(360));
        Assertions.assertEquals("FizzBuzz", fizzBuzz.convert(384));
        Assertions.assertEquals("FizzBuzz", fizzBuzz.convert(408));
        Assertions.assertEquals("FizzBuzz", fizzBuzz.convert(432));
        Assertions.assertEquals("FizzBuzz", fizzBuzz.convert(456));
        Assertions.assertEquals("FizzBuzz", fizzBuzz.convert(480));
        Assertions.assertEquals("FizzBuzz", fizzBuzz.convert(504));
        
    }

}