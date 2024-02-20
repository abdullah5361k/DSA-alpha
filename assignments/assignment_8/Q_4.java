package DSA.assignments.assignment_8;

public class Q_4 {

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

    public static void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void evenOddLL() {
        Node odd = new Node(1);
        Node o = odd;
        Node even = new Node(2);
        Node e = even;
        Node temp = head;
        while (temp != null) {
            if (temp.data % 2 == 0) {
                e.next = temp;
                e = e.next;
                temp = temp.next;
            } else {
                o.next = temp;
                o = o.next;
                temp = temp.next;
            }
        }
        o.next = null;
        head = even.next;
        e.next = odd.next;

    }

    public static void main(String[] args) {
        addLast(8);
        addLast(12);
        addLast(10);
        addLast(5);
        addLast(4);
        addLast(1);
        addLast(6);
        print();
        evenOddLL();
        print();
    }
}
