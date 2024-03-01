package DSA.pratice.Stackk;

import java.util.*;

public class StackA {
    /**
     * * Print stack
     * 
     * @param s
     */
    public static void printStack(Stack<Integer> s) {
        Stack<Integer> s2 = s;
        while (!s2.isEmpty()) {
            System.out.print(s2.peek() + " ");
            s2.pop();
        }
        System.out.println();
    }

    /**
     * * Push data at the end of stack
     * 
     * @param s
     * @param data
     */
    public static void pushAtBottom(Stack<Integer> s, int data) {
        if (s.isEmpty()) {
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtBottom(s, data);
        s.push(top);
    }

    /**
     * * Reverse a string
     * 
     * @param str
     * @return
     */
    public static String reverseString(String str) {
        Stack<Character> s = new Stack<>();
        int idx = 0;
        while (idx < str.length()) {
            s.push(str.charAt(idx));
            idx++;
        }

        StringBuilder sb = new StringBuilder();
        while (!s.isEmpty()) {
            sb.append(s.peek());
            s.pop();
        }

        return sb.toString();
    }

    /**
     * * Reverse Stack
     * 
     * @param s
     */
    public static void reverseStack(Stack<Integer> s) {
        if (s.isEmpty()) {
            return;
        }
        int top = s.pop();
        reverseStack(s);
        pushAtBottom(s, top);
    }

    /**
     * * Stock and Span
     * 
     * @param stock
     * @param span
     */
    public static void stockSpan(int stock[], int span[]) {
        Stack<Integer> s = new Stack<>();
        s.push(0);
        span[0] = 1;
        for (int i = 1; i < stock.length; i++) {
            int currStock = stock[i];
            while (!s.isEmpty() && currStock >= stock[s.peek()]) {
                s.pop();
            }
            if (s.isEmpty()) {
                span[i] = i + 1;
            } else {
                span[i] = i - s.peek();
            }
            s.push(i);
        }
    }

    /**
     * * Next Greater Elemnt in the same array
     * 
     * @param arr
     */
    public static void nextGreaterElement(int arr[]) {
        int nxtGreater[] = new int[arr.length];
        Stack<Integer> s = new Stack<>();

        for (int i = arr.length - 1; i >= 0; i--) {
            int currEl = arr[i];
            while (!s.isEmpty() && currEl >= arr[s.peek()]) {
                s.pop();
            }
            if (s.isEmpty()) {
                nxtGreater[i] = -1;
            } else {
                nxtGreater[i] = arr[s.peek()];
            }
            s.push(i);
        }

        for (int i = 0; i < nxtGreater.length; i++) {
            System.out.print(nxtGreater[i] + "  ");
        }
        System.out.println();

    }

    public static boolean isValid(String str) {
        Stack<Character> s = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '(' || ch == '[' || ch == '{') {
                s.push(ch);
            } else {
                if (s.isEmpty()) {
                    return false;
                }
                if ((s.peek() == '(' && ch == ')') || (s.peek() == '[' && ch == ']')
                        || (s.peek() == '{' && ch == '}')) {
                    s.pop();
                } else {
                    return false;
                }
            }
        }
        return s.isEmpty();
    }

    public static boolean duplicates(String str) {
        Stack<Character> s = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == ')') {
                int count = 0;
                while (s.peek() != '(') {
                    s.pop();
                    count++;
                }
                if (count < 1) {
                    return true;
                } else {
                    s.pop();
                }
            } else {
                s.push(ch);
            }
        }
        return false;

    }

    /**
     * * Histogram
     * 
     * @param arr
     */
    public static void histoGramArea(int arr[]) {
        int maxArea = 0;
        Stack<Integer> s = new Stack<>();
        int nrs[] = new int[arr.length];
        int nls[] = new int[arr.length];
        // Right smallest
        for (int i = arr.length - 1; i >= 0; i--) {
            while (!s.isEmpty() && arr[s.peek()] >= arr[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                nrs[i] = arr.length;
            } else {
                nrs[i] = s.peek();
            }
            s.push(i);
        }
        // Left smallest
        s = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            while (!s.isEmpty() && arr[s.peek()] >= arr[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                nls[i] = -1;
            } else {
                nls[i] = s.peek();
            }
            s.push(i);
        }

        // Find Rectangle area
        for (int i = 0; i < arr.length; i++) {
            int width = nrs[i] - nls[i] - 1;
            int area = arr[i] * width;
            maxArea = Math.max(maxArea, area);
        }

        System.out.println("Max area is :" + maxArea);
    }

    /**
     * * Infix Evaluation
     * 
     * @param str
     */
    public static void infixEvaluation(String str) {
        Stack<Integer> val = new Stack<>();
        Stack<Character> op = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int asscii = (int) ch;
            if (asscii >= 48 && asscii <= 57) {
                val.push(asscii - 48);
            } else if (op.isEmpty() || ch == '(') {
                op.push(ch);
            } else if (ch == ')') {
                while (op.peek() != '(') {
                    int val2 = val.pop();
                    int val1 = val.pop();
                    if (op.peek() == '+')
                        val.push(val1 + val2);
                    if (op.peek() == '-')
                        val.push(val1 - val2);
                    if (op.peek() == '/')
                        val.push(val1 / val2);
                    if (op.peek() == '*')
                        val.push(val1 * val2);
                    op.pop();
                }
                op.pop();
            } else {
                if (ch == '+' || ch == '-') {
                    if (op.peek() == '+' || op.peek() == '-') {
                        int val2 = val.pop();
                        int val1 = val.pop();
                        if (op.peek() == '+')
                            val.push(val1 + val2);
                        if (op.peek() == '-')
                            val.push(val1 - val2);
                        op.pop();
                    }
                    op.push(ch);
                } else {
                    if (op.peek() == '*' || op.peek() == '/') {
                        int val2 = val.pop();
                        int val1 = val.pop();
                        if (op.peek() == '/')
                            val.push(val1 / val2);
                        if (op.peek() == '*')
                            val.push(val1 * val2);
                        op.pop();
                    }
                    op.push(ch);
                }
            }
        }

        while (val.size() > 1) {
            int val2 = val.pop();
            int val1 = val.pop();
            if (op.peek() == '/')
                val.push(val1 / val2);
            if (op.peek() == '*')
                val.push(val1 * val2);
            if (op.peek() == '+')
                val.push(val1 + val2);
            if (op.peek() == '-')
                val.push(val1 - val2);
            op.pop();
        }

        System.out.println(val);
        System.out.println(op);

    }

    /**
     * * Post FIx Evaluation
     * 
     * @param str
     */
    public static void postfixEvaluation(String str) { // input ->> "953+4*6/-"
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int asscii = (int) ch;
            if (asscii >= 48 && asscii <= 57) {
                st.push(asscii - 48);
            } else {
                int val2 = st.pop();
                int val1 = st.pop();
                if (ch == '+')
                    st.push(val1 + val2);
                if (ch == '*')
                    st.push(val1 * val2);
                if (ch == '-')
                    st.push(val1 - val2);
                if (ch == '/')
                    st.push(val1 / val2);
            }
        }

        System.out.println(st);

    }

    /**
     * * Prefix Evaluation
     * 
     * @param str
     */

    public static void prefixEvaluation(String str) { // input ->> "-9/*+5346"
        Stack<Integer> st = new Stack<>();
        for (int i = str.length() - 1; i >= 0; i--) {
            char ch = str.charAt(i);
            int asscii = (int) ch;
            if (asscii >= 48 && asscii <= 57) {
                st.push(asscii - 48);
            } else {
                int val1 = st.pop();
                int val2 = st.pop();
                if (ch == '+')
                    st.push(val1 + val2);
                if (ch == '-')
                    st.push(val1 - val2);
                if (ch == '*')
                    st.push(val1 * val2);
                if (ch == '/')
                    st.push(val1 / val2);
            }
        }

        System.out.println(st);
    }

    /**
     * * prefixToPostfix Conversion
     * 
     * @param str
     */
    public static void prfixToPostfix(String str) {
        Stack<String> st = new Stack<>();
        for (int i = str.length() - 1; i >= 0; i--) {
            char ch = str.charAt(i);
            if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                String s1 = st.pop();
                String s2 = st.pop();
                String n = s1 + s2 + ch;
                st.push(n);
            } else {
                st.push("" + ch);
            }
        }
        System.out.println(st);
    }

    public static void postfixToPrefix(String str) {
        Stack<String> st = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                String s2 = st.pop();
                String s1 = st.pop();
                String n = ch + s1 + s2;
                st.push(n);
            } else {
                st.push("" + ch);
            }
        }
        System.out.println(st);
    }

    public static void postfixToInfix(String str) {
        Stack<String> st = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '+' || ch == '-' || ch == '/' || ch == '*') {
                String s2 = st.pop();
                String s1 = st.pop();
                st.push('(' + s1 + ch + s2 + ')');
            } else {
                st.push("" + ch);
            }
        }
        System.out.println(st);
    }

    public static void main(String[] args) {
        String str = "9-(5+3-2*3)";
        infixEvaluation(str);
    }
}
