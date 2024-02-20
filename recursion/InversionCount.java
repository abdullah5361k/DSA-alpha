package DSA.recursion;

public class InversionCount {

    public static int mergeSort(int arr[], int si, int ei) {
        int c = 0;
        if (si >= ei) {
            return c;
        }

        int mid = si + (ei - si) / 2;
        c += mergeSort(arr, si, mid);
        c += mergeSort(arr, mid + 1, ei);
        c += merge(arr, si, ei, mid);
        return c;
    }

    public static int merge(int arr[], int si, int ei, int mid) {
        int count = 0;
        int temp[] = new int[ei - si + 1];
        int i = si;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= ei) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                count += mid - i + 1;
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        while (j <= ei) {
            temp[k++] = arr[j++];
        }

        for (k = 0, i = si; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }

        return count;

    }

    public static void main(String[] args) {
        // int arr[] = { 2, 4, 1, 3, 5 };
        int arr[] = { 5, 3, 2, 4, 1 };
        System.out.println(mergeSort(arr, 0, arr.length - 1));
    }
}
