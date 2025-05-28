import java.util.Scanner;

public class PrimeComposite {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num > 0) {
            if (num == 1) {
                System.out.print("1 is neither prime nor composite.");
            } else {
                boolean isPrime = true;

                for (int i = 2; i <= num / 2; i++) {
                    if (num % i == 0) {
                        isPrime = false;
                        break;
                    }
                }

                if (isPrime) {
                    System.out.print("" + num + " is a prime number.");
                } else {
                    System.out.print("" + num + " is a composite number.");
                }
            }
        } else {
            System.out.println("Please enter a positive integer.");
        }

        sc.close();
    }
}
