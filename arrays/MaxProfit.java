import java.util.*;

public class MaxProfit {

    public static int stock(int prices[]) {
        int buyStock = prices[0];
        int maxProfit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (buyStock < prices[i]) {
                int profit = prices[i] - buyStock;
                maxProfit = Math.max(maxProfit, profit);
            } else {
                buyStock = prices[i];
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int prices[] = { 7, 6, 4, 3, 2, 1 };
        System.out.println(stock(prices));
    }
}
