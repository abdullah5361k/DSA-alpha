package DSA.pratice.Queue;

import java.util.*;

public class Que {

    /**
     * * First not repeating letter
     * 
     * @param str
     */
    public static void firstNotRepeating(String str) { // Input ->>> aabccxb
        int freq[] = new int[26];
        Queue<Character> q = new LinkedList<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            freq[ch - 'a']++;
            q.add(ch);
            while (!q.isEmpty() && freq[q.peek() - 'a'] > 1) {
                q.remove();
            }
            if (q.isEmpty()) {
                System.out.print(-1 + " ");
            } else {
                System.out.print(q.peek() + " ");
            }
        }
    }

    /**
     * * Interleve two halves of Queue
     * 
     * @param q1
     */
    public static void interleaveTwoHalves(Queue<Integer> q1) {
        Queue<Integer> q2 = new LinkedList<>();
        int firstHalf = q1.size() / 2;
        for (int i = 0; i < firstHalf; i++) {
            q2.add(q1.remove());
        }

        while (!q2.isEmpty()) {
            q1.add(q2.remove());
            q1.add(q1.remove());
        }
    }

    public static void generateBinNum(int n) {
        for (int i = 1; i <= n; i++) {
            int x = i;
            int pow = 0;
            int bin = 0;
            while (x > 0) {
                int rem = x % 2;
                bin = bin + (rem * (int) Math.pow(10, pow));
                x /= 2;
                pow++;
            }
            System.out.print(bin + "  ");
        }
    }

    public static void nopes(int arr[]) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < arr.length; i++) {
            pq.add(arr[i]);
        }
        int res = 0;
        while (pq.size() > 1) {
            int s1 = pq.remove();
            int s2 = pq.remove();
            res += s1 + s2;
            pq.add(s1 + s2);
        }
        System.out.println(pq);
        System.out.println(res);

    }

    public static void reverseK(Queue<Integer> q, int k) {
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < k; i++) {
            st.push(q.remove());
        }
        while (!st.isEmpty()) {
            q.add(st.pop());
        }
        for (int i = 0; i < k; i++) {
            q.add(q.remove());
        }
    }

    public static void maxsubOfK(int arr[], int k) {
        for (int i = 0; i <= arr.length - k; i++) {
            int max = 0;
            for (int j = i; j < i + k; j++) {
                max = Math.max(max, arr[j]);
            }
            System.out.print(max + "  ");
        }
    }

    public static void firstNegative(int arr[], int k) {
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                q.add(i);
            }
        }
        int res[] = new int[arr.length - k + 1];
        for (int i = 0; i < arr.length - k + 1; i++) {
            if (!q.isEmpty() && q.peek() < i) {
                q.remove();
            }
            if (!q.isEmpty() && q.peek() >= i && q.peek() < i + k) {
                res[i] = arr[q.peek()];
            } else {
                res[i] = 0;
            }

        }
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
    }

    public static void genBin(int n) {
        Queue<String> q = new LinkedList<>();
        q.add("1");
        while (n-- > 0) {
            String s1 = q.peek();
            q.remove();
            System.out.println(s1);
            q.add(s1 + "0");
            q.add(s1 + "1");
        }
    }

    public static void subarray(int arr[]) {
        int min = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int m = Integer.MAX_VALUE;
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] + "");
                    m = Math.min(m, arr[k]);
                }
                min += m;
                System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println(min);
    }

    public static void main(String[] args) {
        int arr[] = { 3, 1, 2, 4 };
        subarray(arr);
    }
}
