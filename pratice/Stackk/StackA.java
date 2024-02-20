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
            while (!s.isEmpty() && currStock > stock[s.peek()]) {
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

    public static void main(String[] args) {
        int arr[] = { 6, 8, 0, 1, 3 };
        nextGreaterElement(arr);
    }
}
