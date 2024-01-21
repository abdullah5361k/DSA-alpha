public class LeftRotate {

    public static void rotate(int arr[]) {
        int first = arr[0];
        for (int i = 1; i < arr.length; i++) {
            arr[i - 1] = arr[i];
        }
        arr[arr.length - 1] = first;
    }

    public static void main(String[] args) {
        int array[] = { 1, 2, 3, 4, 5 };
        rotate(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
