package DSA.pratice.Trees;

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

    static int idx = -1;

    public static Node preorder(int nd[]) {
        idx++;
        if (nd[idx] == -1) {
            return null;
        }
        Node newNode = new Node(nd[idx]);
        newNode.left = preorder(nd);
        newNode.right = preorder(nd);
        return newNode;
    }

    public static void preorderTraversal(Node root) {
        if (root == null) {
            System.out.print(-1 + " ");
            return;
        }
        System.out.print(root.data + " ");
        preorderTraversal(root.left);
        preorderTraversal(root.right);
    }

    public static void inorderTraversal(Node root) {
        if (root == null) {
            return;
        }
        inorderTraversal(root.left);
        System.out.print(root.data + " ");
        inorderTraversal(root.right);
    }

    public static void postOrderTraversal(Node root) {
        if (root == null) {
            return;
        }
        postOrderTraversal(root.left);
        postOrderTraversal(root.right);
        System.out.print(root.data + " ");
    }

    public static void levelOrder(Node root) {
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while (!q.isEmpty()) {
            Node curr = q.remove();
            if (curr == null) {
                System.out.println();
                if (q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }
            } else {
                System.out.print(curr.data + " ");
                if (curr.left != null)
                    q.add(curr.left);
                if (curr.right != null)
                    q.add(curr.right);
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

    public static int countNodes(Node root) {
        if (root == null) {
            return 0;
        }

        int left = countNodes(root.left);
        int right = countNodes(root.right);

        return left + right + 1;

    }

    public static int sumOfBT(Node root) {
        if (root == null) {
            return 0;
        }

        int left = sumOfBT(root.left);
        int right = sumOfBT(root.right);

        return left + right + root.data;

    }

    public static void preorderLinear(Node root) {
        Stack<Node> st = new Stack<>();
        st.push(root);

        while (!st.isEmpty()) {
            Node top = st.peek();
            System.err.print(top.data + " ");
            st.pop();
            if (top.right != null)
                st.push(top.right);
            if (top.left != null)
                st.push(top.left);
        }

    }

    public static void postOrderLin(Node curr) {
        Stack<Node> st = new Stack<>();
        while (true) {
            if (curr != null) {
                st.push(curr);
                curr = curr.left;
            } else {
                if (st.isEmpty())
                    break;
                curr = st.peek();
                curr = curr.right;
            }
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
        if (root == null) {
            return new Info(0, 0);
        }

        Info leftD = diameter(root.left);
        Info rightD = diameter(root.right);
        int slefD = Math.max(Math.max(leftD.diam, rightD.diam), (leftD.ht + rightD.ht + 1));
        int height = Math.max(leftD.ht, rightD.ht) + 1;
        return new Info(slefD, height);
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

        if (!isIdentical(node.right, subRoot.right)) {
            return false;
        }

        return true;

    }

    public static boolean subtres(Node root, Node subRoot) {
        if (root == null) {
            return false;
        }

        if (root.data == subRoot.data) {
            if (isIdentical(root, subRoot)) {
                return true;
            }
        }
        return subtres(root.left, subRoot) || subtres(root.right, subRoot);

    }

    public static int isBalanced(Node root) {
        if (root == null) {
            return 0;
        }

        int leftH = isBalanced(root.left);
        int rightH = isBalanced(root.right);
        int max = Math.max(leftH, rightH);
        int min = Math.min(leftH, rightH);
        if (max - min > 1) {
            return 0;
        }
        return Math.max(leftH, rightH) + 1;

    }

    public static int maxSum(Node root) {
        if (root == null) {
            return 0;
        }
        int left = maxSum(root.left);
        int right = maxSum(root.right);
        int sum = Math.max(Math.max(left, right), left + right + root.data);
        return sum;
    }

    public static void zigZag(Node root) {
        ArrayList<ArrayList<Integer>> wrapList = new ArrayList<>();
        Queue<Node> q = new LinkedList<>();

        q.add(root);
        boolean flag = true;

        while (!q.isEmpty()) {
            int levelOrder = q.size();
            ArrayList<Integer> list = new ArrayList<>(levelOrder);
            for (int i = 0; i < levelOrder; i++) {
                if (q.peek().left != null)
                    q.add(q.peek().left);
                if (q.peek().right != null)
                    q.add(q.peek().right);
                if (flag)
                    list.add(q.poll().data);
                else
                    list.add(0, q.poll().data);
            }
            flag = !flag;
            wrapList.add(list);
        }

        System.out.println(wrapList);

    }

    public static void leftBoundary(Node root, ArrayList<Integer> list) {
        if (root == null) {
            return;
        }
        // Leaf nodes except case
        if (root.right == null && root.left == null) {
            return;
        }

        list.add(root.data);

        // Prefrence left nodes over right one
        if (root.left == null) {
            leftBoundary(root.right, list);
        } else {
            leftBoundary(root.left, list);
        }

    }

    public static void leafNodes(Node root, ArrayList<Integer> list) {
        if (root == null) {
            return;
        }

        if (root.left == null && root.right == null) {
            list.add(root.data);
            return;
        }

        leafNodes(root.left, list);
        leafNodes(root.right, list);
    }

    public static void rightBoundary(Node root, ArrayList<Integer> list) {
        if (root == null)
            return;

        if (root.left == null && root.right == null)
            return;

        if (root.right == null)
            rightBoundary(root.left, list);
        else
            rightBoundary(root.right, list);

        list.add(root.data);
    }

    public static void boundaryTree(Node root) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(root.data);
        leftBoundary(root.left, list);
        leafNodes(root, list);
        rightBoundary(root.right, list);
        System.out.println(list);
    }

    public static void topView(Node root) {
        HashMap<Integer, Integer> map = new HashMap<>();
        Queue<Node> q = new LinkedList<>();
        Queue<Integer> q1 = new LinkedList<>();
        q.add(root);
        q1.add(0);
        int min = 0, max = 0;
        while (!q.isEmpty()) {
            Node curr = q.remove();
            int pos = q1.remove();
            map.put(pos, curr.data);
            if (curr.left != null) {
                q.add(curr.left);
                q1.add(pos - 1);
                min = Math.min(min, pos - 1);
            }
            if (curr.right != null) {
                q.add(curr.right);
                q1.add(pos + 1);
                max = Math.max(max, pos + 1);
            }
        }

        System.out.println(min);
        System.out.println(max);
        for (int i = min; i <= max; i++) {
            System.out.print(map.get(i) + "   ");
        }

    }

    public static void leftView(Node root, ArrayList<Integer> left) {
        if (root == null)
            return;

        left.add(root.data);
        if (root.left != null)
            leftView(root.left, left);
        else
            leftView(root.right, left);
    }

    public static void rightView(Node root, ArrayList<Integer> right) {
        if (root == null)
            return;

        right.add(root.data);

        if (root.right != null)
            rightView(root.right, right);
        else
            rightView(root.left, right);

    }

    public static void views(Node root) {
        ArrayList<Integer> left = new ArrayList<>();
        ArrayList<Integer> right = new ArrayList<>();
        Queue<Node> q = new LinkedList<>();

        q.add(root);
        q.add(null);
        while (!q.isEmpty()) {
            Node curr = q.remove();
            // if (q.peek() == null)
            // right.add(curr.data);
            if (curr == null) {
                if (q.isEmpty())
                    break;
                else
                    q.add(null);
            } else {
                if (q.peek() == null)
                    right.add(curr.data);
                if (curr.left != null)
                    q.add(curr.left);
                if (curr.right != null)
                    q.add(curr.right);
            }
        }

        System.out.println(right);

    }

    public static void main(String[] args) {
        // int node[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        int node[] = { 1, 2, 3, 4, -1, -1, 5, -1, -1, -1, -1 };
        Node root = new Node(10);
        root.left = new Node(20);
        root.left.left = new Node(40);
        root.left.right = new Node(60);
        root.right = new Node(30);
        views(root);
    }

}
