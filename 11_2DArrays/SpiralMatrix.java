/* Leetcode - Spiral Matrix */

import java.util.Scanner;

public class SpiralMatrix {

    public static void printArr(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;

        System.out.println("__original matrix__");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void spiralOrder(int[][] matrix) {

        int startRow = 0;
        int startCol = 0;
        int endRow = matrix.length - 1;
        int endCol = matrix[0].length - 1;

        System.out.println("__spiral matrix__");
        while (startRow <= endRow && startCol <= endCol) {

            // top
            for (int j = startCol; j <= endCol; j++) {
                System.out.print(matrix[startRow][j] + " ");
            }

            // right
            for (int i = (startRow + 1); i <= endRow; i++) {
                System.out.print(matrix[i][endCol] + " ");
            }

            // bottom
            for (int j = (endCol - 1); j >= startCol; j--) {
                if (startRow == endRow) {
                    break;
                }
                System.out.print(matrix[endRow][j] + " ");
            }

            // left
            for (int i = (endRow - 1); i > startRow; i--) {
                if (startCol == endCol) {
                    break;
                }
                System.out.print(matrix[i][startCol] + " ");
            }

            startRow++;
            startCol++;
            endCol--;
            endRow--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter the number of columns: ");
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Enter the element at " + (i + 1) + " row and " + (j + 1) + " column : ");
                matrix[i][j] = sc.nextInt();
            }
        }

        printArr(matrix);
        spiralOrder(matrix);

        sc.close();
    }
}
