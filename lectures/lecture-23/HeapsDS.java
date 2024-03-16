import java.util.ArrayList;

public class HeapsDS {

    static class Heap {
        ArrayList<Integer> arr = new ArrayList<>();

        public void add(int data) {
            // Add at last index;
            arr.add(data);

            int x = arr.size() - 1;
            int par = (x - 1) / 2;

            while (arr.get(x) < arr.get(par)) {
                // Swap
                int temp = arr.get(x);
                arr.set(x, arr.get(par));
                arr.set(par, temp);
            }

        }

        public int peek() {
            return arr.get(0);
        }

        private void heapify(int idx) {
            int left = 2 * idx + 1;
            int right = 2 * idx + 2;
            int min = idx;

            if (left < arr.size() && arr.get(min) > arr.get(left)) {
                min = left;
            }

            if (right < arr.size() && arr.get(min) > arr.get(right)) {
                min = right;
            }

            if (min != idx) {
                // Swap
                int temp = arr.get(idx);
                arr.set(idx, arr.get(min));
                arr.set(min, temp);

                heapify(min);
            }

        }

        public int remove() {
            int data = arr.get(0);
            // Swap
            int temp = arr.get(0);
            arr.set(0, arr.size() - 1);
            arr.set(arr.size() - 1, temp);

            // Step2 delete
            arr.remove(arr.size() - 1);

            // Heapy
            heapify(0);

            return data;
        }

    }

    public static void main(String[] args) {

    }
}
