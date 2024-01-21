import java.util.*;

public class Q_3 {

    public static int maxProfit(int prices[]) {
        int buyPrice = prices[0];
        int maxProfit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < buyPrice) {
                buyPrice = prices[i];
            } else {
                int profit = prices[i] - buyPrice;
                maxProfit = Math.max(profit, maxProfit);
            }
        }

        return maxProfit;

    }

    public static void main(String[] args) {
        int prices[] = { 7, 6, 4, 3, 1 };
        System.out.println(maxProfit(prices));
    }
}
