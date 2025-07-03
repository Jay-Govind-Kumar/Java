/* Maximum SubArray Sum */

import java.util.Scanner;

public class MaxSubarraySum {

    // Brute Force - time complexity O(n^3) - (bad time complexity)
    public static int BruteForce(int[] arr) {
        int maxSum = Integer.MIN_VALUE;
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum += arr[k];
                }
                maxSum = Math.max(maxSum, sum);
            }
        }
        return maxSum;
    }

    // Prefix Sum - time complexity O(n^2) - (good time complexity)
    public static int PrefixSum(int[] arr) {

        int[] prefix = new int[arr.length];
        prefix[0] = arr[0];

        for (int i = 1; i < arr.length; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                currSum = ((i == 0) ? prefix[j] : (prefix[j] - prefix[i - 1]));
                maxSum = Math.max(currSum, maxSum);
            }
        }
        return maxSum;
    }

    // Kadane's Algorithm - time complexity O(n) - (good time complexity)
    public static int KadanesAlgo(int[] arr) {

        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;

        for (int i = 0; i < arr.length; i++) {
            currSum += arr[i];

            if (currSum < 0) {
                currSum = 0;
            }
            maxSum = Math.max(currSum, maxSum);
        }

        // Handle the case where all elements are negative
        if (maxSum == 0) {
            maxSum = arr[0];
            for (int i = 0; i < arr.length; i++) {
                maxSum = Math.max(maxSum, arr[i]);
            }
        }
        return maxSum;
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

        System.out.println("--------------------------------");
        // int maxSum = BruteForce(arr);
        // int maxSum = PrefixSum(arr);
        int maxSum = KadanesAlgo(arr);

        System.out.println("Maximum Subarray Sum: " + maxSum);
        System.out.println("--------------------------------");
        sc.close();
    }
}