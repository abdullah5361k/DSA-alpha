public class LinearSearch {

    public static int linear_search(int num[], int key) {
        for (int i = 0; i < num.length; i++) {
            if (num[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        int nums[] = { 1, 2, 3, 4, 5, 6, 7, 9, 8, 0 };
        int key = 5;
        int index = linear_search(nums, key);
        if (index == -1) {
            System.out.println("Not fuound");
        } else {
            System.out.print("Key is found at index " + index);
        }
    }
}
