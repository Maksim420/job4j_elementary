package ru.job4j.array;

import org.junit.Test;

import static org.junit.Assert.*;

public class MatrixCheckTest {

    @Test
    public void whenHasMonoHorizontal() {
        char[][] input = {
                {' ', ' ', ' '},
                {'X', 'X', 'X'},
                {' ', ' ', ' '},
        };
        int row = 1;
        boolean result = MatrixCheck.monoHorizontal(input, row);
        assertTrue(result);
    }

    @Test
    public void whenHasNotMonoHorizontal() {
        char[][] input = {
                {' ', ' '},
                {' ', ' '},
                {'X', 'X'},
        };
        int row = 0;
        boolean result = MatrixCheck.monoHorizontal(input, row);
        assertFalse(result);
    }

    @Test
    public void whenHasMonoVertical() {
        char[][] input = {
                {' ', ' ', 'X'},
                {' ', ' ', 'X'},
                {' ', ' ', 'X'},
        };
        int column = 2;
        boolean result = MatrixCheck.monoVertical(input, column);
        assertTrue(result);
    }

    @Test
    public void whenHasNotMonoVertical() {
        char[][] input = {
                {' ', ' '},
                {' ', ' '},
                {' ', ' '},
        };
        int column = 0;
        boolean result = MatrixCheck.monoVertical(input, column);
        assertFalse(result);
    }
}