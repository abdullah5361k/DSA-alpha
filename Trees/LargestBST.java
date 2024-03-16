package DSA.Trees;

public class LargestBST {

    public static class Node {

        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    public static class Info {

        boolean isBST;
        int size;
        int max;
        int min;

        Info(boolean isBST, int size, int max, int min) {
            this.isBST = isBST;
            this.size = size;
            this.max = max;
            this.min = min;
        }
    }

    public static int BST;

    public static Info largestBST(Node root) {
        if (root == null) {
            return new Info(true, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        }

        Info leftInfo = largestBST(root.left);
        Info rightInfo = largestBST(root.right);

        int size = leftInfo.size + rightInfo.size + 1;
        int max = Math.max(root.data, Math.max(leftInfo.max, rightInfo.max));
        int min = Math.min(root.data, Math.min(leftInfo.min, rightInfo.min));

        if (root.data <= leftInfo.max || root.data >= rightInfo.min) {
            return new Info(false, size, max, min);
        }

        if (leftInfo.isBST && rightInfo.isBST) {
            BST = Math.max(BST, size);
            return new Info(true, size, max, min);
        }

        return new Info(false, size, max, min);
    }

    public static void main(String[] args) {
        Node root = new Node(50);
        root.left = new Node(30);
        root.left.left = new Node(5);
        root.left.right = new Node(20);

        root.right = new Node(60);
        root.right.right = new Node(70);
        root.right.right.right = new Node(80);
        root.right.left = new Node(45);
        root.right.right.left = new Node(65);

        Info i = largestBST(root);

        System.out.println(BST);

    }
}
