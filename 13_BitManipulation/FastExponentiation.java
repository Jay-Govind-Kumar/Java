import java.util.*;

public class FastExponentiation {
    public static int fastExpo(int base, int power) {
        int ans = 1;

        while (power > 0) {
            if ((power & 1) != 0) {
                ans = ans * base;
            }
            base = base * base;
            power = power >> 1;
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // input
        System.out.print("Enter base : ");
        int base = sc.nextInt();
        System.out.print("Enter power : ");
        int power = sc.nextInt();

        int result = fastExpo(base, power);

        System.out.println(base + "^" + power + " : " + result);

        sc.close();
    }

}
