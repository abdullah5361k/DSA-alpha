package DSA.pratice.Tries;

public class Trie {

    public static class Node {

        Node children[] = new Node[26];
        boolean eow = false;

        Node() {
            for (int i = 0; i < this.children.length; i++) {
                this.children[i] = null;
            }
        }
    }

    public static Node root = new Node();

    public static void insert(String word) {
        Node curr = root;
        for (int i = 0; i < word.length(); i++) {
            int idx = word.charAt(i) - 'a';
            if (curr.children[idx] == null) {
                curr.children[idx] = new Node();
            }
            curr = curr.children[idx];
        }

        curr.eow = true;
    }

    public static boolean search(String key) {
        Node curr = root;
        for (int i = 0; i < key.length(); i++) {
            int idx = key.charAt(i) - 'a';
            if (curr.children[idx] == null)
                return false;
            curr = curr.children[idx];
        }

        return curr.eow;
    }

    public static boolean wordBreakProblem(String str) {
        if (str.length() == 0)
            return true;
        for (int i = 1; i <= str.length(); i++) {
            if (search(str.substring(0, i)) && wordBreakProblem(str.substring(i))) {
                return true;
            }
            ;
        }

        return false;
    }

    public static void main(String[] args) {
        String words[] = { "i", "like", "sam", "samsung", "mobile", "ice" };
        for (int i = 0; i < words.length; i++) {
            insert(words[i]);
        }
        System.out.println(wordBreakProblem("ilikesams"));
        System.out.println(wordBreakProblem("ilikesam"));
        System.out.println(wordBreakProblem("ilikesung"));
    }
}
