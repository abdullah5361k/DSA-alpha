import java.util.HashSet;

public class Unions {

    public static int union(int arr1[], int arr2[]) {
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < arr1.length; i++) {
            set.add(arr1[i]);
        }

        for (int j = 0; j < arr2.length; j++) {
            set.add(arr2[j]);
        }

        for (Integer integer : set) {
            System.out.print(integer + "   ");
        }

        return set.size();
    }

    public static int intersection(int arr1[], int arr2[]) {
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < arr1.length; i++) {
            set.add(arr1[i]);
        }

        int sec = 0;
        for (int i = 0; i < arr2.length; i++) {
            if (set.contains(arr2[i])) {
                sec++;
                set.remove(arr2[i]);
            }
        }

        return sec;
    }

    public static void main(String[] args) {
        int arr1[] = { 7, 3, 9 };
        int arr2[] = { 6, 3, 9, 2, 9, 4 };

        union(arr1, arr2);
        System.out.println();
        intersection(arr1, arr2);

        // System.out.print(union(arr1, arr2));
        // System.out.println();
        // System.out.println(intersection(arr1, arr2));

    }
}
