package DSA.pratice.Hash;

import java.util.*;

public class H {

    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("Chennai", "Bengalur");
        map.put("Mumbai", "Delhi");
        map.put("Goa", "Chennai");
        map.put("Delhi", "Goa");

        HashMap<String, String> m = new HashMap<>();

        for (String string : map.keySet()) {
            m.put(map.get(string), string);
        }

        String start = "";
        for (String key : map.keySet()) {
            if (!m.containsKey(key)) {
                start = key;
            }
        }
        System.out.print(start + "  ->");
        for (String string : map.keySet()) {
            System.out.print(map.get(start) + "  ->");
            start = map.get(start);
        }

    }
}
