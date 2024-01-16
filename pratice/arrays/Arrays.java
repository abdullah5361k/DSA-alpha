import java.util.*;

/**
 * Linear search
 */
// public class Arrays {

// public static int search(int top[], int key) {
// for (int i = 0; i <= top.length - 1; i++) {
// if (top[i] == key) {
// return top[i];
// }
// }
// return -1;
// }

// public static void main(String args[]) {
// int topPlayer[] = { 10, 7, 17, 18, 56 };
// int key = 56;
// int index = search(topPlayer, key);
// if (index == -1) {
// System.out.println("Not in our list");
// } else {
// System.out.println("Player number is " + index);
// }
// }
// }

/**
 * Max number in an array
 */
// public class Arrays {

// // Second way
// public static int maxNum2(int num[]) {
// int largest = Integer.MIN_VALUE;
// for (int i = 0; i < num.length; i++) {
// if (largest < num[i]) {
// largest = num[i];
// }
// }
// return largest;
// }

// public static void main(String args[]) {
// int topPlayer[] = { 10, 7, 17, 18, 56, 8 };
// int max = maxNum2(topPlayer);
// System.out.println(max);
// }
// }

/**
 * MIn number in an array
 */

// public class Arrays {

// public static int minNum(int num[]) {
// int smallest = Integer.MAX_VALUE;
// for (int i = 0; i < num.length; i++) {
// if (num[i] < smallest) {
// smallest = num[i];
// }
// }
// return smallest;
// }

// public static void main(String args[]) {
// int array[] = { 10, 20, 4, 3, 40, 1 };
// System.out.print(minNum(array));
// }
// }

/**
 * Binary Search
 */

// public class Arrays {

// public static int binary(int array[], int key) {
// int start = 0, end = array.length - 1;

// while (start <= end) {
// int mid = (start + end) / 2;
// if (array[mid] == key) {
// return mid;
// }

// if (array[mid] > key) {
// end = mid - 1;
// } else {
// start = mid + 1;
// }

// }
// return -1;
// }

// public static void main(String args[]) {
// int sort[] = { 2, 4, 6, 8, 10, 12, 14 };
// System.err.println(binary(sort, 14));
// }
// }

/**
 * Reverse an array
 */

// public class Arrays {

// public static void reverseArray(int arr[]) {
// int start = 0, end = arr.length - 1;
// while (start < end) {
// int temp = arr[start];
// arr[start] = arr[end];
// arr[end] = temp;
// start++;
// end--;
// }
// }

// public static void main(String arg[]) {
// int a[] = { 2, 3, 5, 6, 7 };
// reverseArray(a);
// for (int i = 0; i < a.length; i++) {
// System.out.print(a[i] + " ");
// }
// }
// }

/**
 * Pair in an Array
 */

// public class Arrays {

// public static void pair(int array[]) {
// for (int i = 0; i < array.length; i++) {
// for (int j = i + 1; j < array.length; j++) {
// System.out.print("(" + array[i] + "," + array[j] + ") ");
// }
// System.out.println();
// }
// }

// public static void main(String args[]) {
// int array[] = { 2, 4, 6, 8, 10 };
// pair(array);
// }
// }

/**
 * Sub arrays
 */

// public class Arrays {

// public static void subArrays(int arr[]) {
// int par = 0;
// for (int i = 0; i < arr.length; i++) {
// for (int j = i; j < arr.length; j++) {
// for (int k = i; k <= j; k++) {
// System.out.print(arr[k]);
// }
// par++;
// System.out.print(" ");
// }
// System.out.println();
// }
// System.out.println("PAIR: " + par);

// }

// public static void main(String args[]) {
// int array[] = { 2, 4, 6, 8, 10 };
// subArrays(array);
// }
// }

/**
 * Binary
 */
// public class Arrays {

// public static int search(int arr[], int key) {
// // Binary
// int start = 0, end = arr.length - 1;

// while (start <= end) {
// int mid = (start + end) / 2;
// if (arr[mid] == key) {
// return mid;
// }

// if (arr[mid] > key) {
// end = mid - 1;
// } else {
// start = mid + 1;
// }
// }
// return -1;

// }

// public static void main(String[] args) {
// int array[] = { 2, 5, 8, 12, 16, 23, 28, 56, 72, 91 };
// int index = search(array, 2);
// System.out.println(index);
// }
// }

/**
 * Reverse an array
 */
// public class Arrays {

// public static void reverseArray(int arr[]) {
// int start = 0, end = arr.length - 1;
// while (start < end) {
// int temp = arr[start];
// arr[start] = arr[end];
// arr[end] = temp;
// start++;
// end--;
// }
// }

// public static void main(String[] args) {
// int arr[] = { 2, 4, 6, 7, 9 };
// reverseArray(arr);
// for (int i = 0; i < arr.length; i++) {
// System.out.print(arr[i] + " ");
// }
// }

// }

// public class Arrays {

// public static void subArrays(int arr[]) {
// for (int i = 0; i < arr.length; i++) {
// for (int j = 0; j < arr.length; j++) {
// int sum = 0;
// for (int k = i; k <= j; k++) {
// System.out.print(arr[k] + " ");
// sum += arr[k];
// }
// System.out.print("SUM :" + sum);
// System.out.println();
// }
// System.out.println();
// }
// }

// public static void main(String[] args) {
// int arr[] = { 2, 4, 6, 8, 10 };
// subArrays(arr);
// }
// }

// public class Arrays {

// public static void sumOfSumArray(int arr[]) {
// int sum = 0;
// int maxSum = Integer.MIN_VALUE;
// for (int i = 0; i < arr.length; i++) {
// for (int j = 0; j < arr.length; j++) {
// sum = 0;
// for (int k = i; k <= j; k++) {
// sum += arr[k];
// }
// if (maxSum < sum) {
// maxSum = sum;
// }
// }
// }
// System.out.println("MAS sum is " + maxSum);
// }

// public static void kadane(int arr[]) {
// int cs = 0;
// int maxSum = Integer.MIN_VALUE;

// for (int i = 0; i < arr.length; i++) {
// cs += arr[i];
// if (cs < 0) {
// cs = 0;
// }
// if (maxSum < cs) {
// maxSum = cs;
// }
// }

// System.out.println("MAx sum is :" + maxSum);

// }

// public static void minKadane(int arr[]) {
// int cs = 0;
// int minSum = Integer.MAX_VALUE;
// for (int i = 0; i < arr.length; i++) {
// cs += arr[i];
// if (cs < 0) {
// cs = 0;
// }
// if (cs < minSum) {
// minSum = cs;
// }
// }

// System.out.println("MIN SUM IS " + minSum);
// }

// public static void main(String[] args) {
// int array[] = { 1, -2, 6, -1, 3 };
// minKadane(array);
// }
// }

public class Arrays {

    public static void trappedRainWater(int height[]) {
        // left max for each tap
        int leftMax[] = new int[height.length];
        leftMax[0] = height[0];
        for (int i = 1; i < height.length; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i - 1]);
        }

        // Right max
        int rightMax[] = new int[height.length];
        rightMax[height.length - 1] = height[height.length - 1];
        for (int i = height.length - 2; i >= 0; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i + 1]);
        }

        int trappedWater = 0;
        for (int i = 0; i < height.length; i++) {
            int waterLevel = Math.min(rightMax[i], leftMax[i]);
            trappedWater += waterLevel - height[i];
        }

        System.out.println(trappedWater);

    }

    public static void main(String[] args) {
        int height[] = { 4, 2, 0, 6, 3, 2, 5 };
        trappedRainWater(height);
    }
}