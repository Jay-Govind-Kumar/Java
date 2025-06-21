/* Write a Java method to compute the averageof three numbers */

import java.util.Scanner;

public class Average {
    public static double average(double num1, double num2, double num3) {
        return (num1 + num2 + num3) / 3.0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first numbers: ");
        double num1 = sc.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();
        System.out.print("Enter third number: ");
        double num3 = sc.nextDouble();

        double average = average(num1, num2, num3);
        System.out.println("The average of " + num1 + ", " + num2 + ", and " + num3 + " is: " + average);

        sc.close();
    }

}
