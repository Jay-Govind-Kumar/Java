import java.util.Scanner;

public class ClearBitRange {
    public static long clearBitRange(long num, int start, int end) {
        long bitMask = (~0) << (end - 1);
        bitMask |= ((1L << start) - 1);

        return num & bitMask;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        System.out.print("Enter the starting position : ");
        int start = sc.nextInt();
        System.out.print("Enter the ending position : ");
        int end = sc.nextInt();

        long result = clearBitRange(num, start, end);
        // Decimal Form
        System.out.println(
                "After clearing bit from " + start + " to " + end + " position : " + result);

        // Binary Form
        System.out.println("After clearing bit from " + start + " to " + end + " position : "
                + Long.toBinaryString(result));

        sc.close();
    }
}
