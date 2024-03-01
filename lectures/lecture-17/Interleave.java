import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Interleave {

    public static void interLTwoHalves(Queue<Integer> q) {
        Queue<Integer> q2 = new LinkedList<>();
        int half = q.size() / 2;
        while (q.size() > half) {
            q2.add(q.remove());
        }

        while (!q2.isEmpty()) {
            q.add(q2.remove());
            q.add(q.remove());
        }

    }

    public static void reversal(Queue<Integer> q) {
        Stack<Integer> st = new Stack<>();
        while (!q.isEmpty()) {
            st.push(q.remove());
        }
        while (!st.isEmpty()) {
            q.add(st.pop());
        }
        while (!q.isEmpty()) {
            System.out.print(q.peek());
            q.remove();
        }
    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        // q.add(6);
        // q.add(7);
        // q.add(8);
        // q.add(9);
        // q.add(10);
        reversal(q);
    }
}
