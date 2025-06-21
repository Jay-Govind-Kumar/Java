/* Write a Java method to compute the sum of the digits in an integer. */

import java.util.Scanner;

public class DigitSum {
    public static int sumOfDigits(int number) {
        int sum = 0;

        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = sc.nextInt();

        int result = sumOfDigits(number);
        System.out.print("The sum of the digits in " + number + " is: " + result);

        sc.close();
    }
}
