public class Prefix {

    public static class Node {

        Node children[] = new Node[26];
        boolean eow = false;
        int freq;

        Node() {
            for (int i = 0; i < this.children.length; i++) {
                this.children = null;
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

    public static void findprefix(String word, String ans, int idx) {

    }

    public static void main(String[] args) {
        String arr[] = { "zebra", "dog", "duck", "dove" };
        for (int i = 0; i < arr.length; i++) {
            insert(arr[i]);
        }
        root.freq = -1;
    }
}
