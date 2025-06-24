import java.util.Scanner;

public class ArrayPairs {
    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void arrayPairs(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = (i + 1); j < arr.length; j++) {
                System.out.print("(" + arr[i] + "," + arr[j] + ") ");
            }
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

        System.out.print("Array pairs: ");
        arrayPairs(arr);

        sc.close();
    }
}