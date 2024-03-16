package DSA.Trees;

public class PreorderB {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    public static int idx = -1;

    public static Node preorderBuild(int node[]) {
        idx++;

        if (node[idx] == -1)
            return null;

        Node newNode = new Node(node[idx]);
        newNode.left = preorderBuild(node);
        newNode.right = preorderBuild(node);

        return newNode;
    }

    public static void preorder(Node root) {
        if (root == null) {
            System.out.print(-1 + " ");
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        // System.out.println(preorderBuild(nodes).data);
        Node root = preorderBuild(nodes);
        preorder(root);
    }
}
