package DSA.assignments.assignment_7;

public class KnightTour {

    public static int r[] = { -2, -1, 1, 2, 2, 1, -1, -2 };
    public static int c[] = { 1, 2, 2, 1, -1, -2, -2, -1 };

    public static boolean kKnight(int matrix[][], int row, int col, int num) {

        if (num == 64) {
            printMat(matrix);
            return true;
        }

        if (row < 0 || col < 0 || row >= matrix.length || col >= matrix.length) {
            return false;
        }

        if (matrix[row][col] != -1) {
            return false;
        }
        matrix[row][col] = num;

        for (int choice = 0; choice < 8; choice++) {
            int newRow = row + r[choice];
            int newCol = col + c[choice];
            boolean res = kKnight(matrix, newRow, newCol, num + 1);
            if (res == true) {
                return res;
            }
        }

        matrix[row][col] = -1;
        return false;
    }

    public static void printMat(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + "  ");
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
        kKnight(matrix, 0, 0, 0);
    }
}
