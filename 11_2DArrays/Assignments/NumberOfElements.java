import java.util.Scanner;

public class NumberOfElements {

    public static int numberOfElements(int[][] matrix, int target) {
        int count = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == target) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows : ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of columns : ");
        int columns = sc.nextInt();

        int[][] matrix = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Enter the " + (i + 1) + " row " + (j + 1) + " column element : ");
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.print("Enter the element to be searched : ");
        int target = sc.nextInt();

        int result = numberOfElements(matrix, target);

        if (result == 0) {
            System.out.println("Element not found.");
        } else {
            System.out.println("Element found " + result + " times.");
        }

        sc.close();
    }
}
