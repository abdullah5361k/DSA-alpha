package DSA.Trees;

public class InorderTrav {

    public static class Node {

        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    public static void inorder(Node root) {
        if (root == null)
            return;

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);
        inorder(root);
    }
}
