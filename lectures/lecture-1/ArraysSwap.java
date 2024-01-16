public class ArraysSwap {

    public static void reverse(int num[]) {
        int start = 0, end = num.length - 1;

        while (start < end) {
            int temp = num[end];
            num[end] = num[start];
            num[start] = temp;
            start++;
            end--;
        }
    }

    public static void main(String args[]) {
        int numbers[] = { 2, 3, 4, 5, 6, 7 };
        reverse(numbers);
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}
