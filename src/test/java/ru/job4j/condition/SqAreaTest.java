package ru.job4j.condition;

import org.junit.Test;

import static org.junit.Assert.*;

public class SqAreaTest {

    @Test
    public void whenP6K2Then2() {
        double expected = 2;
        int p = 6;
        double k = 2;
        double out = SqArea.square(p, k);
        assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP6K3Then1dot68() {
        double expected = 1.68;
        int p = 6;
        double k = 3;
        double out = SqArea.square(p, k);
        assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP5K2Then1dot38() {
        double expected = 1.38;
        int p = 5;
        double k = 2;
        double out = SqArea.square(p, k);
        assertEquals(expected, out, 0.01);
    }
}