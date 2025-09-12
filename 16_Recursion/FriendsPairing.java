import java.util.Scanner;

public class FriendsPairing {

    public static int countWays(int n) {
        if (n <= 2) {
            return n;
        }
        // single
        int single = countWays(n - 1);
        // pair
        int pair = (n - 1) * countWays(n - 2);

        return single + pair;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of friends: ");
        int n = scanner.nextInt();

        int ways = countWays(n);
        System.out.println("Number of ways to pair up " + n + " friends: " + ways);

        scanner.close();
    }
}
