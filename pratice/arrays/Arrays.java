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

// public class Arrays {

// public static void trappedRainWater(int height[]) {
// // left max for each tap
// int leftMax[] = new int[height.length];
// leftMax[0] = height[0];
// for (int i = 1; i < height.length; i++) {
// leftMax[i] = Math.max(height[i], leftMax[i - 1]);
// }

// // Right max
// int rightMax[] = new int[height.length];
// rightMax[height.length - 1] = height[height.length - 1];
// for (int i = height.length - 2; i >= 0; i--) {
// rightMax[i] = Math.max(height[i], rightMax[i + 1]);
// }

// int trappedWater = 0;
// for (int i = 0; i < height.length; i++) {
// int waterLevel = Math.min(rightMax[i], leftMax[i]);
// trappedWater += waterLevel - height[i];
// }

// System.out.println(trappedWater);

// }

// public static void main(String[] args) {
// int height[] = { 4, 2, 0, 6, 3, 2, 5 };
// trappedRainWater(height);
// }
// }

/**
 * Sub arrays
 */

// public class Arrays {

// public static void subArrays(int arr[]) {
// // int maxSum = 0;
// for (int i = 0; i < arr.length; i++) {
// for (int j = i; j < arr.length; j++) {
// int sum = 0;
// for (int k = i; k <= j; k++) {
// sum += arr[k];
// }
// System.out.print("Sum " + sum + " ");
// // maxSum = Math.max(maxSum, sum);
// }
// System.out.println();
// }

// // System.out.println("MAx sum :" + maxSum);

// }

// public static void prfixSum(int arr[]) {
// int prefix[] = new int[arr.length];
// int sum = 0;
// prefix[0] = arr[0];
// for (int i = 1; i < prefix.length; i++) {
// prefix[i] = prefix[i - 1] + arr[i];
// }

// for (int i = 0; i < arr.length; i++) {
// for (int j = i; j < arr.length; j++) {
// sum = 0;
// sum = i == 0 ? prefix[j] : prefix[j] - prefix[i - 1];
// }

// System.out.print("SUM " + sum + " ");
// }

// }

// public static void main(String[] args) {
// int array[] = { 1, -2, 6, -1, 3 };
// subArrays(array);
// prfixSum(array);
// }
// }

// public class Arrays {
// // Brute
// public static void rotate(int arr[], int k) {
// int n = arr.length;
// k = k % n;
// int temp[] = new int[k];
// for (int i = 0; i < k; i++) {
// temp[i] = arr[i];
// }
// for (int i = k; i < arr.length; i++) {
// arr[i - k] = arr[i];
// }
// for (int i = n - k; i < n; i++) {
// arr[i] = temp[i - (n - k)];
// }
// }

// // Optimal
// public static void reverse(int arr[], int st, int e) {
// int start = st, end = e;
// while (start < end) {
// int temp = arr[start];
// arr[start] = arr[end];
// arr[end] = temp;
// start++;
// end--;
// }
// }

// public static void rotateO(int arr[], int k) {
// int n = arr.length;
// k = k % n;
// reverse(arr, 0, k - 1);
// reverse(arr, k, n - 1);
// reverse(arr, 0, n - 1);
// }

// public static void printArr(int arr[]) {
// for (int i = 0; i < arr.length; i++) {
// System.out.print(arr[i] + " ");
// }
// }

// public static void main(String[] args) {
// int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
// rotateO(arr, 3);
// printArr(arr);
// }
// }

/**
 ** Zeros at end
 */

// public class Arrays {

// public static void zeroAtEnd(int arr[]) {
// int j = -1;
// for (int i = 0; i < arr.length; i++) {
// if (arr[i] == 0) {
// j = i;
// break;
// }
// }

// System.out.println("J " + j);

// if (j == -1)
// return;

// for (int i = j + 1; i < arr.length; i++) {
// if (arr[i] != 0) {
// int temp = arr[i];
// arr[i] = arr[j];
// arr[j] = temp;
// j++;
// }
// }

// }

// public static void printArr(int arr[]) {
// for (int i = 0; i < arr.length; i++) {
// System.out.print(arr[i] + " ");
// }
// }

// public static void main(String[] args) {
// int arr[] = { 1, 2, 0, 0, 2, 3 };
// zeroAtEnd(arr);
// printArr(arr);
// }
// }

/**
 ** Find missing numb
 */

// public class Arrays {

// public static void sort(int arr[]) {
// for (int i = 0; i < arr.length - 1; i++) {
// int min = i;
// for (int j = i; j < arr.length; j++) {
// if (arr[min] > arr[j]) {
// min = j;
// }
// }
// int temp = arr[min];
// arr[min] = arr[i];
// arr[i] = temp;
// }
// }

// public static void uniqueEl(int arr[]) {
// int n = arr.length;
// for (int i = 0; i < n; i++) {
// int cn = 0;

// for (int j = 0; j < n; j++) {
// if (arr[j] == arr[i]) {
// cn++;
// }
// }

// if (cn == 1)
// System.out.print(arr[i]);

// }
// }

// public static void main(String[] args) {
// int arr[] = { 4, 1, 2, 1, 2 };
// uniqueEl(arr);
// }
// }

/*
 * Find longest subarray
 */

// public class Arrays {

// public static void subarray(int arr[]) {
// int sum = 0;
// int count = 0;
// int t = 5;
// int maxSubarray = 0;
// for (int i = 0; i < arr.length; i++) {
// for (int j = i; j < arr.length; j++) {
// sum = 0;
// count = 0;
// for (int k = i; k <= j; k++) {
// count++;
// sum += arr[k];
// }
// if (sum == t) {
// maxSubarray = Math.max(maxSubarray, count);
// }
// }
// }

// System.out.println("Max Subarray " + maxSubarray);
// }

// public static void subarrayOp(int arr[]) {
// int sum = 0;
// int len = 0;
// int t = 5;
// for (int i = 0; i < arr.length; i++) {
// sum = 0;
// int count = 0;
// for (int j = i; j < arr.length; j++) {
// sum += arr[j];
// count++;
// if (sum == t) {
// // len = Math.max(len, j - i + 1);
// len = Math.max(len, count);
// }
// }
// }

// System.out.println("LEN " + len);
// }

// public static void main(String[] args) {
// int arr[] = { 2, 3, 5 };
// subarrayOp(arr);
// }
// }

/**
 * * Longest subarray with +ve and -ve
 */

// public class Arrays {

// public static void longest(int arr[]) {
// int t = 4;
// int len = 0;
// for (int i = 0; i < arr.length; i++) {
// int sum = 0;
// for (int j = i; j < arr.length; j++) {
// sum += arr[j];
// if (sum == t) {
// len = Math.max(len, j - i + 1);
// }
// }
// }

// System.out.println("LEN " + len);
// }

// public static void main(String[] args) {
// int arr[] = { 1, 2, 1, 0, 1 };
// longest(arr);
// }
// }

/**
 * * Largest element
 */
// public class Arrays {

// public static void largestEl(int arr[]) {
// int largest = Integer.MIN_VALUE;
// for (int i = 0; i < arr.length; i++) {
// if (largest < arr[i]) {
// largest = arr[i];
// }
// }

// System.out.println(largest);
// }

// public static void secondLargest(int arr[]) {
// int smallest = Integer.MAX_VALUE;
// int second = Integer.MAX_VALUE;

// for (int i = 0; i < arr.length; i++) {
// if (arr[i] < smallest) {
// second = smallest;
// smallest = arr[i];
// } else if (arr[i] != smallest && arr[i] < second) {
// second = arr[i];
// }
// }

// System.out.print(second);
// }

// public static void main(String[] args) {
// int array[] = { 1 };
// secondLargest(array);
// }
// }

/**
 * * Sorted or not
 */

// public class Arrays {

// public static boolean isSorted(int arr[]) {
// for (int i = 0; i < arr.length - 1; i++) {
// if (arr[i] > arr[i + 1]) {
// return false;
// }
// }

// return true;
// }

// public static void main(String[] args) {
// int arr[] = { 5, 4, 6, 7, 8 };
// boolean sort = isSorted(arr);
// if (sort) {
// System.out.print("Sorted array");
// } else {
// System.out.print("Array is not sorted");
// }
// }
// }

/***
 * * Duplicate
 */

// public class Arrays {

// public static void duplicateEl(int arr[]) {
// int n = arr.length;
// int temp[] = new int[n];
// int j = 0;
// for (int i = 0; i < n - 1; i++) {
// if (arr[i] != arr[i + 1]) {
// temp[j++] = arr[i];
// }
// }

// temp[j++] = arr[n - 1];

// for (int i = 0; i < temp.length; i++) {
// System.out.print(temp[i] + ",");
// }

// System.out.println();

// System.out.println(j);
// }

// public static void main(String[] args) {
// int arr[] = { 1, 1, 2, 2, 2, 3, 3 };
// duplicateEl(arr);
// }
// }

/**
 * * Left Rotate by one
 */

// public class Arrays {

// public static void reverse(int arr[], int st, int en) {
// int start = st, end = en;
// while (start < end) {
// int temp = arr[start];
// arr[start] = arr[end];
// arr[end] = temp;
// start++;
// end--;
// }
// }

// public static void leftRotate(int arr[], int k) {
// reverse(arr, 0, k - 1);
// reverse(arr, k, arr.length - 1);
// reverse(arr, 0, arr.length - 1);
// }

// public static void main(String[] args) {
// int arr[] = { 3, 7, 8, 9, 10, 11 };
// leftRotate(arr, 4);
// for (int i = 0; i < arr.length; i++) {
// System.out.print(arr[i] + " ");
// }
// }
// }

/**
 * * Moves zeroes at the end
 */

// public class Arrays {

// public static void zeroesAtEnd(int arr[]) {
// int n = arr.length;
// int temp[] = new int[n];
// int j = 0;
// for (int i = 0; i < n; i++) {
// if (arr[i] != 0) {
// temp[j] = arr[i];
// j++;
// }
// }

// for (int i = 0; i < n; i++) {
// arr[i] = temp[i];
// }

// }

// public static void zeroes(int arr[]) {
// int n = arr.length;
// int j = -1;
// for (int i = 0; i < arr.length; i++) {
// if (arr[i] == 0) {
// j = i;
// break;
// }
// }

// for (int i = j + 1; i < n; i++) {
// if (arr[i] != 0) {
// int temp = arr[j];
// arr[j] = arr[i];
// arr[i] = temp;
// j++;
// }
// }

// }

// public static void main(String[] args) {
// int arr[] = { 1, 0, 2, 3, 0, 4, 0, 1 };
// zeroes(arr);
// for (int i = 0; i < arr.length; i++) {
// System.out.print(arr[i] + " ");
// }
// }
// }

/**
 * * Find missing numbers
 */

// public class Arrays {

// public static void missingNmb(int arr[], int N) {
// for (int i = 1; i <= N; i++) {
// int check = 0;
// for (int j = 0; j < arr.length; j++) {
// if (arr[j] == i) {
// check = -1;
// break;
// }
// }
// if (check == 0) {
// System.out.print(i);
// }
// }

// int summation = N * (N + 1) / 2;
// int sum = 0;

// for (int i = 0; i < arr.length; i++) {
// sum += arr[i];
// }

// int missingNumber = summation - sum;
// System.out.println(missingNumber);

// }

// public static void main(String[] args) {
// int arr[] = { 1, 2, 3, 4, 5 };
// missingNmb(arr, 6);
// }
// }

/**
 * * Consectuve one
 */

// public class Arrays {

// public static void consectuve(int arr[]) {
// int count = 0;
// int maxCount = 0;
// for (int i = 0; i < arr.length; i++) {
// if (arr[i] == 1) {
// count++;
// } else {
// count = 0;
// }
// maxCount = Math.max(maxCount, count);
// }

// System.out.print(maxCount);
// }

// public static void main(String[] args) {
// int arr[] = { 1, 1, 0, 1, 1, 1 };
// consectuve(arr);
// }
// }

/**
 * * Appears ones
 */

// public class Arrays {

// public static void appearsOnes(int arr[]) {
// for (int i = 0; i < arr.length; i++) {
// int count = 0;
// for (int j = 0; j < arr.length; j++) {
// if (arr[i] == arr[j]) {
// count++;
// }
// }
// if (count == 1) {
// System.out.println(arr[i]);
// }
// }
// }

// public static void main(String[] args) {
// int arr[] = { 2, 2, 1 };
// appearsOnes(arr);
// }
// }

/**
 * * Max consectuive
 */

// public class Arrays {

// public static void maxCon(int arr[]) {
// int n = arr.length;
// int maxCount = 0;
// for (int i = 0; i < n; i++) {
// int count = 0;
// for (int j = 0; j < n; j++) {
// if (arr[i] == arr[j]) {
// count++;
// } else {
// count = 0;
// }
// maxCount = Math.max(maxCount, count);
// }
// }

// System.out.println(maxCount);
// }

// public static void main(String[] args) {
// int arr[] = { 1, 2, 2, 2, 2, 2, 3, 4, 4, 2 };
// maxCon(arr);
// }
// }

/**
 * * Matrices
 */

// public class Arrays {

// public static void spiral(int mat[][]) {
// int startRow = 0;
// int endRow = mat.length - 1;
// int startCol = 0;
// int endCol = mat[0].length - 1;

// while (startRow <= endRow && startCol <= endCol) {
// // Top
// for (int j = startCol; j <= endCol; j++) {
// System.out.print(mat[startRow][j] + " ");
// }
// // Right
// for (int i = startRow + 1; i <= endRow; i++) {
// System.out.print(mat[i][endCol] + " ");
// }
// // Bottom
// for (int j = endCol - 1; j >= startCol; j--) {
// System.out.print(mat[endRow][j] + " ");
// }
// // Left
// for (int i = endRow - 1; i > startRow; i--) {
// System.out.print(mat[i][startCol] + " ");
// }
// startRow++;
// startCol++;
// endRow--;
// endCol--;
// }

// }

// public static void main(String[] args) {
// // int matrix[][] = { { 1, 2, 3, 4 },
// // { 5, 6, 7, 8 },
// // { 9, 10, 11, 12 },
// // { 13, 14, 15, 16 } };
// int matrix[][] = { { 1, 2, 3 },
// { 4, 5, 6 },
// { 7, 8, 9 } };
// spiral(matrix);
// }
// }

/**
 * * Diagonal Sum
 */

// public class Arrays {

// public static void diagonalSum(int mat[][]) {
// int n = mat.length;
// int m = mat[0].length;
// int diagonalSum = 0;
// for (int i = 0; i < n; i++) {
// for (int j = 0; j < m; j++) {
// // PD
// if (j == i) {
// diagonalSum += mat[i][j];
// }
// // SD
// else if (i + j == m - 1) {
// diagonalSum += mat[i][j];
// }
// }
// }

// for (int i = 0; i < n; i++) {
// diagonalSum += mat[i][i];
// diagonalSum += mat[i][n - i - 1];
// }

// System.out.println(diagonalSum);
// }

// public static void main(String[] args) {
// int matrix[][] = { { 1, 2, 3, 4 },
// { 5, 6, 7, 8 },
// { 9, 10, 11, 12 },
// { 13, 14, 15, 16 } };
// diagonalSum(matrix);
// }
// }

/**
 * * Search in Sorted Matrix
 */

// public class Arrays {

// public static void sortedMatrix(int matrix[][], int key) {
// int row = matrix.length - 1, col = 0;
// while (row >= 0 && col <= matrix[0].length - 1) {
// if (key == matrix[row][col]) {
// System.out.print(row + " " + col);
// }
// if (key < matrix[row][col]) {
// row--;
// } else {
// col++;
// }
// }
// }

// public static void main(String[] args) {
// int matrix[][] = { { 10, 20, 30, 40 },
// { 15, 25, 35, 45 },
// { 27, 29, 37, 48 },
// { 32, 33, 39, 50 }
// };

// sortedMatrix(matrix, 50);

// }
// }

/**
 * * Two sum
 */

// public class Arrays {

// public static String twoSum(int arr[], int target) {
// for (int i = 0; i < arr.length; i++) {
// for (int j = i+1; j < arr.length; j++) {
// if (arr[i] + arr[j] == target) {
// return "Yes";
// }
// }
// }
// return "No";
// }

// public static String twoSum(int arr[], int target) {
// int start = arr[0], end = arr.length - 1;
// while (start < end) {
// if (arr[start] + arr[end] == target) {
// return "Yes";
// }
// if (arr[start] + arr[end] < target) {
// start++;
// } else {
// end--;
// }
// }
// return "No";
// }

// public static void main(String[] args) {
// int arr[] = { 2, 5, 6, 8, 11 };
// System.out.println(twoSum(arr, 14));
// }

// }

/**
 * * Sort an array
 */

// public class Arrays {

// public static void sort(int arr[]) {
// int count0 = 0, count1 = 0, count2 = 0;
// for (int i = 0; i < arr.length; i++) {
// if (arr[i] == 0) {
// count0++;
// } else if (arr[i] == 1) {
// count1++;
// } else {
// count2++;
// }
// }

// for (int i = 0; i < count0; i++) {
// arr[i] = 0;
// }

// for (int i = count0; i < count1 + count0; i++) {
// arr[i] = 1;
// }

// for (int i = count1 + count0; i < count0 + count1 + count2; i++) {
// arr[i] = 2;
// }
// }

// public static void printArray(int arr[]) {
// for (int i = 0; i < arr.length; i++) {
// System.out.print(arr[i] + " ");
// }
// }

// public static void main(String[] args) {
// int arr[] = { 2, 0, 2, 1, 1, 0 };
// sort(arr);
// printArray(arr);
// }
// }

/**
 * * Find majority element
 */

// public class Arrays {

// public static int max(int arr[]) {
// int n = arr.length;
// for (int i = 0; i < n; i++) {
// int count = 1;
// for (int j = i + 1; j < arr.length; j++) {
// if (arr[i] == arr[j]) {
// count++;
// }
// }
// if (count > n / 2) {
// return arr[i];
// }
// }
// return -1;
// }

// public static void main(String[] args) {
// int arr[] = { 2, 2, 1, 1, 1, 2, 2 };
// System.out.println(max(arr));
// }
// }

/**
 * * Subarray max sum
 */

// public class Arrays {

// public static int maxSum(int arr[]) {

// int sum = 0;
// int maxSum = Integer.MIN_VALUE;
// int start = 0;
// int ansStart = -1, ansEnd = -1;
// for (int i = 0; i < arr.length; i++) {

// if (sum == 0)
// start = i; // starting index

// sum += arr[i];
// // maxSum = Math.max(maxSum, sum);
// if (sum > maxSum) {
// maxSum = sum;
// ansStart = start;
// ansEnd = i;
// }
// if (sum < 0) {
// sum = 0;
// // s = i + 1;
// }
// }

// System.out.println(ansStart + " " + ansEnd);
// return maxSum;

// }

// public static void main(String[] args) {
// int arr[] = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
// // int arr[] = { -2, -7 };
// System.out.println(maxSum(arr));
// }
// }

/**
 * * Buy and sell
 */

// public class Arrays {

// public static int maxProfit(int arr[]) {
// int buy = arr[0];
// int maxProfit = 0;
// for (int i = 1; i < arr.length; i++) {
// int profit = arr[i] - buy;
// if (profit < 0) {
// buy = arr[i];
// } else {
// maxProfit = Math.max(maxProfit, profit);
// }
// }

// return maxProfit;
// }

// public static void main(String[] args) {
// int arr[] = { 7, 6, 4, 3, 1 };
// System.out.println(maxProfit(arr));
// }
// }

/**
 * * Con +ve and -ve
 */

// public class Arrays {

// public static void rearrange(int arr[]) {
// int temp[] = new int[arr.length];
// int even = 0;
// int odd = 1;
// for (int i = 0; i < arr.length; i++) {
// if (arr[i] > 0) {
// temp[even] = arr[i];
// even += 2;
// } else {
// temp[odd] = arr[i];
// odd += 2;
// }
// }

// for (int i = 0; i < temp.length; i++) {
// System.out.print(temp[i] + " ");
// }
// }

// // public static void printArr(int arr[]) {
// // for (int i = 0; i < arr.length; i++) {
// // System.out.print(arr[i] + " ");
// // }
// // }

// public static void main(String[] args) {
// int arr[] = { 1, 2, -3, -1, -2, 3 };
// rearrange(arr);
// // printArr(arr);
// }
// }

/**
 * * Leader elment in an array
 */

// public class Arrays {

// public static void leaderEl(int arr[]) {
// // for (int i = 0; i < arr.length; i++) {
// // int leader = 0;
// // for (int j = i + 1; j < arr.length; j++) {
// // if (arr[i] < arr[j]) {
// // leader = -1;
// // }
// // }

// // if (leader == 0) {
// // // System.out.print(arr[i] + " ");
// // }
// // }

// int max = Integer.MIN_VALUE;
// for (int i = arr.length - 1; i >= 0; i--) {
// if (arr[i] > max) {
// System.out.println(arr[i]);
// max = arr[i];
// }
// }

// // System.out.println(arr[arr.length - 1]);
// }

// public static void main(String[] args) {
// int arr[] = { 10, 22, 12, 3, 0, 6 };
// leaderEl(arr);
// }
// }

/**
 * * Set matrix zero
 */

// public class Arrays {

// public static void setZero(int mat[][]) {
// for (int i = 0; i < mat.length; i++) {
// for (int j = 0; j < mat[0].length; j++) {
// if (mat[i][j] == 0) {
// // Do column zeros
// for (int k = 0; k < mat.length; k++) {
// if (mat[k][j] != 0) {
// mat[k][j] = -1;
// }
// }
// // make row zero
// for (int l = 0; l < mat[0].length; l++) {
// if (mat[i][l] != 0) {
// mat[i][l] = -1;
// }
// }
// }
// }
// }

// for (int i = 0; i < mat.length; i++) {
// for (int j = 0; j < mat[0].length; j++) {
// if (mat[i][j] == -1) {
// mat[i][j] = 0;
// }
// }
// }

// }

// public static void printMatrix(int mat[][]) {
// for (int i = 0; i < mat.length; i++) {
// for (int j = 0; j < mat[0].length; j++) {
// System.out.print(mat[i][j] + " ");
// }
// }
// }

// public static void main(String args[]) {
// int matrix[][] = { { 1, 1, 1 }, { 1, 0, 1 }, { 1, 1, 1 } };
// setZero(matrix);
// printMatrix(matrix);
// }
// }

/**
 * * Rotate by 90
 */
// public class Arrays {

// public static void rotateBy(int matrix[][]) {
// int n = matrix.length;
// int m = matrix[0].length;
// for (int i = 0; i < n; i++) {
// for (int j = i; j < m; j++) {
// int temp = matrix[i][j];
// matrix[i][j] = matrix[j][i];
// matrix[j][i] = temp;
// }
// }

// for(int i=0; i<n; i++) {
// for(int j=0; j<m/2; j++) {
// int temp = matrix[i][j];
// matrix[i][j] = matrix[i][matrix.length - 1 - j];
// matrix[i][matrix.length - 1 - j] = temp;
// }
// }

// }

// public static void printMatrix(int mat[][]) {
// for (int i = 0; i < mat.length; i++) {
// for (int j = 0; j < mat[0].length; j++) {
// System.out.print(mat[i][j] + " ");
// }
// }
// }

// public static void main(String[] args) {
// int matrix[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
// rotateBy(matrix);
// printMatrix(matrix);
// }
// }

/**
 * * Spiral
 */

// public class Arrays {

// public static void spiral(int matrix[][]) {
// int startRow = 0;
// int endRow = matrix.length - 1;
// int startCol = 0;
// int endCol = matrix[0].length - 1;

// while (startRow <= endRow && startCol <= endCol) {
// // Top
// for (int j = startCol; j <= endCol; j++) {
// System.out.print(matrix[startRow][j] + " ");
// }

// // Right
// for (int i = startRow + 1; i <= endRow; i++) {
// System.out.print(matrix[i][endCol] + " ");
// }

// // Bottom
// for (int j = endCol - 1; j >= startCol; j--) {
// if (startRow == endRow) {
// break;
// }
// System.out.print(matrix[endRow][j] + " ");
// }

// // Left
// for (int i = endRow - 1; i > startRow; i--) {
// if (startCol == endCol) {
// break;
// }
// System.out.print(matrix[i][startCol] + " ");
// }

// startRow++;
// startCol++;
// endRow--;
// endCol--;

// }

// }

// public static void printMatrix(int mat[][]) {
// for (int i = 0; i < mat.length; i++) {
// for (int j = 0; j < mat[0].length; j++) {
// System.out.print(mat[i][j] + " ");
// }
// }
// }

// public static void main(String[] args) {
// // int matrix[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, {
// 13,
// // 14, 15, 16 } };
// int matrix[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };
// spiral(matrix);
// }
// }

/**
 * * Subarray sum equal k
 */

// public class Arrays {

// public static void sub(int arr[], int k) {
// int count = 0;
// for (int i = 0; i < arr.length; i++) {
// int sum = 0;
// for (int j = i; j < arr.length; j++) {
// sum += arr[j];
// if (sum == k) {
// count++;
// }

// System.out.print(sum + " ");
// }
// }
// System.out.println();
// System.out.println(count);
// }

// public static void main(String[] args) {
// int arr[] = { 3, 1, 2, 4 };
// sub(arr, 6);
// }
// }

/**
 * Diagonal sum
 */

// public class Arrays {

// public static void main(String[] args) {
// int mat[][] = { { 1, 2, 3 },
// { 4, 5, 6 },
// { 7, 8, 9 } };
// Solution s = new Solution();
// System.out.println(s.diagonalSum(mat));
// }
// }

// class Solution {
// public int diagonalSum(int[][] mat) {
// int diagonalSum = 0;
// // Primary sum
// int pSum = 0;
// for (int i = 0; i < mat.length; i++) {
// pSum += mat[i][i];
// }
// // Secondary
// int sSum = 0;
// for (int i = 0; i < mat.length; i++) {
// int j = mat.length - 1 - i;
// if (i == j) {
// continue;
// }
// sSum += mat[i][j];
// }
// diagonalSum = pSum + sSum;
// return diagonalSum;
// }
// }

/**
 * * Staircase
 */
// public class Arrays {
// public static void main(String[] args) {
// int mat[][] = { { 10, 20, 30, 40 }, { 15, 25, 35, 45 }, { 27, 29, 37, 48 }, {
// 32, 33, 39, 50 } };
// Solution sl = new Solution();
// System.out.println(sl.sortedKey(mat, 50));
// }
// }

// class Solution {
// public String sortedKey(int mat[][], int key) {
// int n = 0, m = mat[0].length - 1;
// while (n < mat.length && m >= 0) {
// if (mat[n][m] == key) {
// return "Found";
// }
// if (mat[n][m] > key) {
// m--;
// } else {
// n++;
// }
// }
// return "Not Found";
// }
// }

/**
 * * Num of seven
 */

// public class Arrays {

//     static void seven(int mat[][]) {
//         int count = 0;
//         for (int i = 0; i < mat.length; i++) {
//             for (int j = 0; j < mat[0].length; j++) {
//                 if (mat[i][j] == 7) {
//                     count++;
//                 }
//             }
//         }
//         System.out.println(count);
//     }

//     public static void main(String[] args) {
//         int mat[][] = { { 4, 7, 8 }, { 8, 8, 7 } };
//         seven(mat);
//     }
// }

/**
 * * Pritnt sum
 */

// public class Arrays {

//     public static void sum(int mat[][]) {
//         int sum = 0;
//         for (int j = 0; j < mat[0].length; j++) {
//             sum += mat[1][j];
//         }
//         System.out.println(sum);
//     }

//     public static void main(String[] args) {
//         int mat[][] = { { 1, 4, 9 }, { 11, 4, 3 }, { 2, 2, 3 } };
//         sum(mat);
//     }
// }

/**
 * * Transpose of matrix
 */

public class Arrays {

    public static void transpose(int mat[][]) {
        int newMat[][] = new int[mat[0].length][mat.length];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                newMat[j][i] = mat[i][j];
            }
        }

        for (int i = 0; i < newMat.length; i++) {
            for (int j = 0; j < newMat[0].length; j++) {
                System.out.print(newMat[i][j] + " ");
            }
        }
    }

    public static void main(String[] args) {
        int mat[][] = { { 11, 12, 13 }, { 21, 22, 23 } };
        transpose(mat);
    }
}