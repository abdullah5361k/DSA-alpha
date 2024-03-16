package DSA.Trees;

public class DeleteLeaf {

    public static class Node {

        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }

    }

    public static Node delete(Node root, int x) {
        if (root == null)
            return root;

        root.left = delete(root.left, x);
        root.right = delete(root.right, x);

        if (root.data == x && root.left == null && root.right == null)
            return null;

        return root;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(7);
        root.right.left = new Node(6);

        delete(root, 5);

    }
}
