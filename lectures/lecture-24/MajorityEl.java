import java.util.*;

public class MajorityEl {
    public static void main(String[] args) {
        // int arr[] = { 1, 3, 2, 5, 1, 3, 1, 5, 1 };
        int arr[] = { 1, 2 };

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }

        for (int i : map.keySet()) {
            if (map.get(i) >= arr.length / 3) {
                System.out.print(i);
            }
        }

    }
}
