package DSA.recursion.basic;

public class SumOfN {

    public static int nNumbers(int n) {
        if (n == 1) {
            return 1;
        }

        return n + nNumbers(n - 1);

    }

    public static void main(String[] args) {
        System.out.println(nNumbers(5));
    }
}
