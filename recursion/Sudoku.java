package DSA.recursion;

public class Sudoku {

    public static boolean isSafe(int sd[][], int row, int col, int digit) {
        // Column
        for (int i = 0; i < sd.length; i++) {
            if (sd[i][col] == digit) {
                return false;
            }
        }

        // Row
        for (int j = 0; j < sd.length; j++) {
            if (sd[row][j] == digit) {
                return false;
            }
        }

        // Matrix
        row = (row / 3) * 3;
        col = (col / 3) * 3;
        for (int i = row; i < row + 3; i++) {
            for (int j = col; j < col + 3; j++) {
                if (sd[i][j] == digit) {
                    return false;
                }
            }
        }
        return true;

    }

    public static boolean sudokurSolver(int sd[][], int row, int col) {

        if (row == sd.length) {
            printSdu(sd);
            return true;
        }

        if (col == sd.length) {
            return sudokurSolver(sd, row + 1, 0);
        } else if (sd[row][col] != 0) {
            return sudokurSolver(sd, row, col + 1);
        } else {
            for (int digit = 1; digit <= 9; digit++) {
                if (isSafe(sd, row, col, digit)) {
                    sd[row][col] = digit;
                    if (sudokurSolver(sd, row, col + 1)) {
                        return true;
                    }
                    ;
                    sd[row][col] = 0;
                }
            }
        }
        return false;

    }

    public static void printSdu(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
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

        System.out.println(sudokurSolver(sd, 0, 0));
        // printSdu(sd);
    }
}
