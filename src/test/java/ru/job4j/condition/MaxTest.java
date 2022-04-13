package ru.job4j.condition;

import org.junit.Test;

import static org.junit.Assert.*;

public class MaxTest {
    @Test
    public void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        assertEquals(result, expected);
    }

    @Test
    public void whenMax4To3Then4() {
        int left = 4;
        int right = 3;
        int result = Max.max(left, right);
        int expected = 4;
        assertEquals(result, expected);
    }

    @Test
    public void whenEqualsThen1or2() {
        int left = 2;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        assertEquals(result, expected);
    }

    @Test
    public void whenMax4To3and1Then4() {
        int a = 1;
        int b = 4;
        int c = 3;
        int result = Max.max(a, b, c);
        int expected = 4;
        assertEquals(result, expected);
    }

    @Test
    public void whenMax9To5and6and8Then4() {
        int a = 9;
        int b = 5;
        int c = 6;
        int d = 8;
        int result = Max.max(a, b, c, d);
        int expected = 9;
        assertEquals(result, expected);
    }

    @Test
    public void when3EqualsThen1or2or3() {
        int a = 2;
        int b = 2;
        int c = 2;
        int result = Max.max(a, b, c);
        int expected = 2;
        assertEquals(result, expected);
    }

    @Test
    public void when4EqualsThen1or2or3or4() {
        int a = 2;
        int b = 2;
        int c = 2;
        int d = 2;
        int result = Max.max(a, b, c, d);
        int expected = 2;
        assertEquals(result, expected);
    }
}