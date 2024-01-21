public class SecondLargest {

    public static int secondLargests(int n, int arr[]) {
        int largest = arr[0];
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 1; i < arr.length; i++) {
            if (largest < arr[i]) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] < largest && arr[i] > secondLargest) {
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }

    public static int secondSmallest(int n, int arr[]) {
        int smallest = arr[0];
        int second = Integer.MAX_VALUE;

        for (int i = 1; i < arr.length; i++) {
            if (smallest > arr[i]) {
                second = smallest;
                smallest = arr[i];
            } else if (smallest != arr[i] && arr[i] < second) {
                second = arr[i];
            }
        }
        return second;
    }

    public static void main(String[] args) {
    }

}