/* Write a program to find the factorial of any number entered by the user */

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number to calculate its factorial: ");
        int number = sc.nextInt();

        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {

            long fact = 1;
            for (int i = 1; i <= number; i++) {
                fact *= i;
            }
            System.out.println("The factorial of " + number + " is: " + fact);
        }
        sc.close();
    }
}
