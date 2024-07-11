package org.katas.onbording;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
import static org.katas.onbording.KataTwo.add;

public class KataTwoTest {

    @Test
    public void checkIgnoreBigNumbers() {
        assertEquals(2, add("//;\n2;1001"));
    }

    @Test
    public void checkMultiplyErrors() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            add("//\\|\n1|2,-3");
        });

        final String expectedMessage = "Detected different delimiters\nNegative number(s) not allowed: -3";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    public void checkNegativeNumbersMultiply() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            add("2,-4,-9");
        });

        final String expectedMessage = "Negative number(s) not allowed: -4, -9";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    public void checkNegativeNumbersValidation() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            add("1,-2");
        });

        final String expectedMessage = "Negative number(s) not allowed: -2";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    public void checkDifferentDelimiters() {
        assertEquals(4, add("//;\n1;3"));
        assertEquals(6, add("//|\n1|2|3"));
        assertEquals(7, add("//sep\n2sep5"));

        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            add("//\\|\n1|2,3");
        });

        final String expectedMessage = "Detected different delimiters";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    public void checkValidationWithSeparatorInTheEnd() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            add("1,2,");
        });

        final String expectedMessage = "Invalid input line";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    public void checkHandleTwoSeparatorsOneByOne() {
        int sum  = add("1,\n3");
        assertEquals(4, sum);
    }

    @Test
    public void checkHandleOfNewLinesAsSeparator() {
        int sum  = add("1,2\n3");
        assertEquals(6, sum);
    }

    @Test
    public void checkHandleOfUnknownNumbersInArgument() {
        int sum  = add("1,2,3");
        assertEquals(6, sum);
    }

    @Test
    public void checkSimpleCorrectSum() {
        int sum  = add("1,2");
        assertEquals(3, sum);
    }

    @Test
    public void checkOnEmptyString() {
        int sum  = add(null);
        assertEquals(0, sum);

        sum  = add("");
        assertEquals(0, sum);


        sum  = add("    ");
        assertEquals(0, sum);
    }
}
