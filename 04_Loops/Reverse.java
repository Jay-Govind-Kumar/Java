import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a natural number: ");
        int num = sc.nextInt();

        int copyNum = num;
        int reverse = 0;

        // 1st method
        while (num != 0) {
            int rem = num % 10;
            reverse = (reverse * 10) + rem;
            num = num / 10;
        }

        // 2nd method: convert integer to string to preserve leading zeros
        String numStr = Integer.toString(copyNum);
        String reversedStr = new StringBuilder(numStr).reverse().toString();

        System.out.println("The reverse of the number is: " + reverse);
        System.out.println("The reverse of the number is: " + reversedStr);

        sc.close();
    }
}

/*
 * Both codes are corrcet but with the first code we can't reverse a number
 * which ends with 0. For example, if we enter 120, the output will be 21
 * instead of 021.
 */