public class KthAncestor {

    public static class Node {

        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    public static int kAncestor(Node root, int node, int k) {
        if (root == null)
            return -1;
        if (root.data == node)
            return 1;

        int left = kAncestor(root.left, node, k);
        int right = kAncestor(root.right, node, k);

        if (left == -1 && right == -1)
            return -1;

        if (left == k || right == k) {
            System.out.println(root.data);
        }

        int max = Math.max(left, right);
        return max + 1;

    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        kAncestor(root, 4, 2);
    }
}
