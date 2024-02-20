package DSA.pratice.recursion;

public class Rec {

    public static void decOrdder(int n) {
        if (n == 1) {
            System.out.print(n + " ");
            return;
        }
        System.out.print(n + " ");
        decOrdder(n - 1);
    }

    public static void incOrder(int n) {
        if (n == 1) {
            System.out.print(n + " ");
            return;
        }
        incOrder(n - 1);
        System.out.print(n + " ");
    }

    public static int fact(int n) {
        if (n == 0) {
            return 1;
        }
        return n * fact(n - 1);
    }

    public static int sumOfNuatural(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sumOfNuatural(n - 1);
    }

    public static int fibo(int n) {
        if (n == 0 || n == 1) {
            return n;
        }

        int fnm1 = fibo(n - 1);
        int fnm2 = fibo(n - 2);
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
        if (i == arr.length) {
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

        int found = lastOccurence(arr, key, i + 1);
        if (found == -1 && arr[i] == key) {
            return i;
        }
        return found;

    }

    public static int power(int a, int n) {
        if (n == 0) {
            return 1;
        }

        int pow = a * power(a, n - 1);
        return pow;

    }

    // O(logn)
    public static int optimizedPow(int a, int n) {
        if (n == 0) {
            return 1;
        }

        int halfPow = optimizedPow(a, n / 2);
        int halfSquare = halfPow * halfPow;
        if (n % 2 != 0) {
            halfSquare = a * halfSquare;
        }
        return halfSquare;

    }

    public static void printName(int n) {
        if (n == 0) {
            return;
        }

        System.out.print("Abdullah  ");
        printName(n - 1);

    }

    public static void reverseAnArray(int arr[], int start, int end) {
        if (start == end) {
            return;
        }

        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        reverseAnArray(arr, start + 1, end - 1);

    }

    public static boolean isPalindrome(String str, int i) {
        if (i == str.length() / 2) {
            return true;
        }

        if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
            return false;
        }
        return isPalindrome(str, i + 1);

    }

    public boolean isPalind(String str, int i) {
        if (i == str.length() / 2) {
            return true;
        }
        if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
            return false;
        }
        return isPalind(str, i + 1);
    }

    // public boolean isPalindrome(String s) {
    // s = s.replaceAll("[^a-zA-Z]", "").toLowerCase();
    // return isPalind(s, 0);
    // }

    public static int tillingFloor(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }

        // Vertically
        int v = tillingFloor(n - 1);
        // Horizantally
        int h = tillingFloor(n - 2);
        return v + h;
    }

    public static void removeDuplicates(String st, StringBuilder str, int i, boolean arr[]) {
        if (i == st.length()) {
            System.out.println(str);
            return;
        }

        char ch = st.charAt(i);
        if (arr[ch - 'a'] == true) {
            removeDuplicates(st, str, i + 1, arr);
        } else {
            arr[ch - 'a'] = true;
            removeDuplicates(st, str.append(ch), i + 1, arr);
        }

    }

    public static int friendsPairing(int n) {
        if (n == 1 || n == 2) {
            return n;
        }

        int single = friendsPairing(n - 1);
        int pair = friendsPairing(n - 2);
        int totalPair = (n - 1) * pair;
        return single + totalPair;

    }

    public static void binString(int n, int lastDigit, String str) {
        if (n == 0) {
            System.out.println(str);
            return;
        }
        binString(n - 1, 0, str + "0");
        if (lastDigit == 0) {
            binString(n - 1, 1, str + "1");
        }

    }

    public static void printKeyIndex(int arr[], int i, int key) {
        if (i == arr.length) {
            return;
        }

        if (arr[i] == key) {
            System.out.print(i + " ");
            printKeyIndex(arr, i + 1, key);
        } else {
            printKeyIndex(arr, i + 1, key);
        }

    }

    public static void printEngLetter(int n, String arr[]) {
        if (n == 0) {
            return;
        }

        printEngLetter(n / 10, arr);
        int last = n % 10;
        System.out.print(arr[last] + " ");

        // int last = n % 10;
        // System.out.println(last);
        // n = n / 10;
        // System.out.println(n);
    }

    public static int lengthOfString(String str, int i) {
        if (i == str.length()) {
            return i;
        }

        return lengthOfString(str, i + 1);
    }

    static int count = 0;

    public static void substrings(String str, int start, int end) {
        if (start == str.length() && end == str.length()) {
            return;
        }
        if (end == str.length() + 1) {
            substrings(str, start + 1, start + 1);
        } else {
            if (end != 0 && str.charAt(start) == str.charAt(end - 1)) {
                count++;
            }
            System.out.print(str.substring(start, end) + " ");
            substrings(str, start, end + 1);
        }
    }

    public static void reverseString(String str, int i) {
        if (i == str.length()) {
            return;
        }

        reverseString(str, i + 1);
        System.out.print(str.charAt(i));

    }

    static int last = -1;
    static int first = -1;

    // public static void occurence(String str, int i, char f) {
    // if (i == str.length()) {
    // return;
    // }
    // if (str.charAt(i) == f) {
    // last = i;
    // }
    // occurence(str, i + 1, f);
    // if (str.charAt(i) == f) {
    // first = i;
    // }
    // }
    public static void occurence(String str, int i, char f) {
        if (i == str.length()) {
            return;
        }
        if (str.charAt(i) == f) {
            if (first == -1) {
                first = i;
            } else {
                last = i;
            }
        }

        occurence(str, i + 1, f);
    }

    public static void xAtend(String str, StringBuilder sb, int i, int count) {
        if (i == str.length()) {
            for (int j = 0; j < count; j++) {
                sb.append('x');
            }
            System.out.print(sb);
            return;
        }
        char ch = str.charAt(i);
        if (ch == 'x') {
            count++;
            xAtend(str, sb, i + 1, count);
        } else {
            sb.append(ch);
            xAtend(str, sb, i + 1, count);
        }

    }

    public static void subSequence(String str, int i, String sb) {
        if (i == str.length()) {
            System.out.println(sb);
            return;
        }

        char ch = str.charAt(i);
        subSequence(str, i + 1, sb + ch);
        subSequence(str, i + 1, sb);
    }

    public static int binSearch(int arr[], int target, int s, int e) {
        if (s > e) {
            return -1;
        }

        int m = s + (e - s) / 2;
        if (arr[m] == target) {
            return m;
        }

        if (target > arr[m]) {
            return binSearch(arr, target, m + 1, e);
        } else {
            return binSearch(arr, target, s, m - 1);
        }

    }

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }

        return n * fact(n - 1);
    }

    public static int search(int arr[], int i, int target) {
        if (i == arr.length) {
            return -1;
        }

        if (arr[i] == target) {
            return i;
        }

        return search(arr, i + 1, target);

    }

    public static void printStars(int r, int c) {
        if (r == 0) {
            return;
        }
        if (c < r) {
            printStars(r, c + 1);
            System.out.print("*");
        } else {
            printStars(r - 1, 0);
            System.err.println();
        }
    }

    public static void mergeSort(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }

        int mid = si + (ei - si) / 2;
        mergeSort(arr, si, mid);
        mergeSort(arr, mid + 1, ei);
        sort(arr, si, ei, mid);

    }

    public static void sort(int arr[], int si, int ei, int mid) {
        int temp[] = new int[ei - si + 1];
        int i = si;
        int j = mid + 1;
        int k = 0;
        int p = 0;

        while (i <= mid && j <= ei) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            if (arr[i] > arr[j] && i < j) {
                p++;
                System.out.println(p);
            }
            k++;
        }

        while (i <= mid) {
            temp[k++] = arr[i++];
            // k++;
            // i++;
        }

        while (j <= ei) {
            temp[k++] = arr[j++];
            // k++;
            // j++;
        }

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
        int j = si - 1;

        for (int i = si; i < ei; i++) {
            if (arr[i] < pivot) {
                j++;

                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }

        j++;
        int temp = arr[ei];
        arr[ei] = arr[j];
        arr[j] = temp;
        return j;

    }

    public static void skip(String str, int i, StringBuilder sb) {
        if (i == str.length()) {
            System.out.println(sb);
            return;
        }

        char ch = str.charAt(i);
        if (ch == 'a') {
            skip(str, i + 1, sb);
        } else {
            skip(str, i + 1, sb.append(ch));
        }

    }

    public static void subSet(String str, int i, String sb) {
        if (i == str.length()) {
            System.out.println(sb);
            return;
        }
        char ch = str.charAt(i);
        subSet(str, i + 1, sb + ch);
        subSet(str, i + 1, sb);
    }

    public static void mergeSortOnString(String str[], int si, int ei) {
        if (si >= ei) {
            return;
        }

        int mid = si + (ei - si) / 2;
        mergeSortOnString(str, si, mid);
        mergeSortOnString(str, mid + 1, ei);
        sortAString(str, si, ei, mid);
    }

    public static void sortAString(String str[], int si, int ei, int mid) {
        String temp[] = new String[ei - si + 1];
        int i = si;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= ei) {
            if (str[j].compareTo(str[i]) < 0) {
                temp[k] = str[j];
                j++;
            } else {
                temp[k] = str[i];
                i++;
            }
            k++;
        }

        while (i <= mid) {
            temp[k++] = str[i++];
        }

        while (j <= ei) {
            temp[k++] = str[j++];
        }

        for (k = 0, i = si; k < temp.length; k++, i++) {
            str[i] = temp[k];
        }

    }

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void inversionCount(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }

        int pIndx = partition1(arr, si, ei);
        inversionCount(arr, si, pIndx - 1);
        inversionCount(arr, pIndx + 1, ei);

    }

    static int c = 0;

    public static int partition1(int arr[], int si, int ei) {
        int pivot = arr[ei];
        int j = si - 1;

        for (int i = si; i < ei; i++) {
            if (arr[i] < pivot) {
                j++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
            if (arr[i] > pivot) {
                count++;
            }
        }

        j++;
        int temp = arr[ei];
        arr[ei] = arr[j];
        arr[j] = temp;
        return j;
    }

    public static void bubbleSort(int arr[], int i, int j) {
        if (i == arr.length - 1) {
            return;
        }

        if (j == arr.length - 1 - i) {
            bubbleSort(arr, i + 1, 0);
        } else {
            if (arr[j] > arr[j + 1]) {
                // Temp
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
            bubbleSort(arr, i, j + 1);
        }

    }

    public static void insertionSort(int arr[], int i) {
        if (i == arr.length) {
            return;
        }

        int j = i;
        while (j > 0 && arr[j - 1] > arr[j]) {
            // Swap
            int temp = arr[j - 1];
            arr[j - 1] = arr[j];
            arr[j] = temp;
            j--;
        }
        insertionSort(arr, i + 1);

    }

    public static double St(double a, int n) {
        if (n == 0) {
            return 1;
        }

        double d = St(a, n / 2);
        double p = d * d;
        if (n % 2 != 0) {
            p = a * p;
        }

        return p;

    }

    public static void towerOfHonoi(int n, String src, String helper, String dest) {
        if (n == 1) {
            System.out.println("transfer dist " + n + "th from  " + src + " to " + dest);
            return;
        }
        towerOfHonoi(n - 1, src, dest, helper);
        System.out.println("transfer dist " + n + "th from  " + src + " to " + dest);
        towerOfHonoi(n - 1, helper, src, dest);
    }

    public static void subSets(String str, String newStr, int i) {
        if (i == str.length()) {
            System.out.println(newStr);
            return;
        }
        char ch = str.charAt(i);
        subSets(str, newStr + ch, i + 1);
        subSets(str, newStr, i + 1);
    }

    public static void findPermutations(String str, String ans) {
        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);
            String newStr = str.substring(0, i) + str.substring(i + 1);
            findPermutations(newStr, ans + ch);
        }

    }

    public static boolean nQueens(char board[][], int row) {
        if (row == board.length) {
            // printQueen(board);
            return true;
        }

        for (int j = 0; j < board.length; j++) {
            if (isSafe(board, row, j)) {
                board[row][j] = 'Q';
                if (nQueens(board, row + 1)) {
                    return true;
                }
                ;
                board[row][j] = 'x';
            }
        }

        return false;

    }

    public static boolean isSafe(char board[][], int row, int col) {

        // Verticall
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }

        // Diagonal left
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        // Diagonal right
        for (int i = row - 1, j = col + 1; i >= 0 && j <= board.length - 1; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        return true;

    }

    public static void printQueen(char board[][]) {
        System.out.println("__________Queen_____________");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void combinations(String str1, String str2, String ans, int i, int j) {
        if (ans.length() == 2) {
            System.out.print(ans + " ");
        }

        if (i == str1.length()) {
            return;
        }

        if (str2.length() == j) {
            combinations(str1, str2, "", i + 1, 0);
        } else {
            char ch = str1.charAt(i);
            char ch2 = str2.charAt(j);
            String str = "" + ch + "" + ch2;
            combinations(str1, str2, str, i, j + 1);
        }

    }

    public static String keypad[] = { "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };

    public static void printCombo(String digit, int idx, String combination) {
        if (idx == digit.length()) {
            System.out.print(combination + " ");
            return;
        }
        char curr = digit.charAt(idx);
        String mapping = keypad[curr - '0'];
        for (int i = 0; i < mapping.length(); i++) {
            printCombo(digit, idx + 1, combination + mapping.charAt(i));
        }
    }

    public static int gridWays(String s, int i, int j, int n, int m) {
        if (i == n - 1 || j == m - 1) {
            System.out.println(s);
            return 1;
        } else if (i == n || j == n) {
            return 0;
        }

        int w1 = gridWays(s + 'D', i + 1, j, n, m);
        int w2 = gridWays(s + 'R', i, j + 1, n, m);
        return w1 + w2;

    }

    public static boolean knight(int grid[][], int row, int col, int num) {
        int n = grid.length;
        if (grid[row][col] == (n * n) - 1) {
            return true;
        }
        // 2 Down 1 right
        int i = row + 2;
        int j = col + 1;
        if (i < n && j < n && grid[i][j] == num + 1)
            return knight(grid, i, j, num + 1);

        // 2 Down 1 left
        i = row + 2;
        j = col - 1;
        if (i < n && j >= 0 && grid[i][j] == num + 1)
            return knight(grid, i, j, num + 1);

        // 2 up 1 right
        i = row - 2;
        j = col + 1;
        if (i >= 0 && j < n && grid[i][j] == num + 1)
            return knight(grid, i, j, num + 1);

        // 2 up 1 left
        i = row - 2;
        j = col - 1;
        if (i >= 0 && j >= 0 && grid[i][j] == num + 1)
            return knight(grid, i, j, num + 1);

        // 2 left 1 up
        i = row - 1;
        j = col - 2;
        if (i >= 0 && j >= 0 && grid[i][j] == num + 1)
            return knight(grid, i, j, num + 1);

        // 2 left 1 down
        i = row + 1;
        j = col - 2;
        if (i < n && j >= 0 && grid[i][j] == num + 1)
            return knight(grid, i, j, num + 1);

        // 2 right 1 up
        i = row - 1;
        j = col + 2;
        if (i >= 0 && j < n && grid[i][j] == num + 1)
            return knight(grid, i, j, num + 1);

        // 2 right 1 down
        i = row + 1;
        j = col + 2;
        if (i < n && j < n && grid[i][j] == num + 1)
            return knight(grid, i, j, num + 1);

        return false;

    }

    public static boolean kSafe(char grid[][], int row, int col) {
        int n = grid.length;
        // 2 Down 1 right
        int i = row + 2;
        int j = col + 1;
        if (i < n && j < n && grid[i][j] == 'k')
            return false;

        // 2 Down 1 left
        i = row + 2;
        j = col - 1;
        if (i < n && j >= 0 && grid[i][j] == 'k')
            return false;

        // 2 up 1 right
        i = row - 2;
        j = col + 1;
        if (i >= 0 && j < n && grid[i][j] == 'k')
            return false;

        // 2 up 1 left
        i = row - 2;
        j = col - 1;
        if (i >= 0 && j >= 0 && grid[i][j] == 'k')
            return false;

        // 2 left 1 up
        i = row - 1;
        j = col - 2;
        if (i >= 0 && j >= 0 && grid[i][j] == 'k')
            return false;

        // 2 left 1 down
        i = row + 1;
        j = col - 2;
        if (i < n && j >= 0 && grid[i][j] == 'k')
            return false;

        // 2 right 1 up
        i = row - 1;
        j = col + 2;
        if (i >= 0 && j < n && grid[i][j] == 'k')
            return false;

        // 2 right 1 down
        i = row + 1;
        j = col + 2;
        if (i < n && j < n && grid[i][j] == 'k')
            return false;

        return true;
    }

    public static int knight = 0;

    public static void nKnight(char board[][], int row, int col) {
        if (row == board.length) {
            printArr(board);
            return;
        }
        if (kSafe(board, row, col)) {
            board[row][col] = 'k';
            if (col != board.length - 1)
                nKnight(board, row, col + 1);
            else
                nKnight(board, row + 1, 0);
            board[row][col] = '.';
        }

        if (col != board.length - 1)
            nKnight(board, row, col + 1);
        else
            nKnight(board, row + 1, 0);

        // if (col == board.length) {
        // printArr(board);
        // return;
        // }
        // for (int i = 0; i < board.length; i++) {
        // if (kSafe(board, i, col)) {
        // board[i][col] = 'k';
        // nKnight(board, i, col + 1);
        // board[i][col] = '.';
        // }
        // }
    }

    public static void printArr(char ch[][]) {
        System.out.println("_______K_____________");
        for (int i = 0; i < ch.length; i++) {
            for (int j = 0; j < ch.length; j++) {
                System.out.print(ch[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static boolean isValid(int sd[][], int row, int col, int digit) {
        // Row
        for (int i = 0; i < sd.length; i++) {
            if (sd[i][col] == digit)
                return false;
        }

        // Column
        for (int j = 0; j < sd.length; j++) {
            if (sd[row][j] == digit)
                return false;
        }

        // Grid
        int sr = (row / 3) * 3;
        int sc = (col / 3) * 3;
        for (int i = sr; i < sr + 3; i++) {
            for (int j = sc; j < sc + 3; j++) {
                if (sd[i][j] == digit)
                    return false;
            }
        }

        return true;

    }

    public static boolean sudoku(int sd[][], int row, int col) {
        if (row == 9) {
            return true;
        }
        if (col == 9) {
            return sudoku(sd, row + 1, 0);
        } else {
            if (sd[row][col] != 0) {
                return sudoku(sd, row, col + 1);
            }

            for (int i = 1; i <= 9; i++) {
                if (isValid(sd, row, col, i)) {
                    sd[row][col] = i;
                    if (sudoku(sd, row, col + 1)) {
                        return true;
                    }
                    sd[row][col] = 0;
                }
            }
        }

        return false;

    }

    public static void main(String[] args) {
        // int grid[][] = { { 0, 11, 16, 5, 20 }, { 17, 4, 19, 10, 15 }, { 12, 1, 8, 21,
        // 6 }, { 3, 18, 23, 14, 9 },
        // { 24, 13, 2, 7, 22 } };

        // char ch[][] = new char[3][3];
        // for (int i = 0; i < ch.length; i++) {
        // for (int j = 0; j < ch.length; j++) {
        // ch[i][j] = '.';
        // }
        // }

        // nKnight(ch, 0, 0);
        int p[][] = {
                { 0, 0, 8, 0, 0, 0, 0, 0, 0 },
                { 4, 9, 0, 1, 5, 7, 0, 0, 2 },
                { 0, 0, 3, 0, 0, 4, 1, 9, 0 },
                { 1, 8, 5, 0, 6, 0, 0, 2, 0 },
                { 0, 0, 0, 0, 2, 0, 0, 6, 0 },
                { 9, 6, 0, 4, 0, 5, 3, 0, 0 },
                { 0, 3, 0, 0, 7, 2, 0, 0, 4 },
                { 0, 4, 9, 0, 3, 0, 0, 5, 7 },
                { 8, 2, 7, 0, 0, 9, 0, 1, 3 }
        };

        System.out.println(sudoku(p, 0, 0));

        for (int i = 0; i < p.length; i++) {
            for (int j = 0; j < p.length; j++) {
                System.out.print(p[i][j] + " ");
            }
            System.out.println();
        }

    }
}
