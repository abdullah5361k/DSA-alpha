import java.util.*;

public class Set {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>();

        hs.add("Lahore");
        hs.add("Sheikhupura");
        hs.add("Sukhekie");
        hs.add("Faislabad");
        hs.add("Lahore");

        Iterator it = hs.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }

    }
}
