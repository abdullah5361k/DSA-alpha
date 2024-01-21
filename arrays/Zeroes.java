public class Zeroes {

    // Brute force
    public static void zeroesAtEnd(int arr[]) {
        int n = arr.length;
        int temp[] = new int[n];
        int j = 0;
        // Moves all non zeors into another array
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                temp[j] = arr[i];
                j++;
            }
        }

        // Modify original array
        for (int i = 0; i < n; i++) {
            arr[i] = temp[i];
        }

    }

    // Optimal approach
    public static void zeroesAtEndOp(int arr[]) {
        int n = arr.length;
        int j = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                j = i;
                break;
            }
        }

        for (int i = j + 1; i < n; i++) {
            if (arr[i] != 0) {
                // Swap with j
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }

    }

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int array[] = { 1, 0, 2, 3, 0, 4, 0, 1 };
        zeroesAtEndOp(array);
        printArray(array);
    }
}
