import java.util.*;

public class Array2 {

    // Brute force
    public static void subArraySum(int arr[]) {

        int maxSum = 0;
        int currSum = 0;
        int prefix[] = new int[arr.length];
        prefix[0] = arr[0];
        // Prefix
        for (int i = 1; i < arr.length; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                currSum = i == 0 ? prefix[j] : prefix[j] - prefix[i - 1];
                if (maxSum < currSum) {
                    maxSum = currSum;
                }
            }
        }
        System.out.println("Max Sum  " + maxSum);
    }

    public static void kadanes(int arr[]) {
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (sum < 0) {
                sum = 0;
            }
            maxSum = Math.max(sum, maxSum);
        }
        System.out.println("MAx sum: " + maxSum);
    }

    public static void kadanesForNeg(int arr[]) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < 0) {
                if (min < arr[i]) {
                    min = arr[i];
                }
            } else {
                min = arr[i];
            }
        }
        if (min < 0) {
            System.out.println("Max sum is: " + min);
        } else {
            int cs = 0;
            int ms = Integer.MIN_VALUE;
            for (int i = 0; i < arr.length; i++) {
                cs += arr[i];
                if (cs < 0) {
                    cs = 0;
                }
                ms = Math.max(ms, cs);
            }

            System.out.println("Max sum is: " + ms);
        }
    }

    public static void main(String[] args) {
        int array[] = { 1, -2, 6, -1, 3 };
        // int array[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
        // int array[] = { -2, -10, -3, -4 };
        subArraySum(array);
    }
}
