public class Abst {
    public static void main(String[] args) {
        Horse h = new Horse();
        h.eat();
        h.walk();
        System.out.println(h.color);
        System.out.println(h.color);
    }
}

abstract class Animal {

    String color;

    Animal() {
        color = "Brown";
    }

    void eat() {
        System.out.println("Eating right now");
    }

    abstract void walk();
}

class Horse extends Animal {

    void changeColor() {
        color = "Beach";
    }

    void walk() {
        System.out.println("Horse walk on sehra");
    }
}

class Chicken extends Animal {
    void walk() {
        System.out.println("Chicken is walk and walk");
    }
}