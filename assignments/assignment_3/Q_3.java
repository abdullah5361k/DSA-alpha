
public class Q_3 {

    public static void transposeOfMatrix(int matrix[][]) {
        int row = 2, column = 3;
        int transpose[][] = new int[column][row];

        printMatrix(matrix);

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }

        System.out.println();

        printMatrix(transpose);

    }

    public static void printMatrix(int mat[][]) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                System.out.print(mat[i][j] + " ");
            }
        }
    }

    public static void main(String[] args) {
        int matrix[][] = { { 11, 12, 13 }, { 21, 22, 23 } };
        transposeOfMatrix(matrix);
    }
}
