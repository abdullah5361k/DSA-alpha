import java.util.LinkedList;

public class LL {

    public static void main(String[] args) {
        LinkedList<Integer> l = new LinkedList<>();
        l.addFirst(1);
        l.addFirst(2);
        l.addFirst(3);
        System.out.println(l);
        l.removeFirst();
        l.removeLast();
        System.err.println(l);
    }
}
