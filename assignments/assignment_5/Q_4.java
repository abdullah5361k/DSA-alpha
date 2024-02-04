public class Q_4 {

    static int count = 0;

    public static void subString(String str, int start, int end) {
        if (start == str.length() && end == str.length()) {
            return;
        }
        if (end == str.length() + 1) {
            subString(str, start + 1, start + 1);
        } else {
            if (end != 0 && str.charAt(start) == str.charAt(end - 1)) {
                count++;
            }
            // System.out.print(str.substring(start, end) + " ");
            subString(str, start, end + 1);
        }

    }

    public static void main(String[] args) {
        System.out.print(subString("aba", 0, 0));
    }
}
