// In a program, input 3 numbers, A, B and C. You have to output the average of these 3 numbers.

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        float A = sc.nextFloat();

        System.out.print("Enter the second number: ");
        float B = sc.nextFloat();

        System.out.print("Enter the third number: ");
        float C = sc.nextFloat();

        float average = (A + B + C) / 3;
        System.out.println("The average of the three numbers is: " + average);

        sc.close();
    }
}