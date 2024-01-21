import java.util.*;

public class RainWater {

    public static int trappedRainWater(int height[]) {
        int n = height.length;
        // Left max of each trap
        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for (int i = 1; i < height.length; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i - 1]);
        }

        // Left ->
        System.out.println("Left ->");
        for (int i = 0; i < n; i++) {
            System.out.print(leftMax[i] + ",");
        }

        System.out.println();

        // Right max for each trap
        int rightMax[] = new int[n];
        rightMax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i + 1]);
        }

        // Right ->
        System.out.println("Right ->");
        for (int i = 0; i < n; i++) {
            System.out.print(rightMax[i] + ",");
        }

        System.out.println();

        System.out.println("water on each trap");
        // Trapped water
        int trapped = 0;
        for (int i = 0; i < n; i++) {
            int waterLevel = Math.min(rightMax[i], leftMax[i]) - height[i];
            System.out.print(waterLevel + ",");
            trapped += waterLevel;
        }

        return trapped;
    }

    public static void main(String[] args) {
        int height[] = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
        int trap = trappedRainWater(height);
        System.out.println();
        System.out.println(trap);
    }
}
