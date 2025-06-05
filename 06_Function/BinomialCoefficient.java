import java.util.Scanner;

public class BinomialCoefficient {

    public static long factorial(int num) {
        long fact = 1;
        if (num < 0) {
            return -1;
        }
        if (num == 0 || num == 1) {
            return 1;
        }
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }

    public static long binomialCoefficient(int n, int r) {
        if (r < 0 || r > n) {
            return -1; // Invalid case
        }

        if (r == 0 || r == n) {
            return 1;
        }

        return factorial(n) / (factorial(r) * factorial(n - r));

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n (total items): ");
        int n = sc.nextInt();

        System.out.print("Enter r (items to choose): ");
        int r = sc.nextInt();

        long result = binomialCoefficient(n, r);
        if (result < 0) {
            System.out.println("Invalid input for factorial calculation.");
        }
        System.out.println("Binomial Coefficient C(" + n + ", " + r + ") is " + result);

        sc.close();
    }
}