/* Write a program to print the multiplication table of a number N, entered by the user */

import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number to print its multiplication table: ");
        int number = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.print("" + number + " x " + i + " = " + (number * i) + "\n");
        }

        sc.close();
    }
}
