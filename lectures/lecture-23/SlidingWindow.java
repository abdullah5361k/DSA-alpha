import java.util.Comparator;
import java.util.PriorityQueue;

public class SlidingWindow {

    public static class Pair implements Comparable<Pair> {

        int data;
        int idx;

        Pair(int data, int idx) {
            this.data = data;
            this.idx = idx;
        }

        @Override
        public int compareTo(Pair s) {
            return s.data - this.data;
        }

    }

    public static void maxWindow(int arr[], int k) {
        int max[] = new int[arr.length - k + 1];
        PriorityQueue<Pair> pq = new PriorityQueue<>();

        for (int i = 0; i < k; i++) {
            pq.add(new Pair(arr[i], i));
        }
        max[0] = pq.peek().data;
        for (int i = k; i < arr.length; i++) {
            while (!pq.isEmpty() && pq.peek().idx <= (i - k)) {
                pq.remove();
            }
            pq.add(new Pair(arr[i], i));
            max[i - k + 1] = pq.peek().data;
        }

        for (int i = 0; i < max.length; i++) {
            System.err.print(max[i] + "  ");
        }

    }

    public static void main(String[] args) {
        int arr[] = { 1, 3, -1, -3, 5, 3, 6, 7 };
        maxWindow(arr, 3);
    }
}
