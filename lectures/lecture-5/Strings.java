import java.util.*;

public class Strings {

    public static boolean isPalindrome(String str) {
        int n = str.length();
        for (int i = 0; i < n / 2; i++) {
            if (str.charAt(i) != str.charAt(n - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static int getShortestPath(String path) {
        int x = 0, y = 0;
        for (int i = 0; i < path.length(); i++) {
            int dir = path.charAt(i);
            if (dir == 'S') {
                y--;
            } else if (dir == 'N') {
                y++;
            } else if (dir == 'E') {
                x++;
            } else if (dir == 'W') {
                x--;
            }
        }
        int X2 = x * x;
        int Y2 = y * y;
        return (int) Math.sqrt(X2 + Y2);
    }

    public static String subString(String str, int si, int ei) {
        String subStr = "";
        for (int i = si; i < ei; i++) {
            subStr += str.charAt(i);
        }
        return subStr;
    }

    public static String toUpperCase(String str) {
        StringBuilder sb = new StringBuilder("");
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == ' ' && i < str.length() - 1) {
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            } else {
                sb.append(str.charAt(i));
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        // Palindrome
        // String str = "noon";
        // boolean b = isPalindrome(str);
        // System.out.print(b);

        // Shortest path
        // String path = "WNEENESENNN";
        // System.out.println(getShortestPath(path));

        // Substring
        // String str = "ImranKhan";
        // System.out.println(subString(str, 0, 5));

        // Touppercase
        String str = "hi, i am ab";
        System.out.println(toUpperCase(str));
    }
}
