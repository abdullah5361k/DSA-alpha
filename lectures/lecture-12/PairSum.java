import java.util.*;

public class PairSum {

    public static boolean twoPairSum(ArrayList<Integer> list, int target) {
        int s = 0, e = list.size() - 1;
        while (s < e) {
            int sum = list.get(s) + list.get(e);
            if (sum == target) {
                return true;
            }

            if (sum > target) {
                e--;
            } else {
                s++;
            }
        }

        return false;
    }

    // TC -> O(n)
    public static boolean pairRotatedSum(ArrayList<Integer> list, int target) {
        int n = list.size();
        int bp = -1;
        for (int i = 0; i < n; i++) {
            if (list.get(i) > list.get(i + 1)) {
                bp = i;
                break;
            }
        }

        int left = bp + 1; // Smallest
        int right = bp; // Largest
        while (left != right) {
            int sum = list.get(left) + list.get(right);
            if (sum == target) {
                return true;
            }

            if (sum < target) {
                left = (left + 1) % n;
            } else {
                right = (n + right - 1) % n;
            }

        }

        return false;

    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i <= 6; i++) {
            list.add(i);
        }

        System.out.println(twoPairSum(list, 8));
    }
}
