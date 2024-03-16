package DSA.Trees;

public class SubtreeIdent {

    public static class Node {

        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }

    }

    public static boolean isIdentical(Node root1, Node root2) {
        if (root1 == null && root2 == null)
            return true;

        if (root1 == null || root2 == null || root1.data != root2.data)
            return false;

        if (!isIdentical(root1.left, root2.left))
            return false;
        if (!isIdentical(root1.right, root2.right))
            return false;

        return true;
    }

    public static boolean subtrees(Node root1, Node root2) {
        if (root1 == null)
            return false;

        if (root1.data == root2.data) {
            if (isIdentical(root1, root2)) {
                return true;
            } else {
                return false;
            }
        }

        boolean s = subtrees(root1.left, root2);
        boolean y = subtrees(root1.right, root2);

        return s || y;

    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        /**
         * * Sub root
         */

        Node subRoot = new Node(2);
        subRoot.left = new Node(4);
        subRoot.right = new Node(4);

        System.out.println(subtrees(root, subRoot));

    }
}
