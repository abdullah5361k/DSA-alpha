import java.util.*;

public class ReverseString {

    public static String reverseAString(String str) {
        Stack<Character> s = new Stack<>();
        int idx = 0;
        while (idx < str.length()) {
            s.push(str.charAt(idx));
            idx++;
        }
        StringBuilder ans = new StringBuilder("");
        while (!s.isEmpty()) {
            char ch = s.pop();
            ans.append(ch);
        }

        return ans.toString();
    }

    public static void main(String[] args) {
        System.out.println(reverseAString("abcs"));
    }
}
