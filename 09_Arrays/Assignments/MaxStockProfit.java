import java.util.Scanner;

public class MaxStockProfit {

    public static int stockProfit(int[] prices) {
        
        int maxProfit = 0;
        int buyPrice = Integer.MAX_VALUE;

        for (int i = 0; i < prices.length; i++) {
            if (buyPrice > prices[i]) {
                buyPrice = prices[i];
            } else {
                int profit = prices[i] - buyPrice;
                maxProfit = Math.max(profit, maxProfit);
            }
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array : ");
        int size = sc.nextInt();

        int[] stockPrices = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter the " + (i + 1) + " Day Price : ");
            stockPrices[i] = sc.nextInt();
        }

        System.out.println("Profit : " + stockProfit(stockPrices));

        sc.close();
    }
}
