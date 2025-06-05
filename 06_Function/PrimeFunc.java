import java.util.*;

public class PrimeFunc {

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        if (num == 2) {
            return true;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ente a number: ");
        if (sc.hasNextInt()) {
            int num = sc.nextInt();
            if (num > 0) {
                if (num == 1) {
                    System.out.print("" + num + " is neither prime nor composite.");
                } else {
                    boolean result = isPrime(num);
                    if (result) {
                        System.out.print(num + " is a prime number.");
                    } else {
                        System.out.print(num + " is a composite number.");
                    }
                }
            } else {
                System.out.print("Please enter a positive integer.");
            }
        } else {
            System.out.println("Please enter a valid integer.");
        }

        sc.close();
    }
}
