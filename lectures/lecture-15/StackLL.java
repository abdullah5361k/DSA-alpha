public class StackLL {

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }

    }

    public static class Stack {
        static Node head = null;

        public boolean isEmpety() {
            return head == null;
        }

        public void push(int data) {
            Node newNode = new Node(data);
            if (isEmpety()) {
                head = newNode;
                return;
            }

            newNode.next = head;
            head = newNode;
        }

        public int pop() {
            if (isEmpety()) {
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;
        }

        public int peek() {
            if (isEmpety()) {
                return -1;
            }

            return head.data;
        }

    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        while (!s.isEmpety()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}
