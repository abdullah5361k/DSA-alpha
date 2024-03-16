package DSA.Trees;

public class Height {

    public static class Node {

        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    public static int heightOfTree(Node root) {
        if (root == null)
            return 0;

        int left = heightOfTree(root.left);
        int right = heightOfTree(root.right);

        return Math.max(left, right) + 1;

    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);

        System.out.println(heightOfTree(root));

    }
}
