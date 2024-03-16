package DSA.Trees;

import java.util.*;

public class Topview {

    public static class Node {

        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    public static class Level {
        Node nd;
        int level;

        Level(Node nd, int level) {
            this.nd = nd;
            this.level = level;
        }

    }

    public static void topviewOfBT(Node root) {
        Queue<Level> q = new LinkedList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        q.add(new Level(root, 0));

        int min = 0, max = 0;
        while (!q.isEmpty()) {
            Level curr = q.remove();

            if (!map.containsKey(curr.level)) {
                map.put(curr.level, curr.nd.data);
            }

            if (curr.nd.left != null) {
                q.add(new Level(curr.nd.left, curr.level - 1));
                min = Math.min(min, curr.level - 1);
            }

            if (curr.nd.right != null) {
                q.add(new Level(curr.nd.right, curr.level + 1));
                max = Math.max(max, curr.level + 1);
            }

        }

        System.out.println(min);
        System.out.println(max);

        for (int i = min; i <= max; i++) {
            System.out.print(map.get(i) + " ");
        }

    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        topviewOfBT(root);

    }
}
