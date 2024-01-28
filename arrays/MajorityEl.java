public class MajorityEl {

    public static int majorityElement(int arr[]) {
        // Moore's Voting Algorithm
        int count = 0;
        int el = 0;
        for (int i = 0; i < arr.length; i++) {
            if (count == 0) {
                el = arr[i];
                count++;
            } else if (el == arr[i]) {
                count++;
            } else {
                count--;
            }
        }

        // Check if the stored element is the majority el
        int count1 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == el) {
                count1++;
            }
        }

        if (count1 > arr.length / 2) {
            return el;
        }
        return -1;

    }

    public static void main(String[] args) {
        int arr[] = { 4, 4, 2, 4, 3, 4, 4, 3, 2, 4 };
        System.out.println(majorityElement(arr));
    }
}
