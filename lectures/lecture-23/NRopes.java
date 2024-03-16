import java.util.PriorityQueue;

public class NRopes {
    public static void main(String[] args) {
        int ropes[] = { 2, 3, 3, 4, 6 };
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < ropes.length; i++) {
            pq.add(ropes[i]);
        }

        int cost = 0;
        while (pq.size() > 1) {
            int s1 = pq.remove();
            int s2 = pq.remove();
            cost += s1 + s2;
            pq.add(s1 + s2);
        }

        System.out.println(cost);
    }
}
