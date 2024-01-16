public class BinarySearch {

    public static int binary(int num[], int key) {
        int start = 0, end = num.length - 1;

        while (start <= end) {
            // Mid
            int mid = (start + end) / 2;

            // Comparison
            if (num[mid] == key) {
                return num[mid];
            }

            if (num[mid] > key) {
                end = mid - 1;
            } else {
                start = start + 1;
            }

        }
        return -1;
    }

    public static void main(String args[]) {
        int nums[] = { 2, 4, 6, 8, 10, 12, 14 };
        System.out.println(binary(nums, 10));
    }
}
