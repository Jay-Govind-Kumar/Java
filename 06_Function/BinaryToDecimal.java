import java.util.Scanner;

public class BinaryToDecimal {

    public static boolean isValidBinary(long binaryNum) {
        if (binaryNum == 0) {
            return true;
        }

        while (binaryNum > 0) {
            long lastDigit = binaryNum % 10;
            if (lastDigit != 0 && lastDigit != 1) {
                return false;
            }
            binaryNum = binaryNum / 10;
        }
        return true;
    }

    public static long binaryToDecimal(long binaryNum) {
        long decimalNum = 0;
        long power = 0;

        while (binaryNum > 0) {
            long lastDigit = binaryNum % 10;
            binaryNum = binaryNum / 10;
            decimalNum = decimalNum + (lastDigit * (long) Math.pow(2, power));
            power++;
        }
        return decimalNum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a binary number: ");
        long binaryNum = sc.nextLong();

        if (binaryNum < 0 || !isValidBinary(binaryNum)) {
            System.out.println("Invalid binary number. Binary numbers can only contain 0s and 1s.");
        } else {
            long decimalValue = binaryToDecimal(binaryNum);
            System.out.println("The decimal value of " + binaryNum + " is: " + decimalValue);
        }

        sc.close();
    }
}