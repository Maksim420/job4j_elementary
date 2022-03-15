package ru.job4j.condition;

import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void when00to20then2() {
        double expected = 2;
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double rsl = Point.distance(x1, y1, x2, y2);
        assertEquals(expected, rsl, 0.01);
    }

    @Test
    public void when12to34then2dot82() {
        double expected = 2.82;
        int x1 = 1;
        int y1 = 2;
        int x2 = 3;
        int y2 = 4;
        double rsl = Point.distance(x1, y1, x2, y2);
        assertEquals(expected, rsl, 0.01);
    }

    @Test
    public void when00to11then1dot41() {
        double expected = 1.41;
        int x1 = 0;
        int y1 = 0;
        int x2 = 1;
        int y2 = 1;
        double rsl = Point.distance(x1, y1, x2, y2);
        assertEquals(expected, rsl, 0.01);
    }
}