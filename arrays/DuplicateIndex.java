
public class DuplicateIndex {

    public static boolean indexs(int num[]) {
        for (int i = 0; i < num.length; i++) {
            for (int j = i + 1; j < num.length; j++) {
                if (num[i] == num[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int nums[] = { 1, 2, 1, 3, 2, 1 };
        System.out.println(indexs(nums));
    }
}
