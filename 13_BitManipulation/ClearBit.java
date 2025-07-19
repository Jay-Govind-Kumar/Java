import java.util.*;

public class ClearBit {

    public static long clearIthBit(int num, int position) {
        long bitMask = ~(1L << position);
        return num & bitMask;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int num = sc.nextInt();

        System.out.print("Enter the position to be cleared : ");
        int position = sc.nextInt();

        long result = clearIthBit(num, position);
        // print in decimal
        System.out.println("After clearing bit at " + position + " position : " + result);

        // print in binay form
        System.out.println(
                "After clearing bit at " + position + " position : " + Long.toBinaryString(result));

        sc.close();
    }
}
