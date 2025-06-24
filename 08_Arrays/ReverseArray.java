import java.util.Scanner;

public class ReverseArray {

    // Auxiliary method to print the array
    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Method to reverse the array
    public static void reverse(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
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

        reverse(arr);

        System.out.print("Reversed array: ");
        printArr(arr);

        sc.close();
    }
}
