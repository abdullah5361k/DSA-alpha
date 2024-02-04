package DSA.recursion.basic;

public class Fibonacci {

    public static int fibOfN(int n) {
        if (n == 0 || n == 1) {
            return n;
        }

        int f1 = fibOfN(n - 1);
        int f2 = fibOfN(n - 2);
        return f1 + f2;

    }

    public static void main(String[] args) {
        System.out.println(fibOfN(5));
    }
}
