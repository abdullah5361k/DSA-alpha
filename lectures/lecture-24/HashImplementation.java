import java.util.*;

public class HashImplementation {

    public static class HashMap<K, V> { // Generic

        private class Node {
            K key;
            V value;

            Node(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }

        private int n; // n
        private LinkedList<Node> buckets[]; // N

        @SuppressWarnings("unchecked")
        public HashMap() {
            // this.n = 4;
            this.buckets = new LinkedList[4];
            for (int i = 0; i < buckets.length; i++) {
                buckets[i] = new LinkedList<>();
            }
        }

        private int hashFunction(K key) {
            int hc = key.hashCode();
            return Math.abs(hc) % buckets.length;
        }

        @SuppressWarnings("unchecked")
        private void rehash() {
            LinkedList<Node> oldBucket[] = buckets;
            buckets = new LinkedList[buckets.length * 2];

            for (int i = 0; i < oldBucket.length; i++) {
                LinkedList<Node> ll = buckets[i];
                for (int j = 0; j < ll.size(); j++) {
                    Node node = ll.get(i);
                    put(node.key, node.value);
                }
            }

        }

        private int searchInLL(K key, int bi) {
            LinkedList<Node> ll = buckets[bi];
            int di = 0;

            for (int i = 0; i < ll.size(); i++) {
                Node node = ll.get(i);
                if (node.key == key) {
                    return di;
                }
                di++;
            }

            return -1;

        }

        public void put(K key, V value) {
            int bi = hashFunction(key);
            int di = searchInLL(key, bi); // key ? __ : -1

            if (di != -1) {
                Node node = buckets[bi].get(di);
                node.value = value;
            } else {
                Node newNode = new Node(key, value);
                buckets[bi].add(newNode);
                n++;
            }

            double lambda = (double) n / buckets.length;
            if (lambda > 2.0) {
                rehash();
            }
        }

        public boolean containsKey(K key) {
            int hi = hashFunction(key);
            int di = searchInLL(key, hi);
            if (di != -1)
                return true;
            return false;
        }

        public V remove(K key) {
            int bi = hashFunction(key);
            int di = searchInLL(key, bi);
            if (di != -1) {
                Node node = buckets[bi].remove(di);
                n--;
                return node.value;
            }
            return null;
        }

        public V get(K key) {
            int hi = hashFunction(key);
            int di = searchInLL(key, hi);
            if (di != -1) {
                Node node = buckets[hi].get(di);
                return node.value;
            }
            return null;
        }

        public ArrayList<K> keySet() {
            ArrayList<K> keys = new ArrayList<>();

            for (int i = 0; i < buckets.length; i++) {
                LinkedList<Node> ll = buckets[i];
                for (Node node : ll) {
                    keys.add(node.key);
                }
            }

            return keys;
        }

        public boolean isEmpty() {
            return n == 0;
        }

    }

    public static void main(String[] args) {

    }
}
