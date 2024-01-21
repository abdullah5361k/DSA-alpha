import java.util.*;

public class Matrix {

    public static void search(int matrix[][], int key) {
        int maxSum = 0;
        for (int i = 0; i < matrix.length; i++) {
            int sum = 0;
            for (int j = 0; j < matrix[0].length; j++) {
                sum += matrix[i][j];
                // if (matrix[i][j] == key) {
                // System.out.print("Key is found at " + "(" + i + "," + j + ")");
                // }
            }
            maxSum = Math.max(maxSum, sum);
        }

        System.out.println("Max Sum " + maxSum);
    }

    public static void main(String[] args) {
        int matrix[][] = new int[3][3];
        int n = matrix.length, m = matrix[0].length;

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // Output
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j]);
            }

            System.out.println();
        }

        search(matrix, 5);

    }
}
