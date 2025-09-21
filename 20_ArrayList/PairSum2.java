import java.util.ArrayList;

public class PairSum2 {

    public static boolean pairSum(ArrayList<Integer> list, int target) {
        int n = list.size();
        int pivot = -1;

        // Find pivot: the point of rotation
        for (int i = 0; i < n - 1; i++) {
            if (list.get(i) > list.get(i + 1)) {
                pivot = i;
                break;
            }
        }

        int left = (pivot + 1) % n; // index of smallest element
        int right = pivot; // index of largest element

        while (left != right) {
            int sum = list.get(left) + list.get(right);

            if (sum == target) {
                return true;
            }

            if (sum < target) {
                left = (left + 1) % n;
            } else {
                right = (n + right - 1) % n;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        int target = 16;

        if (pairSum(list, target)) {
            System.out.println("Pair found");
        } else {
            System.out.println("Pair not found");
        }
    }
}