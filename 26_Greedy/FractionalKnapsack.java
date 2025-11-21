import java.util.*;

public class FractionalKnapsack {
    public static void main(String[] args) {
        int[] val = { 60, 100, 120 };
        int[] weight = { 10, 20, 30 };
        int W = 50;

        double[][] ratio = new double[val.length][2];
        // 0th col => index, 1st col => value-to-weight ratio
        for (int i = 0; i < val.length; i++) {
            ratio[i][0] = i;
            ratio[i][1] = (double) val[i] / weight[i];
        }

        // Sort items by value-to-weight ratio
        Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));

        int capacity = W;
        int finalValue = 0;

        for (int i = ratio.length - 1; i >= 0; i--) {
            int idx = (int) ratio[i][0];
            if (capacity >= weight[idx]) {
                // take whole item
                capacity -= weight[idx];
                finalValue += val[idx];
            } else {
                // take fractional part
                finalValue += ratio[i][1] * capacity;
                capacity = 0;
                break;
            }
        }
        System.out.println("Maximum value in Knapsack = " + finalValue);
    }
}
