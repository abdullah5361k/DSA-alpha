package DSA.pratice.recursion;

public class Rec2 {
    public static int r[] = { 2, 1, -1, -2, -2, -1, 1, 2 };
    public static int c[] = { 1, 2, 2, 1, -1, -2, -2, -1 };

    public static boolean knight(int matrix[][], int row, int col, int num) {
        if (num == 64) {
            printMatrix(matrix);
            return true;
        }

        if (row < 0 || col < 0 || row >= matrix.length || col >= matrix.length) {
            return false;
        }
        if (matrix[row][col] != -1)
            return false;

        matrix[row][col] = num;

        for (int choice = 0; choice < 8; choice++) {
            int newRow = row + r[choice];
            int newCol = col + c[choice];
            boolean res = knight(matrix, newRow, newCol, num + 1);
            if (res == true)
                return true;
        }

        matrix[row][col] = -1;
        return false;

    }

    public static void printMatrix(int mat[][]) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int matrix[][] = new int[8][8];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = -1;
            }
        }
        knight(matrix, 0, 0, 0);
    }
}