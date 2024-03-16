import java.util.ArrayList;

public class ConvertBstToBT {

    public static class Node {

        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    public static void inorder(Node root, ArrayList<Integer> list) {
        if (root == null)
            return;

        inorder(root.left, list);
        list.add(root.data);
        inorder(root.right, list);

    }

    public static Node balance(ArrayList<Integer> arr, int si, int ei) {
        if (si > ei)
            return null;

        int mid = si + (ei - si) / 2;
        Node root = new Node(arr.get(mid));
        root.left = balance(arr, si, mid - 1);
        root.right = balance(arr, mid + 1, ei);

        return root;
    }

    public static Node balancedBST(Node root) {
        ArrayList<Integer> list = new ArrayList<>();
        inorder(root, list);
        root = balance(list, 0, list.size() - 1);
        return root;
    }

    public static void preorder(Node root) {
        if (root == null)
            return;
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void main(String[] args) {
        Node root = new Node(8);
        root.left = new Node(6);
        root.left.left = new Node(5);
        root.left.left.left = new Node(3);
        root.right = new Node(10);
        root.right.right = new Node(11);
        root.right.right.right = new Node(12);

        root = balancedBST(root);

        preorder(root);

    }
}
