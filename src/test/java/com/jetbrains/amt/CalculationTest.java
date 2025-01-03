package com.jetbrains.amt;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculationTest {
    @Test
    public void testFindMax() {
        assertEquals(4, Calculation.findMax(new int[]{1, 3, 4, 2}));
    }

    @Test
    public void testCube() {
        assertEquals(27, Calculation.cube(3));
    }

    @Test
    public void testReverseWord() {
        assertEquals("ym eman si nahk", Calculation.reverseWord("Hello World!"));
    }
}
