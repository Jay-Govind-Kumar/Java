import java.util.Scanner;

public class Matrix {

    public static void printArr(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    // linear search in a 2D matrix
    public static boolean search(int[][] matrix, int key) {
        int n = matrix.length;
        int m = matrix[0].length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == key) {
                    return true;
                }
            }
        }

        return false;
    }

    // find largest element in a 2D matrix
    public static int largestInArray(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }
            }
        }

        return max;
    }

    // find smallest element in a 2D matrix
    public static int smallestInArray(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] < min) {
                    min = matrix[i][j];
                }
            }
        }

        return min;
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

        // find largest & smallest element in the matrix
        int max = largestInArray(matrix);
        System.out.println("| " + max + " is the largest element |");
        int min = smallestInArray(matrix);
        System.out.println("| " + min + " is the smallest element |");

        // Searching for an element in the matrix
        System.out.print("Enter the key to search: ");
        int key = sc.nextInt();

        if (search(matrix, key)) {
            System.out.println("| Element found |");
        } else {
            System.out.println("| Element not found |");
        }

        sc.close();
    }
}
