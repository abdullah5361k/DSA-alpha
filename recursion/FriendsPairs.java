package DSA.recursion;

public class FriendsPairs {

    public static int pairs(int n) {
        if (n == 1 || n == 2) {
            return n;
        }

        // int single = pairs(n - 1);
        // int pair = pairs(n - 2);
        // int pairedUp = pair * (n - 1);
        // return single + pairedUp;

        return pairs(n - 1) + pairs(n - 2) * (n - 1);

    }

    public static void main(String[] args) {
        System.out.println(pairs(4));
    }
}
