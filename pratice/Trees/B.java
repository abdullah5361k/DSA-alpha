package DSA.pratice.Trees;

import java.util.*;

public class B {

    public static class Node {

        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
        }
    }

    static int idx = -1;

    public static Node preorder(int arr[]) {
        idx++;
        if (arr[idx] == -1)
            return null;
        Node root = new Node(arr[idx]);
        root.left = preorder(arr);
        root.right = preorder(arr);
        return root;
    }

    public static void preorder(Node root) {
        if (root == null)
            return;
        System.out.print(root.data + "  ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void preS(Node root) {
        Stack<Node> st = new Stack<>();
        st.push(root);

        while (!st.isEmpty()) {
            Node temp = st.pop();
            System.out.print(temp.data + "  ");
            if (temp.right != null)
                st.push(temp.right);
            if (temp.left != null)
                st.push(temp.left);
        }

    }

    public static void inorder(Node root) {
        if (root == null)
            return;
        inorder(root.left);
        System.out.print(root.data + "  ");
        inorder(root.right);
    }

    public static void inordS(Node root) {
        Stack<Node> st = new Stack<>();
        Node curr = root;
        while (true) {
            if (curr != null) {
                st.push(curr);
                curr = curr.left;
            } else {
                Node temp = st.pop();
                System.out.print(temp.data + "  ");
                if (temp.right == null && st.isEmpty())
                    break;
                curr = temp.right;
            }
        }

    }

    public static void postorder(Node root) {
        if (root == null)
            return;

        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + "   ");
    }

    public static void postS(Node root) {
        Stack<Node> st = new Stack<>();
        st.push(root);
        Node curr = root.left;

        while (!st.isEmpty()) {
            if (curr != null) {
                st.push(curr);
                curr = curr.left;
            } else {
                Node temp = st.peek();
                if (temp.right == null) {
                    Node c = st.pop();
                    System.out.print(c.data + " ");
                    while (!st.isEmpty() && st.peek().right == c) {
                        System.out.print(st.peek().data + " ");
                        c = st.pop();
                    }
                } else {
                    curr = temp.right;
                }
            }
        }

    }

    public static int height(Node root) {
        if (root == null)
            return 0;

        int left = height(root.left);
        int right = height(root.right);

        return Math.max(left, right) + 1;
    }

    public static int count(Node root) {
        if (root == null)
            return 0;

        int left = count(root.left);
        int right = count(root.right);

        return left + right + 1;

    }

    public static int sum(Node root) {
        if (root == null)
            return 0;

        int left = sum(root.left);
        int right = sum(root.right);

        return left + right + root.data;
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

        Info left = diameter(root.left);
        Info right = diameter(root.right);
        int diam = Math.max(left.diam, Math.max(right.diam, left.ht + right.ht + 1));
        int ht = Math.max(left.ht, right.ht) + 1;

        return new Info(diam, ht);
    }

    public static boolean isIdentical(Node root1, Node root2) {
        if (root1 == null && root2 == null)
            return true;

        if (root1 == null || root2 == null || root1.data != root2.data)
            return false;

        if (!isIdentical(root1.left, root2.left)) {
            return false;
        }

        if (!isIdentical(root1.right, root2.right)) {
            return false;
        }

        return true;
    }

    public static boolean sub(Node root1, Node root2) {
        if (root1 == null)
            return false;

        if (root1.data == root2.data) {
            if (isIdentical(root1, root2)) {
                return true;
            }
        }

        return sub(root1.left, root2) || sub(root1.right, root2);
    }

    public static class View {

        int hz;
        Node node;

        View(int hz, Node node) {
            this.hz = hz;
            this.node = node;
        }
    }

    public static void topView(Node root) {
        Queue<View> q = new LinkedList<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        q.add(new View(0, root));
        int min = 0;
        int max = 0;

        while (!q.isEmpty()) {
            View temp = q.remove();
            if (!map.containsKey(temp.hz)) {
                map.put(temp.hz, temp.node.data);
            }

            if (temp.node.left != null) {
                q.add(new View(temp.hz - 1, temp.node.left));
                min = Math.min(min, temp.hz - 1);
            }

            if (temp.node.right != null) {
                q.add(new View(temp.hz + 1, temp.node.right));
                max = Math.max(max, temp.hz + 1);
            }
        }

        for (int i = min; i <= max; i++) {
            System.out.println(map.get(i));
        }
    }

    public static class Level {

        Node node;
        int lvl;

        Level(Node node, int lvl) {
            this.node = node;
            this.lvl = lvl;
        }
    }

    public static void levelOrder(Node root, int k) {
        Queue<Level> q = new LinkedList<>();

        q.add(new Level(root, 1));

        while (!q.isEmpty()) {
            Level temp = q.remove();
            if (temp.lvl == k) {
                System.out.print(temp.node.data + "  ");
            }

            if (temp.node.left != null) {
                q.add(new Level(temp.node.left, temp.lvl + 1));
            }

            if (temp.node.right != null) {
                q.add(new Level(temp.node.right, temp.lvl + 1));
            }

        }
    }

    public static void kthLvl(Node root, int lvl, int k) {
        if (root == null)
            return;

        if (lvl == k) {
            System.out.print(root.data + "  ");
        }

        kthLvl(root.left, lvl + 1, k);
        kthLvl(root.right, lvl + 1, k);

    }

    public static boolean getPath(Node root, int data, ArrayList<Integer> list) {
        if (root == null)
            return false;

        list.add(root.data);
        if (root.data == data)
            return true;
        boolean left = getPath(root.left, data, list);
        boolean right = getPath(root.right, data, list);
        if (left || right) {
            return true;
        }
        if (!left && !right) {
            list.remove(list.size() - 1);
        }

        return false;
    }

    public static void lca(Node root, int n1, int n2) { // Tc O(n) - SC O(n)
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        getPath(root, n1, list1);
        getPath(root, n2, list2);
        int i = 0;
        for (; i < list1.size(); i++) {
            if (list1.get(i) != list2.get(i)) {
                break;
            }
        }

        System.out.println("Lowest common Ansector is  " + list1.get(i - 1));

    }

    public static Node lca2(Node root, int n1, int n2) {
        if (root == null)
            return root;

        if (root.data == n1 || root.data == n2)
            return root;

        Node left = lca2(root.left, n1, n2);
        Node right = lca2(root.right, n1, n2);

        if (left != null && right != null)
            return root;

        if (left != null)
            return left;

        return right;
    }

    public static int minPath(Node root, int n) {
        if (root == null)
            return -1;
        if (root.data == n)
            return 0;
        int left = minPath(root.left, n);
        int right = minPath(root.right, n);

        if (left == -1 && right == -1)
            return -1;

        if (left != -1)
            return left + 1;

        return right + 1;

    }

    public static void minimumDistance(Node root, int n1, int n2) {
        Node lca = lca2(root, n1, n2);
        int dist1 = minPath(lca, n1);
        int dist2 = minPath(lca, n2);
        System.out.println(dist1 + dist2);
    }

    public static int kthAnsector(Node root, int n, int k) {
        if (root == null)
            return -1;

        if (root.data == n)
            return 0;

        int left = kthAnsector(root.left, n, k);
        int right = kthAnsector(root.right, n, k);

        if (left == -1 && right == -1)
            return -1;

        if (left + 1 == k || right + 1 == k)
            return root.data;

        if (left != -1)
            return left + 1;

        return right + 1;
    }

    public static int transform(Node root) {
        if (root == null)
            return 0;

        int left = transform(root.left);
        int right = transform(root.right);

        int data = root.data;
        root.data = left + right;

        return left + right + data;
    }

    public static boolean isUni(Node root) {
        if (root == null)
            return true;

        if (root.left != null && root.data != root.left.data)
            return false;
        if (root.right != null && root.data != root.right.data)
            return false;

        return isUni(root.left) && isUni(root.right);
    }

    public static Node mirror(Node root) {
        if (root == null)
            return null;

        Node left = mirror(root.left);
        Node right = mirror(root.right);

        root.right = left;
        root.left = right;

        return root;
    }

    public static Node deleteLeafNode(Node root, int x) {
        if (root == null)
            return null;

        root.left = deleteLeafNode(root.left, x);
        root.right = deleteLeafNode(root.right, x);

        if (root.data == x && root.left == null && root.right == null)
            return null;

        return root;
    }

    public static boolean isIden(Node root1, Node root2) {
        if (root1 == null && root2 == null)
            return true;

        if (root1 == null || root2 == null || root1.data != root2.data)
            return false;

        if (!isIden(root1.left, root2.left)) {
            return false;
        }

        if (!isIden(root1.right, root2.right)) {
            return false;
        }

        return true;
    }

    public static boolean findNode(Node root, Node sub) {
        if (root == null)
            return false;

        if (root.data == sub.data) {
            if (isIden(root, sub)) {
                return true;
            }
        }

        return findNode(root.left, sub) || findNode(root.right, sub);

    }

    public static ArrayList<Integer> l = new ArrayList<>();
    public static Node sR;

    public static void findAllDup(Node root) {
        if (root == null)
            return;

        if (findNode(sR, root)) {
            l.add(root.data);
            // System.out.print(root.data);
        }

        findAllDup(root.left);
        findAllDup(root.right);

    }

    public static Node buildABST(Node root, int val) {
        if (root == null)
            return new Node(val);

        if (root.data > val) {
            root.left = buildABST(root.left, val);
        } else {
            root.right = buildABST(root.right, val);
        }

        return root;
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

    public static Node deleteNode(Node root, int x) {
        if (root == null)
            return null;

        if (root.data > x) {
            root.left = deleteNode(root.left, x);
        } else if (root.data < x) {
            root.right = deleteNode(root.right, x);
        } else {
            // Case 1 -> Leaf Node
            if (root.left == null && root.right == null)
                return null;

            // Case 2 -> One child
            if (root.left == null)
                return root.right;
            else if (root.right == null)
                return root.left;

            // Case 2 -> Two child
            Node IS = findeSuccessor(root.right);
            root.data = IS.data;
            root.right = deleteNode(IS, IS.data);
        }
        return root;
    }

    public static Node findeSuccessor(Node root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }

    public static void printInRange(Node root, int k1, int k2) {
        if (root == null)
            return;

        if (root.data >= k1 && root.data <= k2) {
            printInRange(root.left, k1, k2);
            System.out.print(root.data + "   ");
            printInRange(root.right, k1, k2);
        } else {
            if (root.data > k2)
                printInRange(root.left, k1, k2);
            else
                printInRange(root.right, k1, k2);
        }

    }

    public static void rootToLeaf(Node root, ArrayList<Integer> list) {
        if (root == null)
            return;
        list.add(root.data);
        if (root.left == null && root.right == null)
            System.out.println(list);

        rootToLeaf(root.left, list);
        rootToLeaf(root.right, list);
        list.remove(list.size() - 1);
    }

    public static boolean isValidBST(Node root, Node max, Node min) {
        if (root == null)
            return true;

        if (max != null && root.data >= max.data)
            return false;
        if (min != null && root.data <= min.data)
            return false;

        return isValidBST(root.left, root, min) && isValidBST(root.right, max, root);
    }

    public static Node balanceBST(int arr[], int si, int ei) {
        if (si > ei)
            return null;

        int mid = si + (ei - si) / 2;
        Node newNode = new Node(arr[mid]);
        newNode.left = balanceBST(arr, si, mid - 1);
        newNode.right = balanceBST(arr, mid + 1, ei);

        return newNode;
    }

    public static void getSorted(Node root, ArrayList<Integer> list) {
        if (root == null)
            return;
        getSorted(root.left, list);
        list.add(root.data);
        getSorted(root.right, list);
    }

    public static Node balance(ArrayList<Integer> list, int si, int ei) {
        if (si > ei)
            return null;

        int mid = si + (ei - si) / 2;

        Node root = new Node(list.get(mid));
        root.left = balance(list, si, mid - 1);
        root.right = balance(list, mid + 1, ei);
        return root;
    }

    public static Node bst2BalanceBST(Node root) {
        ArrayList<Integer> list = new ArrayList<>();
        getSorted(root, list);
        return balance(list, 0, list.size() - 1);
    }

    public static class Bt {

        int min;
        int max;
        int ht;
        boolean isValid;

        Bt(int min, int max, int ht, boolean isValid) {
            this.min = min;
            this.max = max;
            this.ht = ht;
            this.isValid = isValid;
        }

    }

    public static int maxHt = 0;

    public static Bt BSTinBT(Node root) {
        if (root == null)
            return new Bt(Integer.MAX_VALUE, Integer.MIN_VALUE, 0, true);

        Bt left = BSTinBT(root.left);
        Bt right = BSTinBT(root.right);

        int max = Math.max(left.max, Math.max(right.max, root.data));
        int min = Math.min(left.min, Math.min(right.min, root.data));
        int ht = left.ht + right.ht + 1;

        if (root.data <= left.max || root.data >= right.min)
            return new Bt(min, max, ht, false);

        if (left.isValid && right.isValid) {
            maxHt = Math.max(maxHt, ht);
            return new Bt(min, max, ht, true);
        }

        return new Bt(min, max, ht, false);

    }

    public static Node mergeTwoBSTs(Node root1, Node root2) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> fn = new ArrayList<>();
        getSorted(root1, list1);
        getSorted(root2, list2);
        int i = 0;
        int j = 0;
        while (i < list1.size() && j < list2.size()) {
            if (list1.get(i) <= list2.get(j)) {
                fn.add(list1.get(i));
                i++;
            } else {
                fn.add(list2.get(j));
                j++;
            }
        }

        while (i < list1.size()) {
            fn.add(list1.get(i));
            i++;
        }

        while (j < list2.size()) {
            fn.add(list2.get(j));
            j++;
        }

        return balance(fn, 0, fn.size() - 1);
    }

    public static int sum;

    public static void rangeSum(Node root, int k1, int k2) {
        if (root == null)
            return;

        if (root.data >= k1 && root.data <= k2) {
            rangeSum(root.left, k1, k2);
            sum += root.data;
            rangeSum(root.right, k1, k2);
        } else {
            if (root.data > k2) {
                rangeSum(root.left, k1, k2);
            } else {
                rangeSum(root.right, k1, k2);
            }
        }

    }

    public static int diff = Integer.MAX_VALUE;

    public static void minDifference(Node root, int k) {
        if (root == null)
            return;

        if (root.data == k) {
            diff = k;
            return;
        }

        diff = Math.min(diff, Math.abs(root.data - k));

        if (root.data > k) {
            minDifference(root.left, k);
        } else {
            minDifference(root.right, k);
        }
    }

    public static void main(String[] args) {
        // Node root = new Node(8);
        // root.left = new Node(5);
        // root.left.left = new Node(3);
        // root.left.left.left = new Node(1);
        // root.left.left.right = new Node(4);
        // root.left.right = new Node(6);
        // root.right = new Node(10);
        // root.right.right = new Node(11);
        // root.right.right.right = new Node(14);

        Node root = new Node(8);
        root.left = new Node(5);
        root.left.left = new Node(3);
        root.left.right = new Node(6);
        root.right = new Node(11);
        root.right.right = new Node(20);

        minDifference(root, 7);
        System.out.println(diff);
    }
}