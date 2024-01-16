public class ArrayWater {

    public static int trappedRainWater(int height[]) {
        // Calculate left max boundary
        int leftMax[] = new int[height.length];
        leftMax[0] = height[0];

        for (int i = 1; i < height.length; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i - 1]);
        }
        // Calcualate right max boundary
        int rightMax[] = new int[height.length];
        rightMax[height.length - 1] = height[height.length - 1];
        for (int i = height.length - 2; i >= 0; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i + 1]);
        }

        int trappedWater = 0;
        // Loop
        for (int i = 0; i < height.length; i++) {
            // WaterLevel = min(leftMax , rightMax);
            int waterLevel = Math.min(leftMax[i], rightMax[i]);
            // trapped water = waterLevel - height * width
            trappedWater += waterLevel - height[i];
        }

        return trappedWater;
    }

    public static void main(String[] args) {
        int height[] = { 4, 2, 0, 6, 3, 2, 5 };
        trappedRainWater(height);
    }
}