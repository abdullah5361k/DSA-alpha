public class Q_3 {

    public static int lengthOfString(String str, int i) {
        if (i == str.length()) {
            return i;
        }

        return lengthOfString(str, i + 1);

    }

    public static void main(String[] args) {
        System.out.println(lengthOfString("", 0));
    }
}
