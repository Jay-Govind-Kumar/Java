import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the temperature in Celsius: ");
        double celsius = sc.nextDouble();

        if (celsius < 100) {
            System.out.print("Chill Bro! It's too cold.");
        } else {
            System.out.print("It's warm.");
        }

        sc.close();
    }
}
