package DSA.recursion.basic;

public class ArraySorted {

    public static boolean isSorted(int arr[], int i) {
        if (i == arr.length - 1) {
            return true;
        }

        if (arr[i] > arr[i + 1]) {
            return false;
        }

        return isSorted(arr, i + 1);

    }

    public static void main(String[] args) {
        // int arr[] = { 2, 1, 4, 3, 7, 6 };
        int arr[] = { 1, 2, 4, 6, 9 };
        System.out.println(isSorted(arr, 0));
    }
}
