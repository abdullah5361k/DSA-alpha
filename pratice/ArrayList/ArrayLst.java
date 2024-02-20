package DSA.pratice.ArrayList;

import java.util.*;

public class ArrayLst {

    public static boolean monotonic(ArrayList<Integer> list) {
        boolean inc = true;
        boolean dec = true;
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i) > list.get(i + 1)) {
                inc = false;
            }

            if (list.get(i) < list.get(i + 1)) {
                dec = false;
            }

        }

        return inc || dec;
    }

    public static ArrayList<Integer> lonely(ArrayList<Integer> list) {
        ArrayList<Integer> newList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            int check = 1;
            int n = 0;
            for (int j = 0; j < list.size(); j++) {
                if (list.get(i) == list.get(j)) {
                    n++;
                }
                if (list.get(i) - 1 == list.get(j) || list.get(i) + 1 == list.get(j)) {
                    check = -1;
                }
            }
            if (check == 1 && n == 1)
                newList.add(list.get(i));
        }

        return newList;
    }

    public static ArrayList<Integer> lonelyOp(ArrayList<Integer> list) {
        Collections.sort(list);
        ArrayList<Integer> newList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (i == 0) {
                if (list.get(i) != list.get(i + 1) && list.get(i) + 1 != list.get(i + 1)) {
                    newList.add(list.get(i));
                }
            } else if (i == list.size() - 1) {
                if (list.get(i) != list.get(i - 1) && list.get(i) - 1 != list.get(i - 1)) {
                    newList.add(list.get(i));
                }
            } else if (list.get(i) != list.get(i + 1) && list.get(i) != list.get(i - 1)
                    && list.get(i) + 1 != list.get(i + 1)
                    && list.get(i) - 1 != list.get(i - 1)) {
                newList.add(list.get(i));
            }
        }

        return newList;
    }

    public static void permutations(String n, String ans) {
        if (n.length() == 0) {
            System.out.println(ans);
            return;
        }
        for (int i = 0; i < n.length(); i++) {
            char c = n.charAt(i);
            String newStr = n.substring(0, i) + n.substring(i + 1);
            permutations(newStr, ans + c);
        }
    }

    public static void frequentN(ArrayList<Integer> list, int key) {
        int target = 0;
        int count = 0;
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i) == key) {
                if (target == list.get(i + 1)) {
                    count++;
                } else {
                    target = list.get(i + 1);
                    count = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(6);
        list.add(5);
        list.add(8);
        permutations("123", "");
    }
}
