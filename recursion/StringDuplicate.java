package DSA.recursion;

public class StringDuplicate {

    public static void removeDuplicates(String str, boolean arr[], String newStr, int i) {
        if (i == str.length()) {
            System.out.println(newStr);
            return;
        }

        char ch = str.charAt(i);
        if (arr[ch - 'a'] == true) {
            removeDuplicates(str, arr, newStr, i + 1);
        } else {
            arr[ch - 'a'] = true;
            removeDuplicates(str, arr, newStr + ch, i + 1);
        }

    }

    public static void main(String[] args) {
        boolean ar[] = new boolean[26];
        removeDuplicates("appnacollege", ar, "", 0);
    }
}
