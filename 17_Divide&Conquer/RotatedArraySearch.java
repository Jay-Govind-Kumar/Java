public class RotatedArraySearch {
    public static int search(int[] arr, int target, int si, int ei) {

        if (si > ei) {
            return -1; // Target not found
        }

        int mid = si + (ei - si) / 2;

        // Case found
        if (arr[mid] == target) {
            return mid;
        }

        // mid on L1
        if (arr[si] <= arr[mid]) {
            // case a: left
            if (target >= arr[si] && target <= arr[mid]) {
                return search(arr, target, si, mid - 1);
            }
            // case b: right
            else {
                return search(arr, target, mid + 1, ei);
            }
        }

        // mid on L2
        else {
            // case c: right
            if (target >= arr[mid] && target <= arr[ei]) {
                return search(arr, target, mid + 1, ei);
            }
            // case d: left
            else {
                return search(arr, target, si, mid - 1);
            }

        }
    }

    public static void main(String[] args) {
        int[] nums = { 4, 5, 6, 7, 0, 1, 2 };
        int target = 0;
        int ans = search(nums, target, 0, nums.length - 1);
        System.out.print("Target found at index: " + ans);
    }
}