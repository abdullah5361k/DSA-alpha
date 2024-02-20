package DSA.recursion;

public class SubStrings {

    public static void subStrings(String str, int i, int j) {
        if (i == str.length() - 1 && j == str.length() + 1) {
            return;
        }

        if (j == str.length() + 1) {
            subStrings(str, i + 1, i + 2);
        } else {
            System.out.println(str.substring(i, j));
            subStrings(str, i, j + 1);
        }

    }

    public static void main(String[] args) {
        subStrings("abcab", 0, 0);
    }
}
