import java.util.*;

public class CheckPowerOf2 {

    public static boolean isPowerOf2(int num) {
        return (num & (num - 1)) == 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int num = sc.nextInt();

        System.out.println((isPowerOf2(num) ? (num + " is power of 2") : (num + " is not power of 2")));

        sc.close();
    }
}

/*
 * Any number which is power of 2 has a property that when we apply `&`
 * operation on that number with less than that number it will give 0.
 * for eg.-
 * 4 = 0100
 * 3 = 0011
 * 4 & 3 = 0 (4 is power of 2)
 */