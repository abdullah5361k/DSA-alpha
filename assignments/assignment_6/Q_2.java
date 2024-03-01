package DSA.assignments.assignment_6;

public class Q_2 {

    public static int majorityElement(int arr[]) {
        int count = 0;
        int majority = 0;
        for (int i = 0; i < arr.length; i++) {
            if (count == 0) {
                majority = arr[i];
                count = 1;
            } else if (arr[i] == majority) {
                count++;
            } else {
                count--;
            }
        }
        return majority;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 2, 1, 1, 1, 2, 2 };
        System.out.println(majorityElement(arr));
    }
}
