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
        assertEquals("Buzz", kata.fizzBuzz(3));
    }

    @Test
    public void checkIfNumberMultiplesFiveAndThree() {
        final KataOne kata = new KataOne();
        assertEquals("Fizz", kata.fizzBuzz(3));
    }

    @Test
    public void checkIfNumberNotMultiplesFiveAndThree() {
        final KataOne kata = new KataOne();
        assertEquals("16", kata.fizzBuzz(16));
    }



}
