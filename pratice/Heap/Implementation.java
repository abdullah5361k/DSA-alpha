package DSA.pratice.Heap;

import java.util.ArrayList;

public class Implementation {

    public static class Heap {

        ArrayList<Integer> arr = new ArrayList<>();

        public void add(int data) {
            // Add data at last idx
            arr.add(data);

            // Fix heap
            int x = arr.size() - 1;
            int pr = (x - 1) / 2;

            while (arr.get(pr) > arr.get(x)) {
                // Swap it
                int temp = arr.get(pr);
                arr.set(pr, arr.get(x));
                arr.set(x, temp);

                x = pr;
                pr = (x - 1) / 2;
            }

        }

        public int peek() {
            return arr.get(0);
        }

        private void heapify(int i) {
            int left = 2 * i + 1;
            int right = 2 * i + 2;
            int min = i;

            if (left < arr.size() && arr.get(min) > arr.get(left)) {
                min = left;
            }

            if (right < arr.size() && arr.get(min) > arr.get(right)) {
                min = right;
            }

            // Swap
            if (min != i) {
                int temp = arr.get(i);
                arr.set(i, arr.get(min));
                arr.set(min, temp);

                heapify(min);
            }

        }

        public int delete() { // O(logn)
            int data = arr.get(0);

            // Swap
            int temp = arr.get(arr.size() - 1);
            arr.set(arr.size() - 1, arr.get(0));
            arr.set(0, temp);

            // Delete
            arr.remove(arr.size() - 1);

            // Heapify
            heapify(0);

            return data;
        }

        public boolean isEmpty() {
            return arr.size() == 0;
        }

    }

    public static void main(String[] args) {
        Heap hp = new Heap();

        hp.add(3);
        hp.add(4);
        hp.add(1);
        hp.add(5);

        System.out.println(hp.arr);
        // while (!hp.isEmpty()) {
        // System.out.println(hp.peek());
        // hp.delete();
        // }

    }
}
