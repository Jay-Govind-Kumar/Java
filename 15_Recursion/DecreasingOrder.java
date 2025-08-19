import java.util.*;

public class DecreasingOrder {

    public static void printDecreasingOrder(int n) {
        if (n == 0) {
            return;
        }
        System.out.print(n + " ");
        printDecreasingOrder(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int n = sc.nextInt();

        System.out.println("Decreasing order:");
        printDecreasingOrder(n);

        sc.close();
    }
}