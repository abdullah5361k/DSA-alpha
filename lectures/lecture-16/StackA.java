import java.util.*;

public class StackA {

    public static boolean isValid(String str) {
        Stack<Character> s = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') { // Opening
                s.push(ch);
            } else {
                if (s.isEmpty()) {
                    return false;
                }

                if (s.peek() == '(' && ch == ')'
                        || s.peek() == '[' && ch == ']'
                        || s.peek() == '{' && ch == '}') {
                    s.pop();
                } else {
                    return false;
                }
            }
        }
        return s.isEmpty();
    }

    public static boolean isDuplicates(String str) {
        Stack<Character> s = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            // closing
            if (ch == ')') {
                int count = 0;
                while (s.peek() != '(') {
                    s.pop();
                    count++;
                }
                if (count < 1) {
                    return true; // Duplicates exist
                } else {
                    s.pop(); // Opening pair
                }
            } else {
                s.push(ch);
            }
        }

        return false;

    }

    public static void main(String[] args) {
        String str = "({})[]()";
        System.out.println(isValid(str));
    }
}
