package DSA.pratice.Tries;

public class Prefix {

    public static class Node {

        Node children[] = new Node[26];
        int freq;
        boolean eow = false;

        Node() {
            for (int i = 0; i < this.children.length; i++) {
                this.children[i] = null;
            }
            this.freq = 1;
        }
    }

    public static Node root = new Node();

    public static void insert(String word) {
        Node curr = root;
        for (int i = 0; i < word.length(); i++) {
            int idx = word.charAt(i) - 'a';
            if (curr.children[idx] == null) {
                curr.children[idx] = new Node();
            } else {
                curr.children[idx].freq++;
            }
            curr = curr.children[idx];
        }
        curr.eow = true;
    }

    public static void search(String word) {
        Node curr = root;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            int idx = word.charAt(i) - 'a';
            char ch = (char) (idx + 'a');
            sb.append(ch);
            if (curr.children[idx].freq == 1) {
                System.out.print(sb);
                break;
            }

            curr = curr.children[idx];
        }
        System.out.println();
    }

    public static void findPrefix(Node root, String ans) {

        if (root == null) {
            return;
        }

        if (root.freq == 1) {
            System.out.print(ans);
            System.out.println();
            return;
        }
        for (int i = 0; i < root.children.length; i++) {
            if (root.children[i] != null) {
                findPrefix(root.children[i], ans + (char) (i + 'a'));
            }
        }
    }

    public static boolean startWith(String prefix) {
        Node curr = root;
        for (int i = 0; i < prefix.length(); i++) {
            int idx = prefix.charAt(i) - 'a';
            if (curr.children[idx] == null) {
                return false;
            }
            curr = curr.children[idx];
        }
        return true;
    }

    public static String ans = "";

    public static void longestWord(Node root, StringBuilder str) {
        if (root == null)
            return;

        for (int i = 0; i < root.children.length; i++) {
            if (root.children[i] != null && root.children[i].eow == true) {
                char ch = (char) (i + 'a');
                str.append(ch);
                if (str.length() > ans.length()) {
                    ans = str.toString();
                }
                longestWord(root.children[i], str);
                str.deleteCharAt(str.length() - 1);
            }
        }

    }

    public static void main(String[] args) {
        String words[] = { "a", "banana", "app", "appl", "ap", "apply", "apple" };
        for (int i = 0; i < words.length; i++) {
            insert(words[i]);
        }

        // longestWord(root, new StringBuilder());

        // System.out.println(ans);

        String str = "apple";

        System.out.println(str.contains("les"));

    }
}
