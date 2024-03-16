package DSA.Trees;

public class InvertTree {

    public static class Node {

        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }

    }

    public static Node invert(Node root) {
        if (root == null)
            return root;

        Node left = invert(root.left);
        Node right = invert(root.right);

        root.left = right;
        root.right = left;

        return root;

    }

    public static void preorder(Node root) {
        if (root == null)
            return;

        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(7);
        root.right.left = new Node(6);

        preorder(root);
        System.out.println();
        Node r = invert(root);
        preorder(r);

    }
}
