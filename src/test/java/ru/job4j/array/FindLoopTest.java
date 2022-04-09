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

    @Test
    public void whenDiapasonHas2Then3() {
        int[] data = new int[]{5, 2, 10, 2, 4};
        int el = 2;
        int start = 2;
        int finish = 4;
        int result = FindLoop.indexInRange(data, el, start, finish);
        int expected = 3;
        assertEquals(expected, result);
    }

    @Test
    public void whenDiapasonHas6Then5() {
        int[] data = new int[]{5, 2, 10, 2, 4, 6, 7};
        int el = 6;
        int start = 2;
        int finish = 6;
        int result = FindLoop.indexInRange(data, el, start, finish);
        int expected = 5;
        assertEquals(expected, result);
    }

    @Test
    public void whenDiapasonHasNot4ThenMinus1() {
        int[] data = new int[]{5, 2, 10, 2, 4};
        int el = 4;
        int start = 1;
        int finish = 3;
        int result = FindLoop.indexInRange(data, el, start, finish);
        int expected = -1;
        assertEquals(expected, result);
    }
}