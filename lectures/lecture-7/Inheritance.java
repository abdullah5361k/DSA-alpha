public class Inheritance {
    public static void main(String[] args) {
        Dog dob = new Dog();

        dob.eat();
        dob.breath();
        dob.legs = 4;
        System.out.println(dob.legs);
    }
}

// Base || Parent class
class Animal {
    String color;

    void eat() {
        System.out.println("Eats");
    }

    void breath() {
        System.out.println("Breaths");
    }
}

class Mammel extends Animal {
    int legs;
}

class Dog extends Mammel {
    String name;
}

// Child || Derived class
// class Fish extends Animal {
// int fins;

// void swim() {
// System.out.print("Swim in water");
// }

// }