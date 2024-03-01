package DSA.pratice.Greedy;

import java.util.*;

public class Greed {

    public static void activitySelection(int start[], int end[]) {
        ArrayList<Integer> al = new ArrayList<>();

        int act[][] = new int[start.length][3];

        for (int i = 0; i < act.length; i++) {
            act[i][0] = i;
            act[i][1] = start[i];
            act[i][2] = end[i];
        }

        Arrays.sort(act, Comparator.comparingDouble(o -> o[2]));

        int activity = 1;
        int lastEnd = act[0][2];
        al.add(0);
        for (int i = 1; i < start.length; i++) {
            if (act[i][1] >= lastEnd) {
                al.add(i);
                activity++;
                lastEnd = act[i][2];
            }
        }

        System.out.println(activity);
        System.out.println(al);

    }

    public static void knapSack(int value[], int weight[], int W) {
        double ratio[][] = new double[value.length][2];
        for (int i = 0; i < ratio.length; i++) {
            ratio[i][0] = i;
            ratio[i][1] = value[i] / (double) weight[i];
        }

        Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));

        int maxValue = 0;
        int capacity = W;
        for (int i = ratio.length - 1; i >= 0; i--) {
            int idx = (int) ratio[i][0];
            if (weight[idx] <= capacity) {
                maxValue += value[idx];
                capacity -= weight[idx];
            } else {
                maxValue += (int) ratio[i][1] * capacity;
                capacity = 0;
                break;
            }
        }

        System.out.println(maxValue);

    }

    public static void absoluteDiff(int A[], int B[]) {
        int diff = 0;
        Arrays.sort(A);
        Arrays.sort(B);
        for (int i = 0; i < A.length; i++) {
            diff += Math.abs(A[i] - B[i]);
        }
        System.out.println(diff);
    }

    public static void maxLengthOfChain() {
        int pairs[][] = { { 5, 24 }, { 39, 60 }, { 5, 28 }, { 27, 40 }, { 50, 90 } };
        Arrays.sort(pairs, Comparator.comparingDouble(o -> o[1]));
        int lastEnd = pairs[0][1];
        int chainLen = 1;
        for (int i = 1; i < pairs.length; i++) {
            if (pairs[i][0] >= lastEnd) {
                chainLen++;
                lastEnd = pairs[i][1];
            }
        }
        System.out.println(chainLen);
    }

    public static void indianCoins() {
        Integer coins[] = { 1, 2, 5, 10, 20, 50, 100, 500, 2000 };
        int v = 590;
        Arrays.sort(coins, Collections.reverseOrder());
        ArrayList<Integer> al = new ArrayList<>();
        int countOfCoins = 0;
        for (int i = 0; i < coins.length; i++) {
            if (coins[i] <= v) {
                while (coins[i] <= v) {
                    al.add(coins[i]);
                    countOfCoins++;
                    v -= coins[i];
                }
            }
        }

        System.out.println(countOfCoins);
        System.out.println(al);

    }

    public static void chocola() {
        Integer vertCost[] = { 2, 1, 3, 1, 4 };
        Integer horzCost[] = { 4, 1, 2 };
        int cost = 0;
        Arrays.sort(vertCost, Collections.reverseOrder());
        Arrays.sort(horzCost, Collections.reverseOrder());

        int h = 0, v = 0;
        int hp = 1;
        int vp = 1;
        while (h < horzCost.length && v < vertCost.length) {
            if (horzCost[h] <= vertCost[v]) {
                cost += vertCost[v] * hp;
                vp++;
                v++;
            } else {
                cost += horzCost[h] * vp;
                hp++;
                h++;
            }
        }

        while (h < horzCost.length) {
            cost += horzCost[h] * vp;
            hp++;
            h++;
        }

        while (v < vertCost.length) {
            cost += vertCost[v] * hp;
            vp++;
            v++;
        }

        System.out.println(cost);

    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 8, 10 };
        int steps = 0;
        int n = arr.length - 1;
        for (int i = 0; i < arr.length; i++) {
            steps++;
            if (arr[i] == 0) {
                steps = -1;
                break;
            }
            if ((i + arr[i]) == n) {
                i += arr[i];
            }
        }
        System.out.println(steps);
    }
}
