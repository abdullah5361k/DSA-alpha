package DSA.assignments.assignment_6;

public class RatInMaze {

    public static int mazePaths(int n, int row, int col, boolean arr[][], String ans) {
        if (row == n - 1 && col == n - 1) {
            System.out.println(ans);
            return 1;
        } else if (row < 0 || col < 0 || row == n || col == n || arr[row][col] == true) {
            return 0;
        }
        arr[row][col] = true;
        int D = mazePaths(n, row + 1, col, arr, ans + "D"); // Down
        int r = mazePaths(n, row, col + 1, arr, ans + "R"); // Right
        int l = mazePaths(n, row, col - 1, arr, ans + "L"); // Left
        int u = mazePaths(n, row - 1, col, arr, ans + "U"); // Up
        arr[row][col] = false;
        return D + l + u + r;
    }

    public static int mazePaths(int maz[][], int row, int col, String ans) {
        if (row == maz.length - 1 && col == maz.length - 1) {
            System.out.println(ans);
            return 1;
        } else if (row < 0 || col < 0 || row == maz.length || col == maz.length || maz[row][col] == 0
                || maz[row][col] == -1) {
            return 0;
        }

        maz[row][col] = -1;
        int right = mazePaths(maz, row, col + 1, ans + "R");
        int left = mazePaths(maz, row, col - 1, ans + "L");
        int down = mazePaths(maz, row + 1, col, ans + "D");
        int up = mazePaths(maz, row - 1, col, ans + "U");
        maz[row][col] = 1;
        return right + left + down + up;

    }

    public static void main(String[] args) {
        int maze[][] = { { 1, 0, 0, 0 }, { 1, 1, 0, 1 }, { 0, 1, 0, 0 }, { 1, 1, 1, 1 } };
        System.out.println(mazePaths(maze, 0, 0, ""));
    }
}
