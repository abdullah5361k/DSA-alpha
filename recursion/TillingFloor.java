package DSA.recursion;

public class TillingFloor {

    public static int tiles(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }

        int horizontally = tiles(n - 2);
        int vertically = tiles(n - 1);
        return horizontally + vertically;

    }

    public static void main(String[] args) {
        System.out.println(tiles(4));
    }
}
