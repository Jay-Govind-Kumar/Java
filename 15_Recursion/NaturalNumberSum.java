import java.util.*;

public class NaturalNumberSum {

    public static int naturalSum(int n) {
        if (n == 0) {
            return 0;
        }
        return n + naturalSum(n - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int n = scanner.nextInt();

        int result = naturalSum(n);
        System.out.println("Sum of natural numbers up to " + n + " is: " + result);

        scanner.close();
    }
}
