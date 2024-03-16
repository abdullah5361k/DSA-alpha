package DSA.Trees;

import java.util.ArrayList;

public class MergeBSTs {

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

    public static Node makeBST(ArrayList<Integer> list, int si, int ei) {
        if (si > ei)
            return null;

        int mid = si + (ei - si) / 2;
        Node root = new Node(list.get(mid));
        root.left = makeBST(list, si, mid - 1);
        root.right = makeBST(list, mid + 1, ei);

        return root;
    }

    public static Node merge(Node root1, Node root2) {
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

        return makeBST(fnl, 0, fnl.size() - 1);

    }

    public static void preorder(Node root) {
        if (root == null)
            return;

        System.out.print(root.data + " ");
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

        Node root = merge(root1, root2);
        preorder(root);
    }
}
