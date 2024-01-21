public class TwoSum {

    public static void sum(int arr[], int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if ((arr[i] + arr[j]) == target) {
                    System.out.print(i + " " + " " + j);
                }
            }
        }
    }

    public static void main(String[] args) {
        int nums[] = { 2, 7, 11, 15 };
        sum(nums, 9);
    }
}
