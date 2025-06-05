import java.util.Scanner;

public class PrimeInRange {
    public static boolean isPrime(int num) {
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

    public static void primeInRange(int num) {
        if (num < 2) {
            System.out.println("There are no prime numbers in the range.");
            return;
        }
        for (int i = 2; i <= num; i++) {
            if (isPrime(i)) {
                System.out.println(i + " is a prime number.");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the highest number: ");
        int num = sc.nextInt();

        primeInRange(num);
        sc.close();
    }
}
