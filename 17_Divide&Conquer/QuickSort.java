import java.util.*;

public class QuickSort {
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void quickSort(int[] arr, int si, int ei) {
        if (si >= ei) {
            return;
        }
        // last element as pivot
        int pIdx = partition(arr, si, ei);
        quickSort(arr, si, pIdx - 1); // left part
        quickSort(arr, pIdx + 1, ei); // right part
    }

    public static int partition(int[] arr, int si, int ei) {
        int pivot = arr[ei];
        int i = si - 1; // smaller element index

        for (int j = si; j < ei; j++) {
            if (arr[j] <= pivot) {
                i++;
                // swap
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        // swap pivot
        int temp = pivot;
        arr[ei] = arr[i];
        arr[i] = temp;

        return i;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int size = scanner.nextInt();

        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter " + (i + 1) + " element: ");
            array[i] = scanner.nextInt();
        }

        System.out.println("Original array:");
        printArray(array);

        quickSort(array, 0, size - 1);

        System.out.println("Sorted array:");
        printArray(array);

        scanner.close();
    }
}
