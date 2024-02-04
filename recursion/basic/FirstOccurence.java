package DSA.recursion.basic;

public class FirstOccurence {

    public static int occurence(int arr[], int i, int key) {
        if (i == arr.length) {
            return -1;
        }

        if (arr[i] == key) {
            return i;
        }

        return occurence(arr, i + 1, key);

    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 1, 2, 3, 1, 3, 5 };
        System.out.println(occurence(arr, 0, 1));
    }
}
