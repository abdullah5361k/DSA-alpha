public class DivideAndConquer {

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void mergeSort(int arr[], int si, int ei) {

        if (si >= ei) {
            return;
        }

        int mid = si + (ei - si) / 2;
        mergeSort(arr, si, mid); // Left part of an array
        mergeSort(arr, mid + 1, ei); // Right part of an array
        merge(arr, si, mid, ei);
    }

    public static void merge(int arr[], int si, int mid, int ei) {
        int temp[] = new int[ei - si + 1];
        int i = si;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= ei) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        // Left part
        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        // Right
        while (j <= ei) {
            temp[k++] = arr[j++];
        }

        // Modify original array
        for (k = 0, i = si; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }

    }

    public static void quickSort(int arr[], int si, int ei) {

        if (si >= ei) {
            return;
        }

        int pIdx = partition(arr, si, ei);
        quickSort(arr, si, pIdx - 1);
        quickSort(arr, pIdx + 1, ei);
    }

    public static int partition(int arr[], int si, int ei) {
        int pivot = arr[ei];
        int i = si - 1;
        for (int j = si; j < ei; j++) {
            if (arr[j] < pivot) {
                i++;
                // Swap
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }

        i++;
        // Swap
        int temp = pivot;
        arr[ei] = arr[i];
        arr[i] = temp;
        return i;
    }

    static int count = 0;

    public static int serach(int arr[], int target, int si, int ei) {
        if (si > ei) {
            return -1;
        }

        int mid = si + (ei - si) / 2;

        if (arr[mid] == target) {
            return mid;
        }

        if (arr[si] <= arr[mid]) {
            if (target >= arr[si] && target < arr[mid]) {
                return serach(arr, target, si, mid - 1);
            } else {
                return serach(arr, target, mid + 1, ei);
            }
        }

        else {
            if (arr[mid] <= target && arr[ei] >= target) {
                return serach(arr, target, mid + 1, ei);
            } else {
                return serach(arr, target, si, mid - 1);
            }
        }

    }

    public static void main(String[] args) {

        int arr[] = { 4, 5, 6, 7, 0, 1, 2 };

        int asn = serach(arr, 2, 0, arr.length - 1);
    }
}
