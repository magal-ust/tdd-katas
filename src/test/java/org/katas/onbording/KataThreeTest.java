package org.katas.onbording;


import org.testng.annotations.Test;

import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
import static org.katas.onbording.KataThree.validatePassword;

public class KataThreeTest {

    @Test
    public void checkPAsswordShouldContainTwoNumbers() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            validatePassword("cazBWEdkjslddsa#");
        });

        final String expectedMessage = "The password must contain at least 2 numbers";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    public void checkInvalidPasswordLenght() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            validatePassword("#12BWe");
        });

        final String expectedMessage = "Password must be at least 8 characters";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    public void checkCorrectPassword() {
        assertTrue(validatePassword("cazBWEgro9azdGDcaJ8i"));

    }
}
