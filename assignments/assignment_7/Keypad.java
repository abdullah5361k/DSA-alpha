package DSA.assignments.assignment_7;

public class Keypad {

    public static String keyboard[] = { "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };

    public static void keyboardCombinations(String digit, int idx, String ans) {
        if (idx == digit.length()) {
            System.out.print(ans + " ");
            return;
        }
        char ch = digit.charAt(idx);
        String str = keyboard[ch - '0'];
        for (int i = 0; i < str.length(); i++) {
            char ch2 = str.charAt(i);
            keyboardCombinations(digit, idx + 1, ans + ch2);
        }
    }

    public static void main(String[] args) {
        keyboardCombinations("12", 0, "");
    }
}
