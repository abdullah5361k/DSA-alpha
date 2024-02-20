package DSA.assignments.assignment_8;

public class Q_1 {

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    /**
     * * Brute
     * 
     * @param head1
     * @param head2
     * @return
     */
    public static Node findIntersection(Node head1, Node head2) {
        while (head1 != null) {
            Node temp = head2;
            while (temp != null) {
                if (head1 == temp) {
                    return head1;
                }
                temp = temp.next;
            }
            head1 = head1.next;
        }
        return null;
    }

    /**
     * * Optimized
     * 
     * @param head1
     * @param head2
     * @return
     */

    public static Node pointOfIntersection(Node head1, Node head2) {
        Node d1 = head1;
        Node d2 = head2;
        while (d1 != d2) {
            d1 = d1 == null ? head2 : d1.next;
            d2 = d2 == null ? head1 : d2.next;
        }
        return d1;
    }

    public static void print(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node head1, head2;
        head1 = new Node(10);
        head2 = new Node(3);

        Node newNode = new Node(6);
        head2.next = newNode;
        newNode = new Node(9);
        head2.next.next = newNode;
        newNode = new Node(15);
        head1.next = newNode;
        head2.next.next.next = newNode;

        newNode = new Node(30);
        head1.next.next = newNode;
        head1.next.next.next = null;
        print(head1);
        print(head2);
        System.out.println(pointOfIntersection(head1, head2));
    }
}