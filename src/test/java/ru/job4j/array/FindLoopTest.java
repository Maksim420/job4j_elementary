package ru.job4j.array;

import org.junit.Test;

import static org.junit.Assert.*;

public class FindLoopTest {

    @Test
    public void whenArrayHas5Then0() {
        int[] data = new int[] {5, 1, 2, 3};
        int el = 5;
        int rst = FindLoop.indexOf(data, el);
        int expected = 0;
        assertEquals(expected, rst);
    }

    @Test
    public void whenArrayHas10Then4() {
        int[] data = new int[] {5, 1, 2, 3, 10};
        int el = 10;
        int rst = FindLoop.indexOf(data, el);
        int expected = 4;
        assertEquals(expected, rst);
    }

    @Test
    public void whenArrayHasNot4ThenMinus1() {
        int[] data = new int[] {5, 1, 2, 3};
        int el = 4;
        int rst = FindLoop.indexOf(data, el);
        int expected = -1;
        assertEquals(expected, rst);
    }
}