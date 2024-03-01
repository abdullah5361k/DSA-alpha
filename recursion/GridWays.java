package DSA.recursion;

public class GridWays {

    public static int gridsCounts(int n, int row, int col, String ans) {
        if (row == n - 1 && col == n - 1) {
            System.out.println(ans);
            return 1;
        } else if (row == n || col == n) {
            return 0;
        }
        int w1 = gridsCounts(n, row, col + 1, ans + "R");
        int w2 = gridsCounts(n, row + 1, col, ans + "D");
        return w1 + w2;
    }

    public static void main(String[] args) {
        System.out.println(gridsCounts(3, 0, 0, ""));
    }
}
