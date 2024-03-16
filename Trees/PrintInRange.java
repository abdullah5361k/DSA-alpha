package DSA.Trees;

public class PrintInRange {

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

    public static void inRange(Node root, int k1, int k2) {
        if (root == null)
            return;

        if (root.data >= k1 && root.data <= k2) {
            inRange(root.left, k1, k2);
            System.out.print(root.data + " ");
            inRange(root.right, k1, k2);
        } else if (root.data > k2) {
            inRange(root.left, k1, k2);
        } else {
            inRange(root.right, k1, k2);
        }

    }

    public static void main(String[] args) {
        int values[] = { 8, 5, 3, 1, 4, 6, 10, 11, 14 };
        Node root = null;

        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }

        inRange(root, 1, 5);

    }
}
