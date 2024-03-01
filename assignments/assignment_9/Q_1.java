package DSA.assignments.assignment_9;

public class Q_1 {

    public static void generateBinary(int n) {
        for (int i = 1; i <= n; i++) {
            int bin = 0;
            int pow = 0;
            int x = i;
            while (x > 0) {
                int rem = x % 2;
                bin = bin + (rem * (int) Math.pow(10, pow));
                x /= 2;
                pow++;
            }
            System.out.print(bin + " ");
        }
    }

    public static void main(String[] args) {
        generateBinary(5);
    }
}
