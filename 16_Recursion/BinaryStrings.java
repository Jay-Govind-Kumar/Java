import java.util.*;

public class BinaryStrings {

    public static void printBinaryString(int length, int lastPlace, String str) {
        // base case
        if (length == 0) {
            System.out.println(str);
            return;
        }

        printBinaryString(length - 1, 0, str + "0");
        if (lastPlace == 0) {
            printBinaryString(length - 1, 1, str + "1");
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of string: ");
        int length = scanner.nextInt();

        printBinaryString(length, 0, "");

        scanner.close();
    }
}
