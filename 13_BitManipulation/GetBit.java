import java.util.Scanner;

public class GetBit {
    public static int getIthBit(long num, int position) {
        long bitmask = 1L << position;
        return ((num & bitmask) != 0) ? 1 : 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        long num = sc.nextLong();

        System.out.print("Enter the position : ");
        int position = sc.nextInt();

        String result = "Bit at " + position + " position is : " + getIthBit(num, position);

        System.out.println(result);
        sc.close();
    }
}
