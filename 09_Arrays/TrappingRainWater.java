/* Trapping Rain Water */

import java.util.Scanner;

public class TrappingRainWater {

    public static int trap(int[] height) {
        int n = height.length;
        if (n <= 2) {
            return 0;
        }

        // Calculate leftMax boundary - array
        int[] leftMax = new int[n];
        leftMax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(leftMax[i - 1], height[i]);
        }

        // Calculate rightMax boundary - array
        int[] rightMax = new int[n];
        rightMax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i + 1]);
        }

        // Calculate total trapped water
        int i = 0;
        int width = 1; // Each bar has a width of 1 unit
        int totalWater = 0;

        while (i < height.length) {

            int waterLevel = Math.min(leftMax[i], rightMax[i]);
            totalWater += (waterLevel - height[i]) * width;

            i++;
        }

        return totalWater;
    }

    // Optimized approach using two pointers
    public static int trappingRainwater2(int height[]) {
        // two pointer approach
        int leftIndex = 0, rightIndex = height.length - 1, trappedWater = 0;
        int leftMax = height[leftIndex], rightMax = height[rightIndex];

        while (leftIndex < rightIndex) {
            if (leftMax < rightMax) {
                leftIndex++;
                leftMax = Math.max(height[leftIndex], leftMax);
                trappedWater += (leftMax - height[leftIndex]) * 1;
            } else {
                rightIndex--;
                rightMax = Math.max(height[rightIndex], rightMax);
                trappedWater += (rightMax - height[rightIndex]) * 1;
            }
        }

        return trappedWater;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int size = sc.nextInt();

        int[] height = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter height for index " + i + ": ");
            height[i] = sc.nextInt();
        }

        int trappedWater = trap(height);
        System.out.println("Total trapped rainwater: " + trappedWater);

        sc.close();
    }
}
