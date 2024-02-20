package DSA.recursion;

public class Tower {

    public static void towerOfHanoi(int n, String src, String helper, String dest) {

        if (n == 1) {
            System.err.println("Transfer " + n + " term from " + src + " to " + dest);
            return;
        }

        towerOfHanoi(n - 1, src, dest, helper);
        System.err.println("Transfer " + n + " term from " + src + " to " + dest);
        towerOfHanoi(n - 1, helper, dest, src);

    }

    public static void main(String[] args) {
        towerOfHanoi(3, "S", "H", "D");
    }
}
