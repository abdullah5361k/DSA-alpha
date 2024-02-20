import java.util.*;

public class WaterStorage {

    // Brute force approach TC-> O(n)
    public static int storeWater(ArrayList<Integer> height) {
        int maxWater = 0;
        for (int i = 0; i < height.size(); i++) {
            for (int j = i + 1; j < height.size(); j++) {
                int minHeight = Math.min(height.get(i), height.get(j));
                int width = j - i;
                int water = minHeight * width;
                maxWater = Math.max(maxWater, water);
            }
        }
        return maxWater;
    }

    // Optimized approach TC -> O(n)
    public static int storeWaterOp(ArrayList<Integer> height) {
        int left = 0, right = height.size() - 1;
        int maxWater = 0;

        while (left < right) {
            int mh = Math.min(height.get(right), height.get(left));
            int width = right - left;
            int water = mh * width;
            maxWater = Math.max(maxWater, water);
            if (height.get(left) < height.get(right)) {
                left++;
            } else {
                right--;
            }
        }

        return maxWater;

    }

    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);

        System.out.println(storeWaterOp(height));
    }
}
