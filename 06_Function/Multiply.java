import java.util.Scanner;

public class Multiply {

    public static float multiply(float num1, float num2) {
        System.out.println("Using float multiplication");
        return num1 * num2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number : ");
        float num1 = sc.nextFloat();

        System.out.print("Enter second number : ");
        float num2 = sc.nextFloat();

        float result = multiply(num1, num2);
        System.out.println("The product of " + num1 + " and " + num2 + " is: " + result);

        sc.close();
    }
}