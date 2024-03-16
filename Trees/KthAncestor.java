package DSA.Trees;

public class KthAncestor {

    public static class Node {

        int data;
        Node right;
        Node left;

        Node(int data) {
            this.data = data;
        }

    }

    public static int kth(Node root, int node, int k) {
        if (root == null)
            return -1;

        if (root.data == node)
            return 1;

        int left = kth(root.left, node, k);
        int right = kth(root.right, node, k);

        if (k == right || k == left)
            System.out.println(root.data);

        if (left == -1 && right == -1)
            return -1;

        int max = Math.max(left, right);

        return max + 1;

    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);

        System.out.println(kth(root, 4, 2));

    }
}
