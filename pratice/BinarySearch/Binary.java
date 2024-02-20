package DSA.pratice.BinarySearch;

/**
 * Binary
 */
public class Binary {

    public static void rotated(int arr[]) {
        int si = 0, ei = arr.length - 1;
        int ans = Integer.MAX_VALUE;
        int a = -1;
        while (si <= ei) {
            int mid = si + (ei - si) / 2;
            if (arr[si] <= arr[mid]) {
                if (ans > arr[si]) {
                    ans = arr[si];
                    a = si;
                }
                si = mid + 1;
            } else {
                if (ans > arr[mid]) {
                    ans = arr[mid];
                    a = mid;
                }
                ei = mid - 1;
            }
        }
        System.out.println(ans);
        System.out.println(a);
    }

    public static void peak(int arr[]) {
        int si = 1, ei = arr.length - 2;
        while (si <= ei) {
            int mid = si + (ei - si) / 2;
            if (arr[mid] > arr[mid + 1] && arr[mid] > arr[mid - 1]) {
                System.out.println(mid);
            }
            if (arr[mid] > arr[mid - 1]) {
                si = mid + 1;
            } else {
                ei = mid - 1;
            }

        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 5, 1 };
        peak(arr);
    }
}