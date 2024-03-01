import java.util.*;

public class SubTree {

    public static class Node {

        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static boolean isIdentical(Node node, Node subRoot) {
        if (node == null && subRoot == null) {
            return true;
        }

        if (node == null || subRoot == null || node.data != subRoot.data) {
            return false;
        }

        if (!isIdentical(node.left, subRoot.left)) {
            return false;
        }
        ;
        if (!isIdentical(node.right, subRoot.right)) {
            return false;
        }
        ;

        return true;

    }

    public static boolean isSubtree(Node root, Node subRoot) {
        if (root == null) {
            return false;
        }
        if (root.data == subRoot.data) {
            if (isIdentical(root, subRoot)) {
                return true;
            }
        }
        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }

    public static boolean isSub(Node node, Node subRoot) {
        if (node == null && subRoot == null) {
            return true;
        }

        if (node == null || subRoot == null || node.data != subRoot.data) {
            return false;
        }

        if (!isSub(node.left, subRoot.left)) {
            return false;
        }
        ;
        if (!isSub(node.right, subRoot.right)) {
            return false;
        }
        ;

        return true;

    }

    public static boolean sub(Node root, Node subRoot) {
        Stack<Node> st = new Stack<>();
        Node temp = root;
        st.push(root);
        while (!st.isEmpty()) {
            Node curr = st.peek();
            if (curr.data == subRoot.data) {
                temp = curr;
                break;
            }
            st.pop();
            if (curr.right != null)
                st.push(curr.right);
            if (curr.left != null)
                st.push(curr.left);
        }

        return isSub(temp, subRoot);
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
        subRoot.right = new Node(5);

        System.out.println(sub(root, subRoot));
    }
}
