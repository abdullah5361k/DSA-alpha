public class IsSorted {

    public static boolean sort(int arr[]) {
        int a = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] >= a) {
                a = arr[i];
            } else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int array[] = { 1, 2, 3, 4, 5, 1 };
        System.out.println(sort(array));
    }
}
