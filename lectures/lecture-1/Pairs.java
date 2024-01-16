public class Pairs {
    public static void pair(int arr[]) {
        int p = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                System.out.print("(" + arr[i] + "," + arr[j] + ") ");
                p++;
            }
            System.out.println();
        }
        System.out.println("Pair = " + p);
    }

    public static void main(String args[]) {
        int array[] = { 2, 4, 6, 8, 10 };
        pair(array);
    }
}
