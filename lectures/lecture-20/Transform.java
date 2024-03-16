public class Transform {

    public static class Node {

        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    public static int transFormTree(Node root) {
        if (root == null)
            return 0;

        int left = transFormTree(root.left);
        int right = transFormTree(root.right);

        int data = root.data;
        root.data = left + right;
        return left + right + data;
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
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        transFormTree(root);
        preorder(root);
    }
}
