package DSA.assignments.assignment_6;

public class Q_1 {
    public static void mergeSort(String str[], int si, int ei) {
        if (si >= ei) {
            return;
        }

        int mid = si + (ei - si) / 2;
        mergeSort(str, si, mid);
        mergeSort(str, mid + 1, ei);
        sort(str, si, ei, mid);
    }

    public static void sort(String str[], int si, int ei, int mid) {
        String temp[] = new String[ei - si + 1];
        int left = si;
        int right = mid + 1;
        int k = 0;
        while (left <= mid && right <= ei) {
            if (str[left].compareTo(str[right]) < 0) {
                temp[k] = str[left];
                left++;
            } else {
                temp[k] = str[right];
                right++;
            }
            k++;
        }

        while (left <= mid) {
            temp[k++] = str[left++];
        }

        while (right <= ei) {
            temp[k++] = str[right++];
        }

        for (k = 0; k < temp.length; k++) {
            str[si + k] = temp[k];
        }

    }

    public static void main(String[] args) {
        String str[] = { "sun", "earth", "mars", "mercury" };
        mergeSort(str, 0, str.length - 1);
        // System.out.println(str[0].compareTo(str[2]));
        for (int i = 0; i < str.length; i++) {
            System.out.print(str[i] + " ");
        }
    }

}
