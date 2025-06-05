import java.util.Scanner;

public class FactorialFunc {
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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number to calculate its factorial: ");
        int number = sc.nextInt();

        long result = factorial(number);
        if (result == -1) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            System.out.println("The factorial of " + number + " is " + result);
        }

        sc.close();
    }
}
