package DSA.assignments.assignment_8;

public class Q_2 {

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static Node head;
    public static Node tail;

    public static void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public static void print(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void removeNodes(int n, int m) {
        Node temp = head;
        while (temp != null) {
            Node curr = temp;
            for (int i = 1; i < m; i++) {
                if (temp == null) {
                    return;
                }
                curr = curr.next;
                temp = temp.next;
            }
            Node nxt = temp;
            for (int i = 0; i < n; i++) {
                if (temp == null) {
                    return;
                }
                nxt = nxt.next;
                temp = temp.next;
            }
            curr.next = nxt.next;
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        addLast(1);
        addLast(2);
        addLast(3);
        addLast(4);
        addLast(5);
        addLast(6);
        addLast(7);
        addLast(8);
        addLast(9);
        addLast(10);
        print(head);
        removeNodes(2, 3);
        print(head);
    }
}
