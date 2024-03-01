package DSA.assignments.assignment_9;

import java.util.Stack;

public class Q_4 {

    public static void maxsubArray(int arr[], int k) {
        Stack<Integer> st = new Stack<>();
        int rme[] = new int[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            while (!st.isEmpty() && arr[st.peek()] < arr[i]) {
                st.pop();
            }
            if (st.isEmpty()) {
                rme[i] = arr.length;
            } else {
                rme[i] = st.peek();
            }
            st.push(i);
        }

        int res[] = new int[arr.length - k + 1];
        int j = 0;
        for (int i = 0; i < arr.length - k + 1; i++) {
            if (j >= i + k)
                j = i;
            int max = 0;
            while (j < i + k) {
                max = arr[j];
                j = rme[j];
            }
            res[i] = max;
        }

        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 1, 4, 5, 2, 3, 6 };
        maxsubArray(arr, 3);
    }
}
