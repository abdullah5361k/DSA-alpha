
public class Duplicates {

    // }
    public static int removeDuplicates(int arr[], int n) {

        int[] temp = new int[n];

        // Start traversing elements
        int j = 0;
        for (int i = 0; i < n - 1; i++) {
            // If current element is not equal to next
            // element then store that current element
            if (arr[i] != arr[i + 1])
                temp[j++] = arr[i];
        }

        for (int i = 0; i < temp.length; i++) {
            System.out.print(temp[i] + ",");
        }

        // Store the last element as whether it is unique or
        // repeated, it hasn't stored previously
        temp[j++] = arr[n - 1];

        // Modify original array
        for (int i = 0; i < j; i++)
            arr[i] = temp[i];

        return j;

    }

    public static void main(String[] args) {
        int arr[] = { 1, 1, 1, 2, 2, 3, 3, 3, 3, 4, 4 };
        int n = arr.length;
        n = removeDuplicates(arr, n);

        // Print updated array
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }
}
