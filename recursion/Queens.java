package DSA.recursion;

public class Queens {

    public static boolean isSafe(char chess[][], int row, int col) {
        // Column
        for (int i = row - 1; i >= 0; i--) {
            if (chess[i][col] == 'Q') {
                return false;
            }
        }

        // Left diagonal
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (chess[i][j] == 'Q') {
                return false;
            }
        }

        // Right diagonal
        for (int i = row - 1, j = col + 1; i >= 0 && j < chess.length; i--, j++) {
            if (chess[i][j] == 'Q') {
                return false;
            }
        }

        return true;

    }

    public static void nQueens(char chess[][], int row) {
        if (row == chess.length) {
            printA(chess);
            return;
        }
        for (int j = 0; j < chess.length; j++) {
            if (isSafe(chess, row, j)) {
                chess[row][j] = 'Q';
                nQueens(chess, row + 1);
                chess[row][j] = '.';
            }
        }
    }

    public static void printA(char chess[][]) {
        System.out.println("_________Queens___________");
        for (int i = 0; i < chess.length; i++) {
            for (int j = 0; j < chess.length; j++) {
                System.out.print(chess[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        char ch[][] = new char[4][4];
        for (int i = 0; i < ch.length; i++) {
            for (int j = 0; j < ch.length; j++) {
                ch[i][j] = '.';
            }
        }
        nQueens(ch, 0);
    }
}
