import java.util.Scanner;

public class DecimalToBinary {
    public static long decimalToBinary(long decimalNum) {
        long binaryNum = 0;
        long power = 0;

        while (decimalNum > 0) {
            long lastDigit = decimalNum % 2;
            binaryNum = binaryNum + (lastDigit * (long) Math.pow(10, power));
            decimalNum = decimalNum / 2;
            power++;
        }
        return binaryNum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        long decimalNum = sc.nextLong();

        if (decimalNum < 0) {
            System.out.println("Invalid decimal number. Decimal numbers can only contain positive integers.");
        } else {
            long binaryValue = decimalToBinary(decimalNum);
            System.out.println("The binary value of " + decimalNum + " is: " + binaryValue);
        }

        sc.close();
    }
}
