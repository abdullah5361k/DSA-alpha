public class Q_2 {

    public static int sum(int matrix[][]) {
        int sumOfRow = 0;
        for (int j = 0; j < matrix.length; j++) {
            sumOfRow += matrix[1][j];
        }

        return sumOfRow;
    }

    public static void main(String[] args) {
        int matrix[][] = { { 1, 4, 9 }, { 11, 4, 3 }, { 2, 2, 3 } };
        int su = sum(matrix);
        System.out.println(su);
    }
}
