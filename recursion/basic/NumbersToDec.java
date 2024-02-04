package DSA.recursion.basic;

public class NumbersToDec {

    public static void numbers(int n) {
        if (n == 0) {
            return;
        }

        System.out.println(n);
        numbers(n - 1);
    }

    public static void main(String[] args) {
        numbers(5);
    }
}
