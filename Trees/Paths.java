package DSA.Trees;

import java.util.ArrayList;

public class Paths {

    public static class Node {

        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    public static Node insert(Node root, int val) {
        if (root == null)
            return new Node(val);

        if (root.data > val) {
            root.left = insert(root.left, val);
        } else {
            root.right = insert(root.right, val);
        }

        return root;
    }

    public static void paths(Node root, ArrayList<Integer> list) {
        if (root == null)
            return;

        list.add(root.data);

        if (root.left == null && root.right == null)
            System.out.println(list);

        paths(root.left, list);
        paths(root.right, list);
        list.remove(list.size() - 1);
    }

    public static void main(String[] args) {
        int values[] = { 8, 5, 3, 1, 4, 6, 10, 11, 14 };
        Node root = null;

        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }

        paths(root, new ArrayList<>());

    }
}
