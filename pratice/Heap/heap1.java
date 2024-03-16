package DSA.pratice.Heap;

import java.util.*;

public class heap1 {

    public static class Heap {

        ArrayList<Integer> hp = new ArrayList<>();

        public void add(int data) {
            // Add into array
            hp.add(data);

            // Set heap
            int x = hp.size() - 1;
            int par = (x - 1) / 2;

            while (hp.get(par) > hp.get(x)) {
                // Swap
                int temp = hp.get(par);
                hp.set(par, hp.get(x));
                hp.set(x, temp);
                x = par;
                par = (x - 1) / 2;
            }
        }

        public int delete() {
            int data = hp.get(0);

            // Swap
            hp.set(0, hp.get(hp.size() - 1));

            // Delete
            hp.remove(hp.size() - 1);

            // Fix heap
            heapify(0);
            return data;

        }

        public int peek() {
            return hp.get(0);
        }

        public boolean isEmpty() {
            return hp.size() == 0;
        }

        public void heapify(int i) {
            int left = 2 * i + 1;
            int right = 2 * i + 2;
            int min = i;

            if (left < hp.size() && hp.get(min) > hp.get(left)) {
                min = left;
            }

            if (right < hp.size() && hp.get(min) > hp.get(right)) {
                min = right;
            }

            if (i != min) {
                // Swap

                int temp = hp.get(i);
                hp.set(i, hp.get(min));
                hp.set(min, temp);

                heapify(min);
            }

        }

    }

    public static void heapify(int i, int size, int arr[]) {
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        int max = i;

        if (left < size && arr[max] < arr[left]) {
            max = left;
        }

        if (right < size && arr[max] < arr[right]) {
            max = right;
        }

        if (i != max) {
            // Swap
            int temp = arr[i];
            arr[i] = arr[max];
            arr[max] = temp;

            heapify(max, size, arr);
        }

    }

    public static void heapSort(int arr[]) {
        // Convert this arr into max heap
        int n = arr.length;
        for (int i = n / 2; i >= 0; i--) {
            heapify(i, arr.length - 1, arr);
        }

        // Sort array
        for (int i = n - 1; i >= 0; i--) {
            // Swap
            int temp = arr[i];
            arr[i] = arr[0];
            arr[0] = temp;

            heapify(0, i, arr);
        }

    }

    public static class Weak implements Comparable<Weak> {

        int count;
        int idx;

        Weak(int count, int idx) {
            this.count = count;
            this.idx = idx;
        }

        public int compareTo(Weak w1) {
            if (this.count == w1.count) {
                return this.idx - w1.idx;
            }
            return this.count - w1.count;
        }

    }

    public static void weakestSoldier(int arr[][]) {

        PriorityQueue<Weak> pq = new PriorityQueue<>();

        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr[0].length; j++) {
                count += arr[i][j] == 1 ? 1 : 0;
            }
            pq.add(new Weak(count, i));
        }
    }

    public static class Info implements Comparable<Info> {

        int val;
        int idx;

        Info(int val, int idx) {
            this.val = val;
            this.idx = idx;
        }

        public int compareTo(Info in) {
            return in.val - this.val;
        }

    }

    public static void slidingWindow(int arr[], int k) {
        PriorityQueue<Info> pq = new PriorityQueue<>();
        int res[] = new int[arr.length - k + 1];

        for (int i = 0; i < k; i++) {
            pq.add(new Info(arr[i], i));
        }
        res[0] = pq.peek().val;

        for (int i = k; i < arr.length; i++) {
            while (!pq.isEmpty() && pq.peek().idx <= (i - k)) {
                pq.remove();
            }
            pq.add(new Info(arr[i], i));
            res[i - k + 1] = pq.peek().val;
        }

        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }

    }

    public static void main(String[] args) {
        int arr[] = { 1, 3, -1, -3, 5, 3, 6, 7 };

        slidingWindow(arr, 3);

    }
}
