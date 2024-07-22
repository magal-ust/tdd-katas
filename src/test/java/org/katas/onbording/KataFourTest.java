package org.katas.onbording;

import org.testng.annotations.Test;

import java.util.List;

import static org.junit.Assert.*;
import static org.katas.onbording.KataFour.searchBy;


public class KataFourTest {

    @Test
    public void checkIfSearchTextFewerThen2Characters() {
        final List<String> result = searchBy("A");

        assertTrue(result.isEmpty());
    }

    @Test
    public void checkSearchByEmptyString() {
        final List<String> result = searchBy(null);

        assertTrue(result.isEmpty());
    }

    @Test
    public void checkCorrectSimpleSearch() {
        final List<String> result = searchBy("Amster");

        assertFalse(result.isEmpty());
        assertEquals(result.get(0), "Amsterdam");
    }
}
