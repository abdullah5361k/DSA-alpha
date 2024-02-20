import java.util.*;

public class StackA {

    public static class Stack {
        static ArrayList<Integer> list = new ArrayList<>();

        public boolean isEmpety() {
            return list.size() == 0;
        }

        public void push(int data) {
            list.add(data);
        }

        public int pop() {
            if (isEmpety()) {
                return -1;
            }
            int top = list.get(list.size() - 1);
            list.remove(list.size() - 1);
            return top;
        }

        public int peek() {
            if (isEmpety()) {
                return -1;
            }
            return list.get(list.size() - 1);
        }

    }

    public static void main(String[] args) {
        Stack s1 = new Stack();
        s1.push(0);
        s1.push(1);
        s1.push(2);

        while (!s1.isEmpety()) {
            System.out.println(s1.peek());
            s1.pop();
        }
    }
}
