import java.util.Stack;

public class NextGreater {
    public static void main(String[] args) {
        int[] arr = { 6, 8, 0, 1, 3 };
        Stack<Integer> s = new Stack<>();
        int[] nxtGreater = new int[arr.length];

        for (int i = arr.length - 1; i >= 0; i--) {
            // Pop elements smaller than or equal to arr[i]
            while (!s.isEmpty() && arr[i] >= arr[s.peek()]) {
                s.pop();
            }

            // If stack is empty, no greater element to the right
            if (s.isEmpty()) {
                nxtGreater[i] = -1;
            } else {
                nxtGreater[i] = arr[s.peek()];
            }

            // Push current index onto stack
            s.push(i);
        }

        // Print the next greater elements
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " --> " + nxtGreater[i]);
        }
    }
}

/*
 * Four variations of Next Greater Element problem:
 * 1. Next Greater Element to the Right
 * 2. Next Greater Element to the Left
 * 3. Next Smaller Element to the Right
 * 4. Next Smaller Element to the Left
 * 
 */