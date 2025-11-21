import java.util.*;

public class IndianCoins {
    public static void main(String[] args) {
        int[] denominations = { 1, 2, 5, 10, 20, 50, 100, 200, 500, 2000 };
        int amount = 590;

        int numCoins = 0;
        ArrayList<Integer> coinsUsed = new ArrayList<>();

        for (int i = denominations.length - 1; i >= 0; i--) {
            if (denominations[i] <= amount) {
                while (denominations[i] <= amount) {
                    amount -= denominations[i];
                    numCoins++;
                    coinsUsed.add(denominations[i]);
                }
            }
        }
        System.out.println("Number of coins used: " + numCoins);
        System.out.println("Coins used: " + coinsUsed);
    }
}
