public class BackTracking {

    public static void changeArr(int arr[], int i, int val) {
        if (i == arr.length) {
            return;
        }

        arr[i] = val;
        changeArr(arr, i + 1, val + 1);
        arr[i] = arr[i] - 2;

    }

    public static void findSubsets(String str, StringBuilder ans, int i) {
        if (i == str.length()) {
            System.out.println(ans);
            ans.delete(0, -1);
            return;
        }

        char ch = str.charAt(i);
        findSubsets(str, ans.append(ch), i + 1);
        findSubsets(str, ans, i + 1);

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

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        findPermutations("abc", "");
    }
}
