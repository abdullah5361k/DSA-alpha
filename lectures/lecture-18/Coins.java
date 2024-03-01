import java.util.*;

public class Coins {
    public static void main(String[] args) {
        Integer coins[] = { 1, 2, 5, 10, 20, 50, 100, 500, 2000 };
        Arrays.sort(coins, Comparator.reverseOrder());

        int countOfCoins = 0;
        int amount = 590;
        ArrayList<Integer> al = new ArrayList<>();

        for (int i = 0; i < coins.length; i++) {
            if (coins[i] <= amount) {
                while (coins[i] <= amount) {
                    countOfCoins++;
                    al.add(coins[i]);
                    amount = amount - coins[i];
                }
            }
        }

        System.out.println(amount);
        System.out.println(countOfCoins);
        System.out.println(al);

    }
}
