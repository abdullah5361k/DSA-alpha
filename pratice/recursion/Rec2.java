package DSA.pratice.recursion;

public class Rec2 {

    public static void binaryString(int n, String ans, int digit) {
        if (n == 0) {
            System.out.println(ans);
            return;
        }

        binaryString(n - 1, ans + '0', 0);
        if (digit == 0) {
            binaryString(n - 1, ans + '1', 1);
        }
    }

    public static void main(String[] args) {
        binaryString(3, "", 0);
    }
}