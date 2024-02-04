package DSA.recursion;

public class BinaryString {

    public static void printString(int n, int lastDigit, String str) {
        if (n == 0) {
            System.out.println(str);
            return;
        }

        printString(n - 1, 0, str.append(0));
        if (lastDigit == 0) {
            printString(n - 1, 1, str.append(1));
        }

    }

    public static void main(String[] args) {
        printString(3, 0, "");
    }
}
