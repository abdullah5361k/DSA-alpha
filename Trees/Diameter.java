package DSA.Trees;

public class Diameter {

    public static class Node {

        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    public static class Info {

        int diam;
        int ht;

        Info(int diam, int ht) {
            this.diam = diam;
            this.ht = ht;
        }

    }

    public static Info diameter(Node root) {
        if (root == null)
            return new Info(0, 0);

        Info leftD = diameter(root.left);
        Info rightD = diameter(root.right);

        int diam = Math.max(Math.max(leftD.diam, rightD.diam), leftD.ht + rightD.ht + 1);
        int h = Math.max(leftD.ht, rightD.ht) + 1;

        return new Info(diam, h);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);

        System.out.println(diameter(root).diam);

    }
}
