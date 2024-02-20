package DSA.pratice.Stackk;

import java.util.*;

public class StackB {

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static class Stack {
        static Node head = null;

        public static boolean isEmpety() {
            return head == null;
        }

        public static void push(int data) {
            Node newNode = new Node(data);
            if (isEmpety()) {
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }

        public static int pop() {
            if (isEmpety()) {
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;
        }

        public static int peek() {
            return head.data;
        }

    }

    public static void main(String[] args) {
        Stack.push(1);
        Stack.push(2);
        Stack.push(3);
        while (!Stack.isEmpety()) {
            System.out.println(Stack.peek());
            Stack.pop();
        }
    }
}
