import java.util.Scanner;

public class GridWays {
    public static int gridWays(int i, int j, int n, int m) {
        // base case
        if (i == n - 1 && j == m - 1) {
            return 1;
        } else if (i >= n || j >= m) {
            return 0;
        }

        // recursion
        int w1 = gridWays(i + 1, j, n, m);
        int w2 = gridWays(i, j + 1, n, m);
        return w1 + w2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int n = scanner.nextInt();
        System.out.print("Enter number of columns: ");
        int m = scanner.nextInt();

        System.out.println(gridWays(0, 0, n, m) + " ways.");

        scanner.close();
    }
}

/*
 * time complexity: O(2^(n+m))
 * space complexity: O(n+m) (recursion stack space)
 * We can optimize the time complexity to O(n*m) using permutation formula.
 * total ways = (n-1 + m-1)! / (n-1)! * (m-1)!
 */