package DSA.pratice.Stackk;

import java.util.*;

public class StackB {

    public static void postFix(String str) {
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '+' || ch == '-' || ch == '/' || ch == '*') {
                int val2 = st.pop();
                int val1 = st.pop();
                if (ch == '+')
                    st.push(val1 + val2);
                if (ch == '-')
                    st.push(val1 - val2);
                if (ch == '*')
                    st.push(val1 * val2);
                if (ch == '/')
                    st.push(val1 / val2);
            } else {
                int asscii = (int) ch;
                st.push(asscii - 48);
            }
        }

        System.out.println(st);

    }

    public static void main(String[] args) {
        String str = "953+4*6/-";
        postFix(str);

    }
}
