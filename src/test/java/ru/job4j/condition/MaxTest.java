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
}