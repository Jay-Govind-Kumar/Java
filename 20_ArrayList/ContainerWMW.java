import java.util.*;

public class ContainerWMW {

    // brute force approach
    public static int storeWater1(ArrayList<Integer> height) {
        int maxWater = 0;

        for (int i = 0; i < height.size(); i++) {
            for (int j = i + 1; j < height.size(); j++) {
                int width = j - i;
                int currHeight = Math.min(height.get(i), height.get(j));
                int currentWater = width * currHeight;
                maxWater = Math.max(maxWater, currentWater);
            }
        }

        return maxWater;
    }

    // two pointer approach
    public static int storeWater(ArrayList<Integer> height) {
        int maxWater = 0;
        int left = 0;
        int right = height.size() - 1;

        while (left < right) {
            int width = right - left;
            int currHeight = Math.min(height.get(left), height.get(right));
            int currentWater = width * currHeight;
            maxWater = Math.max(maxWater, currentWater);

            if (height.get(left) < height.get(right)) {
                left++;
            } else {
                right--;
            }
        }
        return maxWater;
    }

    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);

        System.out.println(" Maximum water that can be stored: " + storeWater1(height));
        System.out.println(" Maximum water that can be stored: " + storeWater(height));
    }
}
