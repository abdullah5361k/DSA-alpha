public class RecursionBasic {

    public static void printDec(int n) {
        if (n == 1) {
            System.out.print(n + " ");
            return;
        }
        System.out.print(n + " ");
        printDec(n - 1);
    }

    public static void printInc(int n) {
        if (n == 1) {
            System.out.print(n + " ");
            return;
        }
        printInc(n - 1);
        System.out.print(n + " ");
    }

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        int fm = factorial(n - 1);
        int fn = n * fm;
        return fn;
    }

    public static int sumOfNatural(int n) {
        if (n == 1) {
            return 1;
        }
        int sum = n + sumOfNatural(n - 1);
        return sum;
    }

    public static int fibonacci(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        int fnm1 = fibonacci(n - 1);
        int fnm2 = fibonacci(n - 2);
        return fnm1 + fnm2;
    }

    public static boolean isSorted(int arr[], int i) {

        if (i == arr.length - 1) {
            return true;
        }

        if (arr[i] > arr[i + 1]) {
            return false;
        }

        return isSorted(arr, i + 1);
    }

    public static int firstOccurence(int arr[], int key, int i) {
        if (i == arr.length - 1) {
            return -1;
        }

        if (arr[i] == key) {
            return i;
        }

        return firstOccurence(arr, key, i + 1);

    }

    public static int lastOccurence(int arr[], int key, int i) {
        if (i == arr.length) {
            return -1;
        }
        int isFound = lastOccurence(arr, key, i + 1);
        if (isFound == -1 && arr[i] == key) {
            return i;
        }
        return isFound;
    }

    public static int tillingFloor(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        // Vertically
        int fnm1 = tillingFloor(n - 1);
        // Horizantoly
        int fnm2 = tillingFloor(n - 2);
        return fnm1 + fnm2;
    }

    public static void removeDuplicates(String str, int i, boolean arr[], StringBuilder sb) {
        if (i == str.length()) {
            System.out.println(sb);
            return;
        }

        char ch = str.charAt(i);
        if (arr[ch - 'a'] == true) {
            removeDuplicates(str, i + 1, arr, sb);
        } else {
            arr[ch - 'a'] = true;
            removeDuplicates(str, i + 1, arr, sb.append(ch));
        }

    }

    public static int friendsPairing(int n) {
        if (n == 1 || n == 2) {
            return n;
        }

        // Single
        int single = friendsPairing(n - 1);
        int pair = friendsPairing(n - 2);
        int pairWays = (n - 1) * pair;
        int totalWay = single + pairWays;
        return totalWay;

    }

    public static void printBinString(int n, int lastDigit, String str) {
        if (n == 0) {
            System.out.println(str);
            return;
        }

        printBinString(n - 1, 0, str + "0");
        if (lastDigit == 0) {
            printBinString(n - 1, 1, str + "1");
        }

    }

    public static void printString(int n, int lastDigit, String str) {
        if (n == 0) {
            System.out.println(str);
            return;
        }

        printString(n - 1, 1, str + "1");
        if (lastDigit == 1) {
            printString(n - 1, 0, str + "0");
        }

    }

    public static void main(String[] args) {
        printString(3, 1, "");
    }
}
