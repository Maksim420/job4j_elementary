package ru.job4j.calculator;

import org.junit.Test;

import static org.junit.Assert.*;

public class FitTest {

    @Test
    public void whenManHeight190Then103dot5() {
        short height = 190;
        double expected = 103.5;
        double rsl = Fit.manWeight(height);
        assertEquals(expected, rsl, 0.01);
    }

    @Test
    public void whenWomanHeight160Then57dot5() {
        short height = 160;
        double expected = 57.5;
        double rsl = Fit.womanWeight(height);
        assertEquals(expected, rsl, 0.01);
    }
}