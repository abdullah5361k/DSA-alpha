import javax.sound.midi.SysexMessage;

public class DuplicateIndex {

    public static int findUnique(int arr[]) {
        int unique = 0;
        for (int i = 0; i < arr.length; i++) {
            unique = unique ^ arr[i];
            System.out.print(unique + " ");
        }
        System.out.println();
        return unique;

    }

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
        int nums[] = { 1, 2, 1, 3, 2 };
        System.out.println(findUnique(nums));
    }
}
