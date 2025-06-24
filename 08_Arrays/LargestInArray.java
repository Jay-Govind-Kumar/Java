import java.util.Scanner;

public class LargestInArray {
    public static int findLargest(int arr[]) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array must not be empty");
        }

        int largest = arr[0];

        for (int i = 1; i < arr.length; i++) {
            largest = Math.max(arr[i], largest);
        }

        return largest;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        int result = findLargest(arr);
        System.out.println("The largest element in the array is: " + result);

        sc.close();
    }
}
