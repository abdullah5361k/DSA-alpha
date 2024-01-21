import java.util.*;

public class LargestElement {

    public static int largestElementInArray(int arr[]) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            // largest = Math.max(largest, arr[i]);
            if (largest < arr[i]) {
                largest = arr[i];
            }
        }

        return largest;
    }

    public static void main(String[] args) {
        int array[] = { 4, 7, 8, 6, 7, 6 };
        System.out.print(largestElementInArray(array));
    }
}
