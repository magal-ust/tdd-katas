package org.katas.onbording;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.katas.onbording.KataFive.scan;

public class KataFiveTest {

    @Test
    public void testTotal () {
        final String result = scan(new ArrayList<>() { { add("23456");  add("12345"); } }, true);
        assertEquals(result, "$19.75");
    }

    @Test
    public void test99999Case () {
        final String result = scan(new ArrayList<>() { { add("99999"); } }, false);
        assertEquals(result, "Error: barcode not found");
    }

    @Test
    public void test23456Case () {
        final String result = scan(new ArrayList<>() { { add("23456"); } }, false);
        assertEquals(result, "$12.5");
    }

    @Test
    public void test123456Case () {
        final String result = scan(new ArrayList<>() { { add("12345"); } }, false);
        assertEquals(result, "$7.25");
    }

    @Test
    public void testEmptyBarcode() {
        final String result = scan(null, false);
        assertEquals(result, "Error: empty barcode");

        final String result1 = scan(new ArrayList<>(), false);
        assertEquals(result1, "Error: empty barcode");

        final String result2 = scan(new ArrayList<>() { {add(null); } }, false);
        assertEquals(result2, "Error: empty barcode");

        final String result3 = scan(new ArrayList<>() { {add(""); } }, false);
        assertEquals(result3, "Error: empty barcode");
    }
}
