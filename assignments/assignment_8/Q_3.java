package DSA.assignments.assignment_8;

public class Q_3 {

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

    public static void swapNodes(int x, int y) {

        if (x == y) {
            return;
        }

        Node temp1 = head;
        Node currX = head;
        Node prevX = null;
        while (temp1 != null && temp1.data != x) {
            prevX = currX;
            temp1 = temp1.next;
            currX = temp1;
        }
        Node temp2 = head;
        Node currY = head;
        Node prevY = null;
        while (temp2 != null && temp2.data != y) {
            prevY = currY;
            temp2 = temp2.next;
            currY = temp2;
        }
        if (currX == null || currY == null) {
            return;
        }
        if (prevX != null) {
            prevX.next = currY;
        } else {
            head = currY;
        }
        if (prevY != null) {
            prevY.next = currX;
        } else {
            head = currX;
        }
        // System.out.println(currX.data);
        // System.out.println(currY.data);
        Node temp = currX.next;
        currX.next = currY.next;
        currY.next = temp;
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
        print(head);
        swapNodes(1, 8);
        print(head);
    }
}
