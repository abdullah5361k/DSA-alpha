
public class Suduku {

    public static boolean isSafe(int sd[][], int row, int col, int digit) {
        // Column
        for (int i = 0; i <= 8; i++) {
            if (sd[i][col] == digit) {
                return false;
            }
        }

        // Rows
        for (int j = 0; j <= 8; j++) {
            if (sd[row][j] == digit) {
                return false;
            }
        }

        // Grid
        int sr = (row / 3) * 3;
        int sc = (col / 3) * 3;
        for (int i = sr; i < sr + 3; i++) {
            for (int j = sc; j < sc + 3; j++) {
                if (sd[i][j] == digit) {
                    return false;
                }
            }
        }

        return true;

    }

    public static boolean sudokurSolver(int sd[][], int row, int col) {

        if (row == 9) {
            return true;
        }

        int nextRow = row, nextCol = col + 1;
        if (col + 1 == 9) {
            nextRow = row + 1;
            nextCol = 0;
        }

        if (sd[row][col] != 0) {
            return sudokurSolver(sd, nextRow, nextCol);
        }

        for (int digit = 1; digit <= 9; digit++) {
            if (isSafe(sd, row, col, digit)) {
                sd[row][col] = digit;
                if (sudokurSolver(sd, nextRow, nextCol)) {
                    return true;
                }
                ;
                sd[row][col] = 0;
            }
        }

        return false;

    }

    public static void suduku(int sd[][], int row, int col) {
        if (row == 9) {
            return;
        } else if (col == 9) {
            suduku(sd, row + 1, 0);
        } else if (sd[row][col] != 0) {
            suduku(sd, row, col + 1);
        } else {
            for (int i = 1; i <= 9; i++) {
                if (isSafe(sd, row, col, i)) {
                    sd[row][col] = i;
                    suduku(sd, row, col + 1);
                    sd[row][col] = 0;
                }
            }
        }

    }

    public static void main(String[] args) {
        int sd[][] = { { 0, 0, 8, 0, 0, 0, 0, 0, 0 },
                { 4, 9, 0, 1, 5, 7, 0, 0, 2 },
                { 0, 0, 3, 0, 0, 4, 1, 9, 0 },
                { 1, 8, 5, 0, 6, 0, 0, 2, 0 },
                { 0, 0, 0, 0, 2, 0, 0, 6, 0 },
                { 9, 6, 0, 4, 0, 5, 3, 0, 0 },
                { 0, 3, 0, 0, 7, 2, 0, 0, 4 },
                { 0, 4, 9, 0, 3, 0, 0, 5, 7 },
                { 8, 2, 7, 0, 0, 9, 0, 1, 3 }
        };

        int p[][] = { { 5, 3, 0, 0, 7, 0, 0, 0, 0 },
                { 6, 0, 0, 1, 9, 5, 0, 0, 0 },
                { 0, 9, 8, 0, 0, 0, 0, 6, 0 },
                { 8, 0, 0, 0, 6, 0, 0, 0, 3 },
                { 5, 0, 0, 8, 0, 3, 0, 0, 1 },
                { 7, 0, 0, 0, 2, 0, 0, 0, 6 },
                { 0, 6, 0, 0, 7, 0, 2, 8, 0 },
                { 0, 0, 0, 4, 1, 9, 0, 0, 5 },
                { 0, 0, 0, 0, 8, 0, 0, 7, 9 },
        };

        System.out.println(sudokurSolver(sd, 0, 0));

        for (int i = 0; i < sd.length; i++) {
            for (int j = 0; j < sd.length; j++) {
                System.out.print(sd[i][j] + " ");
            }
            System.out.println();
        }
    }
}
