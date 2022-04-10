package ru.job4j.array;

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean rsl = true;
        for (int column = 0; column < board[row].length; column++) {
            if (board[row][column] != 'X') {
                rsl = false;
                break;
            }
        }
        return rsl;
    }

    public static boolean monoVertical(char[][] board, int column) {
        boolean rsl = true;
        for (int row = 0; row < board.length; row++) {
            if (board[row][column] != 'X') {
                rsl = false;
                break;
            }
        }
        return rsl;
    }

    public static char[] extractDiagonal(char[][] board) {
        char[] rsl = new char[board.length];
        for (int row = 0; row < board.length; row++) {
            rsl[row] = board[row][row];
        }
        return rsl;
    }

    public static boolean isWin(char[][] board) {
        boolean result = false;
        char[] diagonal = extractDiagonal(board);
        for (int i = 0; i < diagonal.length; i++) {
            if (diagonal[i] == 'X' && (monoVertical(board, i) || monoHorizontal(board, i))) {
                result = true;
                break;
            }
        }
        return result;
    }
}
