import java.util.*;

public class BT {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    static class BinaryTree {
        static int idx = -1;

        public static Node buildTree(int Node[]) {
            idx++;
            if (Node[idx] == -1) {
                return null;
            }
            Node newNode = new Node(Node[idx]);
            newNode.left = buildTree(Node);
            newNode.right = buildTree(Node);

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

        public static void inorder(Node root) {
            if (root == null) {
                return;
            }
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }

        public static void postorder(Node root) {
            if (root == null) {
                return;
            }
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data + " ");
        }

        public static void levelOrder(Node root) {
            if (root == null) {
                return;
            }
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);

            while (!q.isEmpty()) {
                Node currNode = q.remove();
                if (currNode == null) {
                    System.out.println();
                    if (q.isEmpty()) {
                        break;
                    } else {
                        q.add(null);
                    }
                } else {
                    System.out.print(currNode.data + " ");
                    if (currNode.left != null)
                        q.add(root.left);
                    if (currNode.right != null)
                        q.add(root.right);
                }
            }

        }

        public static int height(Node root) {
            if (root == null) {
                return 0;
            }

            int left = height(root.left);
            int right = height(root.right);

            return Math.max(left, right) + 1;

        }

        public static int countOfNodes(Node root) {
            if (root == null) {
                return 0;
            }

            int left = countOfNodes(root.left);
            int right = countOfNodes(root.right);

            return left + right + 1;
        }

        public static int sumOfNodes(Node root) {
            if (root == null) {
                return 0;
            }

            int left = sumOfNodes(root.left);
            int right = sumOfNodes(root.right);
            return left + right + root.data;
        }

    }

    public static class Info {
        int diam;
        int ht;

        public Info(int diam, int ht) {
            this.diam = diam;
            this.ht = ht;
        }

    }

    public static Info diam(Node root) {
        if (root == null) {
            return new Info(0, 0);
        }
        Info leftInfo = diam(root.left);
        Info rightInfo = diam(root.right);
        int diam = Math.max(Math.max(leftInfo.diam, rightInfo.diam), leftInfo.ht + rightInfo.ht + 1);
        int ht = Math.max(leftInfo.ht, rightInfo.ht) + 1;
        return new Info(diam, ht);
    }

    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        Node root = BinaryTree.buildTree(nodes);
        System.out.println(BinaryTree.sumOfNodes(root));
    }
}
