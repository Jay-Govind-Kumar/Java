/* Write a Java program to check if a number is a palindrome in Java? (121 is a palindrome, 321 is not) */

import java.util.Scanner;

public class Palindrome {
    public static boolean isPalindrome(int number) {
        int originalNumber = number;
        int reversedNumber = 0;

        while (number > 0) {
            int digit = number % 10;
            number /= 10;
            reversedNumber = reversedNumber * 10 + digit;
        }

        return (originalNumber == reversedNumber);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        boolean result = isPalindrome(number);
        if (result) {
            System.out.println(number + " is a palindrome.");
        } else {
            System.out.println(number + " is not a palindrome.");
        }

        sc.close();
    }
}
