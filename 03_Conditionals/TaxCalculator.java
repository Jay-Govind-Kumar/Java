import java.util.Scanner;

public class TaxCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your income in Lakhs: ");
        double income = sc.nextDouble();

        if (income <= 5) {
            System.out.println("You are in the 0% tax bracket.");
        } else if (income <= 10 && income > 5) {
            System.out.println("You are in the 10% tax bracket.");
        } else if (income <= 20 && income > 10) {
            System.out.println("You are in the 20% tax bracket.");
        } else if (income > 20) {
            System.out.println("You are in the 30% tax bracket.");
        } else {
            System.out.println("Error! Invalid income.");
        }

        sc.close();
    }
}
