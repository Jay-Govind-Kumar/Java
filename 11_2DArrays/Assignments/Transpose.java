import java.util.Scanner;

public class Transpose {

    public static void printArr(int[][] matrix) {

        int m = matrix.length;
        int n = matrix[0].length;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void transpose(int[][] matrix) {

        int n = matrix.length;
        int m = matrix[0].length;

        int[][] transposeMatrix = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                transposeMatrix[j][i] = matrix[i][j];
            }
        }

        System.out.println("----Transpose Matrix----");
        printArr(transposeMatrix);
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

        System.out.println("----Original Matrix----");
        printArr(matrix);

        transpose(matrix);

        sc.close();
    }
}
