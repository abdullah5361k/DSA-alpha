import java.util.*;

// public class ArraysNums {

//     public static int largestNum(int num[]) {
//         int largest = Integer.MIN_VALUE;

//         for (int i = 0; i < num.length; i++) {
//             if (num[i] > largest) {
//                 largest = num[i];
//             }
//         }
//         return largest;

//     }

//     public static void main(String args[]) {
//         int num[] = { 1, 4, 10, 7, 8 };
//         int small = largestNum(num);
//         System.out.println(small);
//     }
// }

/**
 * Smallest num in array
 */
public class ArraysNums {

    public static int smallestNum(int num[]) {
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < num.length; i++) {
            if (num[i] < smallest) {
                smallest = num[i];
            }
        }
        return smallest;
    }

    public static void main(String args[]) {
        int num[] = { 11, 4, 10, 7, 8 };
        System.out.print("Smallest num is " + smallestNum(num));
    }
}
