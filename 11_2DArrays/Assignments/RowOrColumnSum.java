import java.util.Scanner;

public class RowOrColumnSum {

    // print 2D array
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

    // sum of a row
    public static int rowSum(int[][] matrix, int row) {

        int sum = 0;

        for (int j = 0; j < matrix[0].length; j++) {
            sum += matrix[row][j];
        }

        return sum;
    }

    // sum of a column
    public static int colSum(int[][] matrix, int col) {

        int sum = 0;

        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][col];
        }

        return sum;
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

        // input choice and call the function
        System.out.print("Enter 1 for row sum or 2 for column sum: ");
        int choice = sc.nextInt();

        if (choice == 1) {
            System.out.print("Enter the row number: ");
            int row = sc.nextInt();
            System.out.println("The sum of row " + row + " is " + rowSum(matrix, row - 1));
        } else if (choice == 2) {
            System.out.print("Enter the column number: ");
            int col = sc.nextInt();
            System.out.println("The sum of column " + col + " is " + colSum(matrix, col - 1));
        }

        sc.close();
    }
}
