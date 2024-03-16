public class Univalued {

    public static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }

    }

    public static boolean isUni(Node root) {
        if (root == null)
            return true;

        if (root.left != null && root.data != root.left.data)
            return false;

        if (root.right != null && root.data != root.right.data)
            return false;
        return isUni(root.left) && isUni(root.right);
    }

    public static void main(String[] args) {
        Node root = new Node(6);
        root.left = new Node(5);
        root.right = new Node(4);
        root.left.left = new Node(1);
        root.left.right = new Node(2);
        root.right.right = new Node(5);

        System.out.println(isUni(root));

    }
}
