package DSA.recursion;

/**
 * SandRotated
 */
public class Rotated {

    public static int rotated(int arr[], int target, int si, int ei) {
        int s = si, e = ei;
        while (s <= e) {
            int mid = s + (e - s) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (arr[mid] >= arr[s]) {
                if (target >= arr[s] && target <= arr[mid]) {
                    e = mid - 1;
                } else {
                    s = mid + 1;
                }
            } else {
                if (target >= arr[mid] && target <= arr[e]) {
                    s = mid + 1;
                } else {
                    e = mid - 1;
                }
            }

        }

        return -1;
    }

    public static int sortedAndRotated(int arr[], int si, int ei, int key) {
        if (si > ei) {
            return -1;
        }

        int mid = si + (ei - si) / 2;
        if (arr[mid] == key) {
            return mid;
        }
        if (arr[mid] >= arr[si]) {
            if (key <= arr[mid] && key >= arr[si]) {
                return sortedAndRotated(arr, si, mid - 1, key);
            } else {
                return sortedAndRotated(arr, mid + 1, ei, key);
            }
        } else {
            if (key >= arr[mid] && key <= arr[ei]) {
                return sortedAndRotated(arr, mid + 1, ei, key);
            } else {
                return sortedAndRotated(arr, si, mid - 1, key);
            }
        }

    }

    public static void main(String[] args) {
        int arr[] = { 4, 5, 6, 7, 0, 1, 2 };
        System.out.println(rotated(arr, 5, 0, arr.length - 1));
    }
}