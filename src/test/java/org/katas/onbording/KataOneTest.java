package org.katas.onbording;

import org.junit.Test;

import static org.junit.Assert.*;

public class KataOneTest {
    @Test
    public void checkIfNumberMultiplesThree() {
        final KataOne kata = new KataOne();
        assertEquals("Fizz", kata.fizzBuzz(3));
    }

    @Test
    public void checkIfNumberMultiplesFive() {
        final KataOne kata = new KataOne();
        assertEquals("Buzz", kata.fizzBuzz(5));
    }

    @Test
    public void checkIfNumberMultiplesFiveAndThree() {
        final KataOne kata = new KataOne();
        assertEquals("FizzBuzz", kata.fizzBuzz(15));
    }

    @Test
    public void checkIfNumberNotMultiplesFiveAndThree() {
        final KataOne kata = new KataOne();
        assertEquals("16", kata.fizzBuzz(16));
    }

    @Test
    public void checkIfNumberNotSet() {
        final KataOne kata = new KataOne();
        Exception exception = assertThrows(NumberFormatException.class, () -> {
            kata.fizzBuzz(null);
        });

        String expectedMessage = "Number not set";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }

}
