/*
 * Array.sort works with int data data type but
 * Arrays.sort(arr.Collections.reverseOrder()) works only with object.
 */

import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class InbuiltSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many number you want to store ? ");
        int size = sc.nextInt();

        Integer[] arr = new Integer[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter the " + (i + 1) + " element : ");
            arr[i] = sc.nextInt();
        }

        System.out.print("Original array: ");
        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr);
        System.out.print("Sorted array in ascending order: ");
        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr, Collections.reverseOrder());
        System.out.print("Sorted array in descending order: ");
        System.out.println(Arrays.toString(arr));

        sc.close();
    }
}
