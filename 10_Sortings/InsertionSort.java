import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {

    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i];
            int prev = i - 1;

            while (prev >= 0 && curr < arr[prev]) {
                arr[prev + 1] = arr[prev];
                prev--;
            }
            arr[prev + 1] = curr;
        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("How many number you want to store ? ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter the " + (i + 1) + " element : ");
            arr[i] = sc.nextInt();
        }

        System.out.print("Original array: ");
        System.out.println(Arrays.toString(arr));

        insertionSort(arr);

        System.out.print("Sorted array : ");
        System.out.println(Arrays.toString(arr));

        sc.close();
    }
}
