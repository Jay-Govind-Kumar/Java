import java.util.Scanner;
import java.util.Arrays;

public class CountingSort {

    public static void countingSort(int[] arr) {
        int largest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            largest = Math.max(largest, arr[i]);
        }

        int[] countArr = new int[largest + 1];

        for (int i = 0; i < arr.length; i++) {
            countArr[arr[i]]++;
        }

        int index = 0;
        for (int i = 0; i < countArr.length; i++) {
            while (countArr[i] > 0) {
                arr[index] = i;
                index++;
                countArr[i]--;
            }
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many numbers do you want to store? ");
        int size = sc.nextInt();

        int[] arr = new int[size];

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

        System.out.print("Original array: ");
        System.out.println(Arrays.toString(arr));

        countingSort(arr);

        System.out.print("Sorted array: ");
        System.out.println(Arrays.toString(arr));

        sc.close();
    }
}
