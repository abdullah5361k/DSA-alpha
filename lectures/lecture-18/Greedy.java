import java.util.*;

public class Greedy {

    public static void absoluteDifference(int A[], int B[]) {
        Arrays.sort(A);
        Arrays.sort(B);
        int minDiff = 0;
        for (int i = 0; i < A.length; i++) {
            minDiff += Math.abs(A[i] - B[i]);
        }

        System.out.println(minDiff);

    }

    public static void main(String[] args) {

        // Min Def
        int A[] = { 4, 1, 8, 7 };
        int B[] = { 2, 3, 6, 5 };
        absoluteDifference(A, B);

        int start[] = { 1, 3, 0, 5, 8, 5 };
        int end[] = { 2, 4, 6, 7, 9, 9 };

        int act[][] = new int[start.length][3];

        for (int i = 0; i < start.length; i++) {
            act[i][0] = i;
            act[i][1] = start[i];
            act[i][2] = end[i];
        }

        Arrays.sort(act, Comparator.comparingDouble(o -> o[2]));

        ArrayList<Integer> al = new ArrayList<>();
        int activities = 1;
        al.add(act[0][0]);
        int ending = act[0][2];
        for (int i = 1; i < start.length; i++) {
            if (act[i][1] >= ending) {
                al.add(act[i][0]);
                activities++;
                ending = act[i][2];
            }
        }

        System.out.println(activities);
        System.out.println(al);

    }
}
