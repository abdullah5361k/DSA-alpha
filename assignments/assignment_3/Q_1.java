
public class Q_1 {

    public static int noOfSevens(int arr[][]) {
        int countOf7 = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] == 7) {
                    countOf7++;
                }
            }
        }

        return countOf7;
    }

    public static void main(String[] args) {
        int arr[][] = { { 4, 7, 8 }, { 8, 8, 7 }, { 1, 2, 7 } };
        int s = noOfSevens(arr);
        System.out.println(s);
    }
}
