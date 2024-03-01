import java.util.*;

public class StackQue {

    static class Stack {
        Queue<Integer> q = new LinkedList<>();

        public boolean isEmpty() {
            return q.size() == 0;
        }

        public void push(int x) {
            if (q.size() == 0) {
                q.add(x);
            } else {
                q.add(x);
                for (int i = 0; i < q.size() - 1; i++) {
                    q.add(q.remove());
                }
            }
        }

        public int pop() {
            if (isEmpty()) {
                return -1;
            }
            return q.remove();
        }

        public int peek() {
            if (isEmpty()) {
                return -1;
            }
            return q.peek();
        }

    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        System.out.println(s.peek());
        System.out.println(s.pop());
        System.out.println(s.peek());
        // while (!s.isEmpty()) {
        // System.out.print(s.peek() + " ");
        // s.pop();
        // }
    }
}
