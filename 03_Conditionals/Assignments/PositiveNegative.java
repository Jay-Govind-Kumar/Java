import java.util.Scanner;

public class PositiveNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        if (number > 0) {
            System.out.print("The number is positive.");
        } else if (number < 0) {
            System.out.print("The number is negative.");
        } else {
            System.out.print("The number is zero.");
        }

        sc.close();
    }
}
