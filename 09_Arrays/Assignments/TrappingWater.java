import java.util.Scanner;

public class TrappingWater {

    public static int trap(int[] height) {

        if (height.length <= 2) {
            return 0;
        }

        // calculate leftMMax boundary
        int[] leftMax = new int[height.length];
        leftMax[0] = height[0];
        for (int i = 1; i < height.length; i++) {
            leftMax[i] = Math.max(leftMax[i - 1], height[i]);
        }

        // calculate rightMax boundary
        int[] rightMax = new int[height.length];
        rightMax[height.length - 1] = height[height.length - 1];
        for (int i = height.length - 2; i >= 0; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i + 1]);
        }

        // calculate total water
        int i = 0;
        int width = 1;
        int totalWater = 0;

        while (i < height.length) {
            int minHeight = Math.min(leftMax[i], rightMax[i]);
            totalWater += (minHeight - height[i]) * width;

            i++;
        }
        return totalWater;
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
