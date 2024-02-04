public class Q_2 {

    public static void toEngLetter(int n, String arr[]) {
        if (n == 0) {
            return;
        }
        toEngLetter(n / 10, arr);
        int last = n % 10;
        System.out.print(arr[last] + " ");

    }

    public static void main(String[] args) {
        String arr[] = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten" };
        toEngLetter(2019, arr);
    }
}
