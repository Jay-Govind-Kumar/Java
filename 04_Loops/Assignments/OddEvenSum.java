/* Write a program that reads a set of integers,and then prints the sum of the even and odd integers. */

import java.util.Scanner;

public class OddEvenSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;
        int choice;
        int evenSum = 0;
        int oddSum = 0;

        do {
            System.out.print("Enter a number : ");
            num = sc.nextInt();

            if (num % 2 != 0) {
                oddSum += num;
            } else {
                evenSum += num;
            }

            System.out.print("Do you want to continue? (1 for Yes, 0 for No): ");
            choice = sc.nextInt();
        } while (choice == 1);

        System.out.println("Sum of even integers: " + evenSum);
        System.out.println("Sum of odd integers: " + oddSum);

        sc.close();
    }
}
