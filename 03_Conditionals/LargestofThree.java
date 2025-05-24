import java.util.Scanner;

public class LargestofThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter three numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        // 1st way - Using Nested if-else statements
        if (num1 > num2) {
            if (num1 > num3) {
                System.out.print(num1 + " is the largest number.");
            } else {
                System.out.print(num3 + " is the largest number.");
            }
        } else {
            if (num2 > num3) {
                System.out.print(num2 + " is the largest number.");
            } else {
                System.out.print(num3 + " is the largest number.");
            }
        }

        // 2nd way - Using && operator
        if (num1 > num2 && num1 > num3) {
            System.out.print(num1 + " is the largest number.");
        } else if (num2 > num3) {
            System.out.print(num2 + " is the largest number.");
        } else {
            System.out.print(num3 + " is the largest number.");
        }

        // 3rd way - Using Ternary operator
        int largest = (num1 > num2) ? ((num1 > num2) ? num1 : num3) : ((num2 > num3) ? num2 : num3);
        System.out.print(largest + " is the largest number.");

        sc.close();
    }
}
