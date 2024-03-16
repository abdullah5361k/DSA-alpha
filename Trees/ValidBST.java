package DSA.Trees;

public class ValidBST {

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

    public static boolean isValid(Node root, Node max, Node min) {
        if (root == null)
            return true;

        if (min != null && root.data <= min.data)
            return false;

        else if (max != null && root.data >= max.data)
            return false;

        return isValid(root.left, root, min) && isValid(root.right, max, root);
    }

    public static void main(String[] args) {
        // int values[] = { 8, 9, 3, 1, 4, 2, 10, 7, 14 };
        int values[] = { 1, 1, 1 };
        Node root = null;

        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }

        System.out.println(isValid(root, null, null));

    }
}
