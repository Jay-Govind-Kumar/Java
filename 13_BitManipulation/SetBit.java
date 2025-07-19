import java.util.Scanner;

public class SetBit {

    public static long setIthBit(int num, int position) {
        int bitMask = 1 << position;
        return num | bitMask;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int num = sc.nextInt();

        System.out.print("Enter the position to be set : ");
        int position = sc.nextInt();

        long result = setIthBit(num, position);
        // print in decimal
        System.out.println("After setting bit at " + position + " position : " + result);

        // print in binary form
        System.out.println(
                "After setting bit at " + position + " position : " + Long.toBinaryString(result));

        sc.close();
    }
}
