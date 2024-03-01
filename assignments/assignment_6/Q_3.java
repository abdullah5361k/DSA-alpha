package DSA.assignments.assignment_6;

public class Q_3 {

    public static int sort(int arr[], int si, int ei, int mid) {
        int temp[] = new int[ei - si + 1];
        int left = si;
        int right = mid + 1;
        int k = 0;
        int count = 0;
        while (left <= mid && right <= ei) {
            if (arr[left] <= arr[right]) {
                temp[k] = arr[left];
                left++;
            } else {
                count += (mid - left) + 1;
                temp[k] = arr[right];
                right++;
            }
            k++;
        }

        while (left <= mid) {
            temp[k++] = arr[left++];
        }
        while (right <= ei) {
            temp[k++] = arr[right++];
        }

        for (k = 0; k < temp.length; k++) {
            arr[si + k] = temp[k];
        }

        return count;

    }

    public static int mergeSort(int arr[], int si, int ei) {
        int count = 0;
        if (si >= ei) {
            return count;
        }

        int mid = si + (ei - si) / 2;
        count += mergeSort(arr, si, mid);
        count += mergeSort(arr, mid + 1, ei);
        count += sort(arr, si, ei, mid);
        return count;
    }

    public static void main(String[] args) {
        // int arr[] = { 5, 3, 2, 4, 1 };
        int arr[] = { 2, 4, 1, 3, 5 };
        System.out.println(mergeSort(arr, 0, arr.length - 1));
        // for (int i = 0; i < arr.length; i++) {
        // System.out.print(arr[i] + " ");
        // }
    }
}
