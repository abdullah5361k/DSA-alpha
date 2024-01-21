import java.util.*;

public class Kadanes {

    public static int maxSubSum(int arr[]) {
        int cs = 0;
        int maxSum = 0;
        for (int i = 0; i < arr.length; i++) {
            cs += arr[i];
            if (cs < 0) {
                cs = 0;
            } else {
                maxSum = Math.max(maxSum, cs);
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        // int array[] = { -2, -3, 4, -1, -2, 1, 5, -1 };
        int array[] = { 1, -2, 6, -1, 3 };
        System.out.println(maxSubSum(array));
    }
}
