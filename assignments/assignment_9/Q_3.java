package DSA.assignments.assignment_9;

import java.util.*;

/**
 * Q_3
 */
public class Q_3 {

    public static void reverseK(Queue<Integer> q1, int k) {
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < k; i++) {
            st.push(q1.remove());
        }

        while (!st.isEmpty()) {
            q1.add(st.pop());
        }

        for (int i = 0; i < k; i++) {
            q1.add(q1.remove());
        }

    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        for (int i = 10; i <= 100; i += 10) {
            q.add(i);
        }
        reverseK(q, 5);
        while (!q.isEmpty()) {
            System.out.print(q.peek() + "  ");
            q.remove();
        }

    }
}