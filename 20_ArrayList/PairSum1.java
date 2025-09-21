import java.util.ArrayList;

public class PairSum1 {
    // Brute Force Approach - O(n^2)
    public static boolean pairSum(ArrayList<Integer> list, int target) {
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i) + list.get(j) == target) {
                    return true;
                }
            }
        }
        return false;
    }

    // Two Pointer Approach - O(n) - Only works for sorted arrays
    public static boolean twoPointerPairSum(ArrayList<Integer> list, int target) {
        int left = 0;
        int right = list.size() - 1;

        while (left < right) {
            int sum = list.get(left) + list.get(right);
            if (sum == target) {
                return true;
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        int target = 9;

        if (twoPointerPairSum(list, target)) {
            System.out.println("Pair found");
        } else {
            System.out.println("No pair found");
        }
    }
}