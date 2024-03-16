import java.util.ArrayList;

public class MergeBST {

    public static class Node {

        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    public static void inorder(Node root, ArrayList<Integer> lsit) {
        if (root == null)
            return;

        inorder(root.left, lsit);
        lsit.add(root.data);
        inorder(root.right, lsit);

    }

    public static Node balanceBST(ArrayList<Integer> list, int si, int ei) {
        if (si > ei)
            return null;

        int mid = si + (ei - si) / 2;
        Node root = new Node(list.get(mid));
        root.left = balanceBST(list, si, mid - 1);
        root.right = balanceBST(list, mid + 1, ei);

        return root;
    }

    public static Node merge2BST(Node root1, Node root2) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        inorder(root1, list1);
        inorder(root2, list2);

        ArrayList<Integer> fnl = new ArrayList<>();
        int i = 0, j = 0;
        while (i < list1.size() && j < list2.size()) {
            if (list1.get(i) < list2.get(j)) {
                fnl.add(list1.get(i));
                i++;
            } else {
                fnl.add(list2.get(j));
                j++;
            }
        }

        while (i < list1.size()) {
            fnl.add(list1.get(i));
            i++;
        }

        while (j < list2.size()) {
            fnl.add(list2.get(j));
            j++;
        }

        System.out.println(fnl);

        Node root = balanceBST(fnl, 0, fnl.size() - 1);
        return root;
    }

    public static void preorder(Node root) {
        if (root == null)
            return;

        System.out.print(root.data + "  ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void main(String[] args) {
        Node root1 = new Node(2);
        root1.left = new Node(1);
        root1.right = new Node(4);

        Node root2 = new Node(9);
        root2.left = new Node(3);
        root2.right = new Node(12);

        Node r = merge2BST(root1, root2);
        preorder(r);

    }
}
