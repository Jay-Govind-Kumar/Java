/* givena "2 x n" board and tiles of size "2 x 1", count the number of ways to tile the given board. A tile can either be placed horizontally or vertically. */

import java.util.*;

public class TilingProblem {
    public static int countWays(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }

        // place tile vertically
        int verticalWays = countWays(n - 1);

        // place tile horizontally
        int horizontalWays = countWays(n - 2);

        return verticalWays + horizontalWays;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of the board (n): ");
        int n = scanner.nextInt();

        int ways = countWays(n);
        System.out.println("Number of ways to tile 2 x " + n + " board: " + ways);

        scanner.close();
    }
}
