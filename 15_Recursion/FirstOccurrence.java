import java.util.Scanner;

public class FirstOccurrence {

    // Overloaded method to simplify usage from main
    public static int findFirstOccurrence(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }
        return findFirstOccurrence(arr, target, 0, arr.length - 1);
    }

    // Recursive method to find first occurrence
    private static int findFirstOccurrence(int[] arr, int target, int start, int end) {
        if (start > end) {
            return -1;
        }
        if (target == arr[start]) {
            return start;
        }
        return findFirstOccurrence(arr, target, start + 1, end);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Invalid array size.");
            scanner.close();
            return;
        }

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }

        System.out.print("Enter the target element to find its first occurrence: ");
        int target = scanner.nextInt();

        int index = findFirstOccurrence(arr, target);

        if (index != -1) {
            System.out.println("First occurrence of " + target + " is at index: " + index);
        } else {
            System.out.println(target + " not found in the array.");
        }

        scanner.close();
    }
}