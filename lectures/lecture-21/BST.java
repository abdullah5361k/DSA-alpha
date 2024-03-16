import java.util.ArrayList;

public class BST {

    public static class Node {

        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    public static Node insert(Node root, int val) {
        if (root == null) {
            root = new Node(val);
            return root;
        }

        if (root.data > val) {
            root.left = insert(root.left, val);
        } else {
            root.right = insert(root.right, val);
        }

        return root;
    }

    public static void inorder(Node root) {
        if (root == null)
            return;

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static boolean search(Node root, int key) {
        if (root == null)
            return false;

        if (root.data == key)
            return true;

        if (root.data > key)
            return search(root.left, key);
        else
            return search(root.right, key);

    }

    public static Node delete(Node root, int val) {
        if (root.data < val) {
            root.right = delete(root.right, val);
        } else if (root.data > val) {
            root.left = delete(root.left, val);
        } else {
            // Case 1 leaf node
            if (root.left == null && root.right == null) {
                return null;
            }

            // Case 2 single child
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            // Case 3 both children

            Node IS = findInorderSuccessor(root.right);
            root.data = IS.data;
            root.right = delete(root.right, IS.data);
        }

        return root;

    }

    public static Node findInorderSuccessor(Node root) {
        while (root.left != null) {
            root = root.left;
        }

        return root;

    }

    public static void printinRange(Node root, int k1, int k2) {

        if (root == null)
            return;

        if (root.data >= k1 && root.data <= k2) {
            printinRange(root.left, k1, k2);
            System.out.print(root.data + " ");
            printinRange(root.right, k1, k2);
        }

        else if (root.data < k1) {
            printinRange(root.left, k1, k2);
        } else {
            printinRange(root.right, k1, k2);
        }

    }

    public static void printPaths(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }

    public static void printRootToLeaf(Node root, ArrayList<Integer> list) {

        if(root == null) {
            return;
        }

        if(root.left == null && root.right == null) {
            printPaths(list);
        }

        list.add(root.data);
        printRootToLeaf(root.left, list);
        printRootToLeaf(root.right, list);
        list.remove(list.size()-1)
    }

    public static void main(String[] args) {
        // int values[] = { 5, 1, 3, 4, 2, 7 };
        int values[] = { 8, 5, 3, 1, 4, 6, 10, 11, 14 };
        Node root = null;

        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }

        inorder(root);

    }
}
