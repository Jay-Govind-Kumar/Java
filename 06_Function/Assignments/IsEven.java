/* Write a method named isEven that accepts an int argument. The method should return true if the argument is even, or false otherwise. */

import java.util.Scanner;

public class IsEven {
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int inputNumber = sc.nextInt();

        boolean result = isEven(inputNumber);
        if (result) {
            System.out.println(inputNumber + " is even.");
        } else {
            System.out.println(inputNumber + " is odd.");
        }

        sc.close();
    }
}
