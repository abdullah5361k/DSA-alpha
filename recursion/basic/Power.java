package DSA.recursion.basic;

/**
 * Power
 */
public class Power {

    public static int power(int x, int n) {
        if (n == 0) {
            return 1;
        }

        return x * power(x, n - 1);

    }

    public static int optimized(int x, int n) {
        if (n == 0) {
            return 1;
        }

        int p1 = optimized(x, n / 2);
        int hs = p1 * p1;
        if (n % 2 != 0) {
            hs = x * hs;
        }
        return hs;

    }

    public static void main(String[] args) {
        System.out.println(optimized(2, 5));
    }

}