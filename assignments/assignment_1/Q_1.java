public class Q_1 {
    // Given an integer array nums, return true if any value appears at least twice
    // in the array,
    // and return false if every element is distinct

    public static boolean arrayRepetiton(int num[]) {
        for (int i = 0; i < num.length; i++) {
            for (int j = i; j < num.length; j++) {
                if (num[i] == num[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int nums[] = { 1, 1, 1, 3, 3, 4, 3, 2, 4, 2 };
        // int nums[] = { 1, 2, 1, 3, 4 };
        System.out.print(arrayRepetiton(nums));
    }
}