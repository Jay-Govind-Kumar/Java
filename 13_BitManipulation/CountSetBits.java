import java.util.*;

public class CountSetBits {

    public static int countSetBits(int num) {
        int count = 0;

        while (num > 0) {
            if ((num & 1) == 1) {
                count++;
            }
            num = num >> 1;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int num = sc.nextInt();

        System.out.println("Count of set bits : " + countSetBits(num));

        sc.close();
    }
}
