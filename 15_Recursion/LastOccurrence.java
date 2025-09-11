import java.util.Scanner;

public class LastOccurrence {

    // Overloaded method to simplify usage from main
    public static int findLastOccurrence(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }
        return findLastOccurrence(arr, target, 0, arr.length - 1);
    }

    // Recursive method to find last occurrence
    private static int findLastOccurrence(int[] arr, int target, int start, int end) {
        if (start > end) {
            return -1; // Base case: target not found
        }
        if (arr[start] == target) {
            int nextIndex = findLastOccurrence(arr, target, start + 1, end);
            return (nextIndex != -1) ? nextIndex : start;
        }
        return findLastOccurrence(arr, target, start + 1, end);
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

        System.out.print("Enter the target element to find its last occurrence: ");
        int target = scanner.nextInt();

        int index = findLastOccurrence(arr, target);

        if (index != -1) {
            System.out.println("Last occurrence of " + target + " is at index: " + index);
        } else {
            System.out.println(target + " not found in the array.");
        }

        scanner.close();
    }
}
