package DSA.pratice.Hash;

import java.util.*;

public class HashMapImplementation {

    // public static class HashMap<K, V> {

    // private class Node {

    // K key;
    // V value;

    // Node(K key, V value) {
    // this.key = key;
    // this.value = value;
    // }
    // }

    // private LinkedList<Node> bucket[];
    // private int n;

    // @SuppressWarnings("unchecked")
    // HashMap() {
    // this.n = 4;
    // this.bucket = new LinkedList[4];
    // for (int i = 0; i < bucket.length; i++) {
    // bucket[i] = new LinkedList<>();
    // }
    // }

    // private int hashFunction(K key) {
    // int idx = key.hashCode();
    // return Math.abs(idx) % bucket.length;
    // }

    // private int searchInLL(K key, int bi) {
    // LinkedList<Node> ll = bucket[bi];

    // for (int i = 0; i < ll.size(); i++) {
    // Node node = ll.get(i);
    // if (node.key == key) {
    // return i;
    // }
    // }
    // return -1;
    // }

    // @SuppressWarnings("unchecked")
    // private void reHashing() {
    // LinkedList<Node> oldBucket[] = bucket;
    // bucket = new LinkedList[bucket.length * 2];

    // for (int i = 0; i < oldBucket.length; i++) {
    // LinkedList<Node> ll = oldBucket[i];
    // for (int j = 0; j < ll.size(); j++) {
    // Node node = ll.get(i);
    // put(node.key, node.value);
    // }
    // }

    // }

    // public void put(K key, V value) {
    // int bi = hashFunction(key);
    // int di = searchInLL(key, bi);

    // if (di != -1) {
    // bucket[bi].get(di).value = value;
    // } else {
    // bucket[bi].add(new Node(key, value));
    // n++;
    // }

    // double lambda = (double) n / bucket.length;

    // if (lambda > 2.0) {
    // reHashing();
    // }

    // }

    // public boolean containsKey(K key) {
    // int bi = hashFunction(key);
    // int di = searchInLL(key, bi);

    // if (di != -1)
    // return true;
    // return false;
    // }

    // public V remove(K key) {
    // int bi = hashFunction(key);
    // int di = searchInLL(key, bi);
    // if (di == -1)
    // return null;
    // n--;
    // return bucket[bi].remove(di).value;
    // }

    // public V get(K key) {
    // int bi = hashFunction(key);
    // int di = searchInLL(key, bi);
    // if (di == -1)
    // return null;
    // return bucket[bi].get(di).value;
    // }

    // public ArrayList<K> keySets() {
    // ArrayList<K> keys = new ArrayList<>();

    // for (int i = 0; i < bucket.length; i++) {
    // LinkedList<Node> ll = bucket[i];
    // for (Node node : ll) {
    // keys.add(node.key);
    // }
    // }

    // return keys;

    // }

    // }

    public static String getFirst(HashMap<String, String> tickets) {
        HashMap<String, String> revMap = new HashMap<>();
        for (String key : tickets.keySet()) {
            revMap.put(tickets.get(key), key);
        }

        for (String key : tickets.keySet()) {
            if (!revMap.containsKey(key)) {
                return key;
            }
        }

        return null;

    }

    public static void itinerary(HashMap<String, String> tickets) {
        String start = getFirst(tickets);
        System.out.print(start + " ");
        for (String key : tickets.keySet()) {
            System.out.print(" -> " + tickets.get(start));
            start = tickets.get(start);
        }
    }

    public static void subarrayWithSum0(int arr[]) {
        int sum = 0;
        int ans = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (map.containsKey(sum)) {
                ans = Math.max(ans, i - map.get(sum));
            } else {
                map.put(sum, i);
            }
        }

        System.out.println(ans);

    }

    public static void subarraySumK(int arr[], int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        map.put(0, 1);
        int sum = 0;
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (map.containsKey(sum - k)) {
                ans += map.get(sum - k);
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        System.out.println(ans);

    }

    public static void main(String[] args) {
        int arr[] = { 10, 2, -2, -20, 10 };
        subarraySumK(arr, -10);

    }
}
