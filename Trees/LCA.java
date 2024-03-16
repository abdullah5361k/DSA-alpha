package DSA.Trees;

import java.util.ArrayList;

public class LCA {

    public static class Node {

        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    public static boolean getPath(Node root, int n, ArrayList<Integer> list) {
        if (root == null)
            return false;

        list.add(root.data);

        if (root.data == n)
            return true;

        boolean left = getPath(root.left, n, list);
        boolean right = getPath(root.right, n, list);

        if (!left && !right)
            list.remove(list.size() - 1);

        if (left || right)
            return true;

        return false;

    }

    public static void lowestCommonA1(Node root, int n1, int n2) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        getPath(root, n1, list1);
        getPath(root, n2, list2);

        int i = 0;
        for (; i < list1.size(); i++) {
            if (list1.get(i) != list2.get(i))
                break;
        }

        System.out.println(list1.get(i - 1));

    }

    public static Node lowestCommonA2(Node root, int n1, int n2) {
        if (root == null)
            return root;

        if (root.data == n1 || root.data == n2)
            return root;

        Node left = lowestCommonA2(root.left, n1, n2);
        Node right = lowestCommonA2(root.right, n1, n2);

        if (left != null && right != null)
            return root;

        if (left != null)
            return left;
        if (right != null)
            return right;

        return null;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);

        System.out.println(lowestCommonA2(root, 4, 6).data);

    }
}
