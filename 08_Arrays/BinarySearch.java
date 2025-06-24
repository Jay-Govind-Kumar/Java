import java.util.Scanner;

public class BinarySearch {
    public static int binarySearch(int arr[], int key) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] > key) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        // key not found
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        int arr[] = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            int curr_ele = sc.nextInt();
            if (i == 0 || curr_ele >= arr[i - 1]) {
                arr[i] = curr_ele;
            } else {
                System.out.println("Please enter a sorted array. Element not added.");
                i--; // Decrement i to repeat this iteration
            }
        }

        System.out.print("Enter the key to search: ");
        int key = sc.nextInt();

        int result = binarySearch(arr, key);

        if (result == -1) {
            System.out.println("Element not found in the array.");
        } else {
            System.out.println("Element found at index: " + result);
        }

        sc.close();
    }
}
