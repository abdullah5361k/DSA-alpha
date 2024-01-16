
public class ArrayStock {

    public static int buyAndSellStock(int prices[]) {
        int buyPrice = prices[0];
        int maxProfit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (buyPrice > prices[i]) {
                buyPrice = prices[i];
            } else {
                maxProfit = Math.max(maxProfit, prices[i] - buyPrice);
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int prices[] = { 7, 1, 5, 3, 6, 4 };
        // System.out.println(buyAndSellStock(prices));
        buyAndSellStock2(prices);
    }
}
