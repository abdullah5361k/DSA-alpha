
import java.util.*;

public class NearestCars {

    public static class Points implements Comparable<Points> {

        int x;
        int y;
        int dist;

        Points(int x, int y, int dist) {
            this.x = x;
            this.y = y;
            this.dist = dist;
        }

        @Override
        public int compareTo(Points p) {
            return this.dist - p.dist;
        }
    }

    public static void main(String[] args) {
        int arr[][] = { { 3, 3 }, { 5, -1 }, { -2, 4 } };
        int k = 2;
        PriorityQueue<Points> pq = new PriorityQueue<>();

        for (int i = 0; i < arr.length; i++) {
            int dist = arr[i][0] * arr[i][0] + arr[i][1] * arr[i][1];
            pq.add(new Points(arr[i][0], arr[i][1], dist));
        }

        for (int i = 0; i < k; i++) {
            System.out.println("C" + pq.remove().dist);
        }

    }
}
