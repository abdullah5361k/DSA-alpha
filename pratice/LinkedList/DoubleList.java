package DSA.pratice.LinkedList;

public class DoubleList {

    public static class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public static void addFirst(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    public static void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail.next.prev = tail;
        tail = newNode;
    }

    public static void removeFirst() {
        if (head == null) {
            System.out.println("LL is empety");
            return;
        } else if (size == 1) {
            size--;
            head = tail = null;
            return;
        }
        size--;
        head = head.next;
        head.prev = null;

    }

    public static void removeLast() {
        if (head == null) {
            System.out.println("LL is empety");
            return;
        } else if (size == 1) {
            size--;
            head = tail = null;
            return;
        }
        size--;
        tail = tail.prev;
        tail.next = null;
    }

    public static void reverse() {
        Node pre = null;
        Node curr = head;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = pre;
            curr.prev = next;
            pre = curr;
            curr = next;
        }
        head = pre;
    }

    public static void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        addLast(1);
        addLast(2);
        addLast(3);
        print();
        reverse();
        print();
    }
}
