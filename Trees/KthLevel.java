package DSA.Trees;

import java.util.*;

public class KthLevel {

    public static class Node {

        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    public static void kthL(Node root, int k, int level) {
        if (root == null)
            return;

        if (level == k) {
            System.out.print(root.data + " ");
        }
        kthL(root.left, k, level + 1);
        kthL(root.right, k, level + 1);

    }

    public static void kWithLOT(Node root, int k) {
        Queue<Node> q = new LinkedList<>();
        Queue<Integer> pos = new LinkedList<>();

        q.add(root);
        pos.add(1);

        while (!q.isEmpty()) {
            Node curr = q.remove();
            int p = pos.remove();

            if (p == k) {
                System.out.print(curr.data + " ");
            }

            if (curr.left != null) {
                q.add(curr.left);
                pos.add(p + 1);
            }
            if (curr.right != null) {
                q.add(curr.right);
                pos.add(p + 1);
            }
        }

    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        kthL(root, 3, 1);
        System.out.println();
        kWithLOT(root, 3);

    }
}
