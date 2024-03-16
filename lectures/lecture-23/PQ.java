import java.util.*;

public class PQ {

    public static class Student implements Comparable<Student> {

        String name;
        int rank;

        Student(String name, int rank) {
            this.name = name;
            this.rank = rank;
            // System.out.println(this.name);
        }

        @Override
        public int compareTo(Student s2) {
            return this.rank - s2.rank;
        }

    }

    public static void main(String[] args) {
        PriorityQueue<Student> pq = new PriorityQueue<>();

        pq.add(new Student("abdullah", 12));
        pq.add(new Student("Hasnan", 100));
        pq.add(new Student("Romesa", 7));
        pq.add(new Student("Jannat", 19));

        while (!pq.isEmpty()) {
            System.out.println(pq.peek().name + "-> " + pq.peek().rank);
            pq.remove();
        }

    }
}
