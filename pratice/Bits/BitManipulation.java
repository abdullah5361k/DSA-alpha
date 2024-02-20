import javax.sound.midi.SysexMessage;

// public class BitManipulation {

// public static int getIthBit(int n, int i) {
// int bitMask = 1 << i;
// return n & bitMask;
// }

// public static int setIthBit(int n, int i) {
// int bitMask = 1 << i;
// return n | bitMask;
// }

// public static int clearIthBit(int n, int i) {
// int bitMask = ~(1 << i);
// return n & bitMask;
// }

// public static int updateIthBit(int n, int i, int bitVal) {
// // if (bitVal == 0) {
// // return clearIthBit(n, i);
// // } else {
// // return setIthBit(n, i);
// // }

// n = clearIthBit(n, i);
// int bitMask = bitVal << i;
// return bitMask | n;

// }

// public static int clearIBits(int n, int i) {
// int bitMask = ~0 << i;
// return n & bitMask;
// }

// public static boolean isPowerOf2(int n) {
// return (n & (n - 1)) == 0;
// }

// public static int setBitsInANumber(int n) {
// int count = 0;
// while (n > 0) {
// int last = n & 1;
// if (last == 1) {
// count++;
// }
// n = n >> 1;
// }
// return count;
// }

// public static int fastExpo(int a, int n) {
// int ans = 1;
// while (n > 0) {
// int last = n & 1;
// if (last == 1) {
// ans = ans * a;
// }
// a = a * a;
// n = n >> 1;
// }
// return ans;
// }

// public static void swap() {
// int a = 5;
// int b = 7;
// a = a ^ b;
// b = a ^ b;
// a = a ^ b;
// System.out.println(a);
// System.out.println(b);
// }

// public static void main(String[] args) {
// // System.out.println(fastExpo(2, 4));
// }
// }

public class BitManipulation {

    public static String evenOrOdd(int n) {
        int bitMask = 1;
        if ((n & bitMask) == 0) {
            return "Even";
        }
        return "odd";
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

    public static int updateIthBit(int n, int i, int newVal) {
        if (newVal == 0) {
            return clearIthBit(n, i);
        }
        return setIthBit(n, i);
    }

    public static int clearIBits(int n, int i) {
        int bitMask = ~0 << i;
        return n & bitMask;
    }

    public static int isPowerOf2(int n) {
        return (n & n - 1);
    }

    public static int setBitsInANumber(int n) {
        int count = 0;
        while (n > 0) {
            int last = n & 1;
            if (last == 1) {
                count++;
            }
            n = n >> 1;
        }
        return count;
    }

    public static int fastExpo(int a, int n) {
        int ans = 1;
        while (n > 0) {
            int last = n & 1;
            if (last == 1) {
                ans = ans * a;
            }
            a = a * a;
            n = n >> 1;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(fastExpo(2, 2));
    }
}