import java.util.Scanner;

public class CalculatePower {

    public static double power(double base, int exponent) {
        if (exponent == 0) {
            return 1.0;
        }

        double halfpower = power(base, exponent / 2);
        double result = halfpower * halfpower;

        if (exponent % 2 != 0) {
            result = base * result;
        }

        return ((exponent < 0) ? (1.0 / result) : result);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the base number: ");
        double base = scanner.nextDouble();

        System.out.print("Enter the exponent: ");
        int exponent = scanner.nextInt();

        double result = power(base, exponent);
        System.out.println("Result: " + result);

        scanner.close();
    }
}
