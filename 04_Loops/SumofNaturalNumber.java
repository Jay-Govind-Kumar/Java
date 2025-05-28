import java.util.Scanner;

public class SumofNaturalNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a natural number: ");
        int num = sc.nextInt();

        int sum = 0;
        int counter = 1;
        while (counter <= num) {
            sum += counter;
            counter++;
        }

        System.out.println("The sum of natural numbers up to " + num + " is: " + sum);

        sc.close();
    }
}
