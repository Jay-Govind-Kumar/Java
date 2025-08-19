import java.util.*;

public class IncreasingOrder {

    public static void printIncreasingOrder(int n) {
        if (n == 0) {
            return;
        }
        printIncreasingOrder(n - 1);
        System.out.print(n + " ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int n = sc.nextInt();

        System.out.println("Increasing order:");
        printIncreasingOrder(n);

        sc.close();
    }
}