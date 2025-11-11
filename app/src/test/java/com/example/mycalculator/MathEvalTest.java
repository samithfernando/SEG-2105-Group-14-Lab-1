package com.example.mycalculator;

import org.junit.Test;

import static org.junit.Assert.*;

public class MathEvalTest {

    @Test
    public void testAdditionValid() {
        assertEquals("8", MathEval.eval("4+4"));
    }

    @Test
    public void testAdditionInvalid() {
        assertEquals("Error", MathEval.eval("4+-"));
    }

    @Test
    public void testDivisionValid() {
        assertEquals("10", MathEval.eval("20/2"));
    }

    @Test
    public void testDivisionInvalid() {
        assertEquals("Error", MathEval.eval("20/0"));
    }
}
