import java.util.*;
import java.util.Arrays;

/**
 * * String isPlaindrome or not
 */
// public class Strings {

// public static boolean isPalindrome(String str) {
// for (int i = 0; i < str.length() / 2; i++) {
// if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
// return false;
// }
// }
// return true;
// }

// public static void main(String[] args) {
// String str = "racecarsss";
// System.out.println(isPalindrome(str));
// }
// }

/**
 * * Find shortest distacne (displacement)
 */

// public class Strings {

// public static int getShortestDistance(String str) {
// int x = 0, y = 0;
// for (int i = 0; i < str.length(); i++) {
// // West
// if (str.charAt(i) == 'W') {
// x--;
// }
// // East
// else if (str.charAt(i) == 'E') {
// x++;
// }
// // North
// else if (str.charAt(i) == 'N') {
// y++;
// }
// // South
// else {
// y--;
// }
// }

// int X2 = x * x;
// int Y2 = y * y;

// return (int) Math.sqrt(X2 + Y2);

// }

// public static void main(String[] args) {
// // String path = "WNEENESENNN";
// System.out.println(getShortestDistance(path));
// }
// }

/**
 * * First letter to uppercase
 */
// public class Strings {

// public static String toUppercase(String str) {
// StringBuilder sb = new StringBuilder("");
// char ch = Character.toUpperCase(str.charAt(0));
// sb.append(ch);
// for (int i = 1; i < str.length(); i++) {
// if (str.charAt(i) == ' ' && i < str.length() - 1) {
// sb.append(str.charAt(i));
// i++;
// sb.append(Character.toUpperCase(str.charAt(i)));
// } else {
// sb.append(str.charAt(i));
// }
// }

// return sb.toString();

// }

// public static void main(String[] args) {
// String str = "hi, i am ab ";
// System.out.println(toUppercase(str));
// }
// }

/**
 * * String Compression
 */

// public class Strings {

// public static String compressed(String str) {
// StringBuilder sb = new StringBuilder("");

// for (int i = 0; i < str.length(); i++) {
// Integer count = 1;
// while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
// count++;
// i++;
// }
// sb.append(str.charAt(i));
// if (count > 1)
// sb.append(count.toString());
// }

// return sb.toString();
// }

// public static void main(String[] args) {
// String str = "aaabbcccdd";
// // String str = "abc";
// System.out.println(compressed(str));
// }

// }

/**
 * * Lower case vowels
 */

// public class Strings {

// public static int lowerCaseVowels(String str) {
// int count = 0;
// for (int i = 0; i < str.length(); i++) {
// if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' ||
// str.charAt(i) == 'o'
// || str.charAt(i) == 'u') {
// count++;
// }
// }
// return count;
// }

// public static void main(String[] args) {
// String str = "Abcdiou";
// Scanner sc = new Scanner(System.in);
// String s = sc.nextLine();
// System.out.println(lowerCaseVowels(s));
// }
// }

/**
 * * Output
 */

// public class Strings {

// public static void main(String[] args) {
// // String str = "ShradhaDidi";
// // String str1 = "ApnaCollege";
// // String str2 = "ShradhaDidi";
// // System.out.println(str.equals(str1) + " " + str.equals(str2));

// String str = "ApnaCollege".replace("l", "");
// System.out.println(str);
// }
// }

/**
 * * Anagrams
 */

// public class Strings {

// // O(n^2)
// public static boolean isAnagram(String str1, String str2) {
// for (int i = 0; i < str1.length(); i++) {
// int check = 0;
// for (int j = 0; j < str2.length(); j++) {
// if (str1.charAt(i) == str2.charAt(j)) {
// check = 1;
// }
// }
// if (check == 0) {
// return false;
// }
// }

// return true;
// }

// public static void main(String[] args) {
// String str1 = "debit card";
// String str2 = "bad credit";
// System.out.println(isAnagram(str1, str2));
// }
// }

/**
 * * String
 */

// public class Strings {

// public static String isPalindrome(String str) {
// for (int i = 0; i < str.length() / 2; i++) {
// if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
// return "false";
// }
// }
// return "true";
// }

// public static void main(String[] args) {
// String str = "noon";
// System.out.println(isPalindrome(str));
// }
// }

/**
 * * Find shortest path
 */

// public class Strings {

// public static int displacement(String str) {
// int x = 0;
// int y = 0;
// for (int i = 0; i < str.length(); i++) {
// if (str.charAt(i) == 'N') {
// y++;
// }
// if (str.charAt(i) == 'S') {
// y--;
// }
// if (str.charAt(i) == 'E') {
// x++;
// }
// if (str.charAt(i) == 'W') {
// x--;
// }
// }
// int X2 = x * x;
// int Y2 = y * y;
// return (int) Math.sqrt(X2 + Y2);
// }

// public static void main(String[] args) {
// String str1 = "Abdullah";
// String str2 = "Abdullah";
// String str3 = new String("Abdullaha");
// // System.out.println(str1.equals(str2));
// System.out.println(str1.compareTo(str3));
// }
// }

/**
 * * Largest string
 */

// public class Strings {

// public static void main(String[] args) {
// String str[] = { "apple", "mango", "banana" };
// String largest = str[0];
// for (int i = 1; i < str.length; i++) {
// if (largest.compareTo(str[i]) < 0) {
// largest = str[i];
// }
// }
// System.out.println(largest);
// }
// }\

/**
 * * First letter to uppercase
 */

// public class Strings {

// public static String toUpper(String str) {
// StringBuilder sb = new StringBuilder("");
// char ch = Character.toUpperCase(str.charAt(0));
// sb.append(ch);
// for (int i = 1; i < str.length(); i++) {
// if (str.charAt(i) == ' ' && i < str.length() - 1) {
// sb.append(str.charAt(i));
// i++;
// sb.append(Character.toUpperCase(str.charAt(i)));
// } else {
// sb.append(str.charAt(i));
// }
// }
// return sb.toString();
// }

// public static void main(String[] args) {
// String str = "hi, i am ab";
// System.out.println(toUpper(str));
// }
// }

/**
 * * String compression
 */

// public class Strings {

// public static String compress(String str) {
// StringBuilder sb = new StringBuilder("");
// for (int i = 0; i < str.length(); i++) {
// Integer count = 1;

// while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
// count++;
// i++;
// }
// sb.append(str.charAt(i));
// if (count > 1) {
// sb.append(count.toString());
// }
// }
// return sb.toString();
// }

// public static void main(String[] args) {
// String str = "abc";
// System.out.println(compress(str));
// }
// }

/**
 * * Anagram or not
 */

// public class Strings {

// public static void isAnagram(String str1, String str2) {
// int temp[] = new int[26];
// for (int i = 0; i < str1.length(); i++) {
// char ch = str1.charAt(i);
// temp[ch - 'a']++;
// }

// for (int i = 0; i < str2.length(); i++) {
// char ch = str2.charAt(i);
// temp[ch - 'a']--;
// }

// for (int i = 0; i < temp.length; i++) {
// System.out.print(temp[i] + " ");
// }
// }

// public static void main(String[] args) {
// String str1 = "anagram";
// String str2 = "nagarma";
// isAnagram(str1, str2);
// }
// }

public class Strings {

    public static void main(String[] args) {
        String s = "abcde";
        String goal = "cdeab";
        StringBuilder sb = new StringBuilder(goal);
        sb.append(goal);
        System.out.print(sb.indessxOf(s));
    }
}