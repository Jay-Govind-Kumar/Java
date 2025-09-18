public class Sudoku {
    public static void printSudoku(int[][] board) {
        for (int r = 0; r < 9; r++) {
            for (int d = 0; d < 9; d++) {
                System.out.print(board[r][d]);
                System.out.print(" ");
            }
            System.out.print("\n");
        }
    }

    private static boolean isSafe(int[][] sudoku, int row, int col, int digit) {
        // check row
        for (int c = 0; c < 9; c++) {
            if (sudoku[row][c] == digit) {
                return false;
            }
        }

        // check column
        for (int r = 0; r < 9; r++) {
            if (sudoku[r][col] == digit) {
                return false;
            }
        }

        // check 3x3 box
        int sr = (row / 3) * 3;
        int sc = (col / 3) * 3;
        for (int r = sr; r < sr + 3; r++) {
            for (int c = sc; c < sc + 3; c++) {
                if (sudoku[r][c] == digit) {
                    return false;
                }
            }
        }

        return true;
    }

    private static boolean sudokuSolver(int[][] sudoku, int row, int col) {
        // base case
        if (row == 9) {
            return true;
        }

        // recursive case
        int nextRow = row, nextCol = col + 1;
        if (col + 1 == 9) {
            nextRow++;
            nextCol = 0;
        }

        if (sudoku[row][col] != 0) {
            return sudokuSolver(sudoku, nextRow, nextCol);
        }

        for (int digit = 1; digit <= 9; digit++) {
            if (isSafe(sudoku, row, col, digit)) {
                sudoku[row][col] = digit;
                if (sudokuSolver(sudoku, nextRow, nextCol)) {
                    return true;
                }
                sudoku[row][col] = 0;
            }
        }
        return false;
    }

    public static boolean sudokuSolver(int[][] sudoku) {
        return sudokuSolver(sudoku, 0, 0);
    }

    public static void main(String[] args) {
        int[][] sudoku = {
                { 0, 0, 8, 0, 0, 0, 0, 0, 0 },
                { 4, 9, 0, 1, 5, 7, 0, 0, 2 },
                { 0, 0, 3, 0, 0, 4, 1, 9, 0 },
                { 1, 8, 5, 0, 6, 0, 0, 2, 0 },
                { 0, 0, 0, 0, 2, 0, 0, 6, 0 },
                { 9, 6, 0, 4, 0, 5, 3, 0, 8 },
                { 0, 3, 0, 0, 7, 2, 0, 0, 4 },
                { 0, 4, 9, 0, 3, 0, 0, 5, 7 },
                { 8, 2, 7, 0, 0, 9, 0, 1, 3 }
        };

        if (sudokuSolver(sudoku)) {
            printSudoku(sudoku);
        } else {
            System.out.println("No solution exists");
        }
    }
}