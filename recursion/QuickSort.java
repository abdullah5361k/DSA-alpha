package DSA.recursion;

public class QuickSort {

    public static void quick(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }

        int pIdx = partition(arr, si, ei);
        quick(arr, si, pIdx - 1);
        quick(arr, pIdx + 1, ei);
    }

    public static int partition(int arr[], int si, int ei) {
        int pivot = arr[ei];
        int j = si - 1;
        for (int i = si; i < ei; i++) {
            if (arr[i] < pivot) {
                j++;
                // Swap
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Swap
        j++;
        int temp = pivot;
        arr[ei] = arr[j];
        arr[j] = temp;
        return j;

    }

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 6, 3, 9, 5, 2, 8 };
        quick(arr, 0, arr.length - 1);
        printArray(arr);
    }
}
