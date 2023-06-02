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

}