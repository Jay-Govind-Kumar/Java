import java.util.Scanner;

public class SelectionSort {

    // auxiliary function to print the array
    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {

            int minPos = i;

            for (int j = (i + 1); j < arr.length; j++) {
                if (arr[j] < arr[minPos]) {
                    minPos = j;
                }
            }

            // Swap
            if (minPos != i) {
                int temp = arr[i];
                arr[i] = arr[minPos];
                arr[minPos] = temp;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        System.out.print("Original array: ");
        printArr(arr);
        selectionSort(arr);
        System.out.print("Sorted array: ");
        printArr(arr);

        sc.close();
    }
}
