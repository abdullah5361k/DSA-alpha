package DSA.pratice.LinkedList;

import java.util.*;

public class LL {

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
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
        head = newNode;
    }

    public static void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public static void removeFirst() {
        if (head == null) {
            System.out.println("LL is emprty");
        } else if (size == 1) {
            head = tail = null;
            return;
        }
        head = head.next;
    }

    public static void removeLast() {
        if (head == null) {
            System.out.println("LL is emprty");
        } else if (size == 1) {
            head = tail = null;
            return;
        }
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
        tail = temp;
    }

    public static void printLL(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static Node getMid(Node head) {
        Node slow = head;
        Node fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static void zigZag() {
        Node mid = getMid(head);
        Node curr = mid.next;
        mid.next = null;
        Node prev = null;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node left = head;
        Node right = prev;
        while (left != null && right != null) {
            Node leftNext = left.next;
            Node rightNext = right.next;
            left.next = right;
            right.next = leftNext;
            left = leftNext;
            right = rightNext;
        }

    }

    public static Node findMid(Node head) {
        Node temp = head;
        Node slow = head;
        Node fast = head.next;
        while (fast.next != null && fast != null) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }

    public static Node sort(Node head1, Node head2) {
        Node mergedLL = new Node(-1);
        Node temp = mergedLL;

        while (head1 != null && head2 != null) {
            if (head1.data <= head2.data) {
                temp.next = head1;
                head1 = head1.next;
            } else {
                temp.next = head2;
                head2 = head2.next;
            }
            temp = temp.next;
        }

        while (head1 != null) {
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }

        while (head2 != null) {
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }

        return mergedLL.next;
    }

    public static Node mergeSort(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node mid = findMid(head);
        Node rightHead = mid.next;
        mid.next = null;
        Node left = mergeSort(head);
        Node right = mergeSort(rightHead);
        return sort(left, right);
    }

    public static Node reverse(Node head) {
        Node prev = null;
        Node curr = head;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public static void addOne() {
        Node temp = reverse(head);
        Stack<Integer> st = new Stack<>();
        int carry = 1;
        while (temp != null) {
            int sum = carry;
            sum = temp.data + sum;
            st.push(sum % 10);
            carry = sum / 10;
            temp = temp.next;
        }
        // Node dummy = new Node(-1);
        // Node d = dummy;
        // while (!st.isEmpty()) {
        // Node newNode = new Node(st.pop());
        // d.next = newNode;
        // d = d.next;
        // }
    }

    public static void reverseKNodes(Node head, int k) {
        Node newNode = new Node(-1);
        Node tt = newNode;
        Node temp = head;
        while (temp != null) {
            Node c = temp;
            Node m = c;
            for (int i = 1; i < k; i++) {
                if (temp == null) {
                    break;
                }
                m = m.next;
                temp = temp.next;
            }
            if (temp == null)
                break;
            temp = temp.next;

            m.next = null;
            Node prev = null;
            Node curr = c;
            Node next;
            while (curr != null) {
                next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }
            while (prev != null) {
                tt.next = prev;
                prev = prev.next;
                tt = tt.next;
            }
            tt.next = temp;
        }
        // tt.next = temp;
        printLL(newNode.next);

    }

    public static void main(String[] args) {
        addLast(1);
        addLast(2);
        addLast(3);
        addLast(4);
        addLast(5);
        reverseKNodes(head, 3);
    }
}
