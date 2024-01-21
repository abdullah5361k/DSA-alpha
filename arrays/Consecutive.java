import java.util.*;

public class Consecutive {

    public static int consecutiveOnes(int arr[]) {
        int n = arr.length;
        int count = 0;
        int maxOnes = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 1) {
                count++;
            } else {
                count = 0;
            }
            maxOnes = Math.max(maxOnes, count);
        }
        return maxOnes;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 0, 1, 1, 0, 1 };
        int max = consecutiveOnes(arr);
        System.out.print(max);
    }
}
