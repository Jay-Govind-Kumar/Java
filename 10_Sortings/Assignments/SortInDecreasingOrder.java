import java.util.Scanner;
import java.util.Arrays;

public class SortInDecreasingOrder {

    // Bubble Sort
    public static void bubbleSort(int[] arr) {
        boolean swapped = true;

        for (int i = 0; i < (arr.length - 1); i++) {
            for (int j = 0; j < (arr.length - 1 - i); j++) {

                if (arr[j] < arr[j + 1]) {

                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
                swapped = true;
            }
            if (!swapped)
                break;
        }
    }

    // Selection Sort
    public static void selectionSort(int[] arr) {
        for (int i = 0; i < (arr.length - 1); i++) {
            int maxPos = i;

            for (int j = (i + 1); j < arr.length; j++) {
                if (arr[j] > arr[maxPos]) {
                    maxPos = j;
                }
            }

            if (maxPos != i) {
                int temp = arr[i];
                arr[i] = arr[maxPos];
                arr[maxPos] = temp;
            }
        }
    }

    // Insertion Sort
    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i];
            int prev = (i - 1);

            while (prev >= 0 && arr[prev] < curr) {
                arr[prev + 1] = arr[prev];
                prev--;
            }
            arr[prev + 1] = curr;
        }
    }

    // Counting Sort
    public static void countingSort(int[] arr) {
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
        }

        int[] count = new int[max + 1];

        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }

        int index = 0;
        for (int i = (count.length - 1); i >= 0; i--) {
            while (count[i] > 0) {
                arr[index] = i;
                index++;
                count[i]--;
            }
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Display menu for sorting algorithms
        System.out.print(
                "1: Bubble Sort \n2: Selection Sort \n3: Insertion Sort \n4: Counting Sort \nWhich sorting algorithm do you want to use? ");
        int choice = sc.nextInt();

        // Validate choice
        if (choice < 1 || choice > 4) {
            System.out.println("Invalid choice. Please select a valid sorting algorithm.");
            sc.close();
            return;
        }

        System.out.print("Enter the number of elements in the array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        // Input elements based on the selected sorting algorithm
        if (choice != 4) {
            for (int i = 0; i < size; i++) {
                System.out.print("Enter element " + (i + 1) + ": ");
                arr[i] = sc.nextInt();
            }
        } else {
            int i = 0;
            do {
                System.out.print("Enter element " + (i + 1) + ": ");
                int input = sc.nextInt();
                if (input < 0) {
                    System.out.println("Negative numbers are not allowed.");
                    continue;
                } else {
                    arr[i] = input;
                    i++;
                }
            } while (i < size);
        }

        System.out.print("Original array: ");
        System.out.println(Arrays.toString(arr));

        // Call the selected sorting algorithm
        switch (choice) {
            case 1:
                bubbleSort(arr);
                break;
            case 2:
                selectionSort(arr);
                break;
            case 3:
                insertionSort(arr);
                break;
            case 4:
                countingSort(arr);
                break;
        }

        System.out.print("Sorted array: ");
        System.out.println(Arrays.toString(arr));

        sc.close();
    }
}
