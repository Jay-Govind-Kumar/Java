import java.util.Scanner;

public class SubArrays {
    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void subArrays(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                System.out.print("( ");
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] + " ");
                }
                System.out.print("), ");

            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        System.out.print("Original array: ");
        printArr(arr);

        subArrays(arr);

        sc.close();
    }
}
