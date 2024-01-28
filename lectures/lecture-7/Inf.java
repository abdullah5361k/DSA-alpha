public class Inf {
    public static void main(String[] args) {

    }
}

interface ChessPlayer {
    void moves();
}

interface Hebivors {
    void eat();
}

interface Carbivors {
    void eat();
}

class Bear implements Hebivors, Carbivors {
    public void eat() {
        System
    }
}

class Queen implements ChessPlayer {
    public void moves() {
        System.out.println("Up and doen wnekldak");
    }
}
