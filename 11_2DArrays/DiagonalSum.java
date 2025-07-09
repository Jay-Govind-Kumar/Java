import java.util.Scanner;

public class DiagonalSum {

    public static void printArr(int[][] matrix) {

        System.out.println("The matrix is : ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static int sumOfDiagonal(int[][] matrix) {
        int sum = 0;

        // Brute Force Approach - time complexity O(n^2) - (bad time complexity)
        // for (int i = 0; i < matrix.length; i++) {
        // for (int j = 0; j < (matrix[0].length); j++) {
        // if (i == j || (i + j) == (matrix.length - 1)) {
        // sum += matrix[i][j];
        // }
        // }
        // }

        // Optimized Approach - time complexity O(n) - (good time complexity)
        for (int i = 0; i < matrix.length; i++) {
            // pd
            sum += matrix[i][i];
            // sd
            sum += matrix[i][matrix.length - 1 - i];
        }

        // note : for secondary diagonal (i + j) = (n -1) => j = (n - 1 - i)

        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter the dimension of the matrix : ");
        int n = sc.nextInt();

        int[][] matrix = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Enter the element at " + (i + 1) + " row and " + (j + 1) + " column : ");
                matrix[i][j] = sc.nextInt();
            }
        }

        printArr(matrix);

        System.out.println("The sum of the diagonal elements is " + sumOfDiagonal(matrix));

        sc.close();
    }
}
