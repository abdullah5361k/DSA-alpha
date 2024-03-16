public class MiniDistance {

    public static class Node {

        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    public static Node lca(Node root, int n1, int n2) {
        if (root == null)
            return root;

        if (root.data == n1 || root.data == n2)
            return root;

        Node left = lca(root.left, n1, n2);
        Node right = lca(root.right, n1, n2);

        if (left == null && right == null)
            return null;

        if (left != null && right != null)
            return root;

        if (right != null)
            return right;
        return left;
    }

    public static int distance(Node root, int n) {
        if (root == null)
            return -1;

        if (root.data == n)
            return 0;

        int left = distance(root.left, n);
        int right = distance(root.right, n);

        if (left == -1 && right == -1)
            return -1;

        if (left >= 0)
            return left + 1;

        return right + 1;

    }

    public static void miniDistance(Node root, int n1, int n2) {
        Node anc = lca(root, n1, n2);
        int d1 = distance(anc, n1);
        int d2 = distance(anc, n2);
        System.out.println(d1 + d2);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        miniDistance(root, 2, 3);
    }
}
