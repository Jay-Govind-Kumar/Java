import java.util.Scanner;

public class EvenOdd {
    public static boolean isEven(int num) {
        boolean result = false;
        int bitMask = 1;

        if ((num & bitMask) == 0) {
            result = true;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int num = sc.nextInt();

        System.out.println((isEven(num) ? (num + " is even") : (num + " is odd")));

        sc.close();
    }
}
