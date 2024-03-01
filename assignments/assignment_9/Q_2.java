package DSA.assignments.assignment_9;

import java.util.PriorityQueue;

public class Q_2 {

    public static void ropes(int arr[]) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < arr.length; i++) {
            pq.add(arr[i]);
        }
        int res = 0;
        while (pq.size() > 1) {
            int v1 = pq.remove();
            int v2 = pq.remove();
            res += v1 + v2;
            pq.add(v1 + v2);
        }
        System.out.println(res);
    }

    public static void main(String[] args) {
        int arr[] = { 4, 3, 2, 6 };
        ropes(arr);
    }
}
