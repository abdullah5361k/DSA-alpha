public class Que {

    public static String evenOrOdd(int n) {
        int bitMask = 1;
        if ((n & bitMask) == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }

    public static int getIthBit(int n, int i) {
        int bitMask = 1 << i;
        return n & bitMask;
    }

    public static int setIthBit(int n, int i) {
        int bitMask = 1 << i;
        return bitMask | n;
    }

    public static int clearIthBit(int n, int i) {
        int bitMask = ~(1 << i);
        return n & bitMask;
    }

    public static void main(String[] args) {
        System.out.println(setIthBit(4, 0));
    }
}
