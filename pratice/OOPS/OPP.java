// public class OPP {
//     public static void main(String[] args) {
//         Dog d1 = new Dog();
//         System.out.println(d1.legs);
//         d1.eat();
//         d1.breath();
//     }
// }

// class Student {
//     String name;
//     int age;
//     int roll;
//     int marks[];

//     Student() {
//         marks = new int[3];
//     }

//     // Shallow copy
//     // Student(Student s1) {
//     // marks = new int[3];
//     // this.name = s1.name;
//     // this.age = s1.age;
//     // this.marks = s1.marks;
//     // }

//     // Deep copy
//     Student(Student s1) {
//         marks = new int[3];
//         this.name = s1.name;
//         this.age = s1.age;
//         for (int i = 0; i < marks.length; i++) {
//             this.marks[i] = s1.marks[i];
//         }
//     }

// }

// class Person {
//     private String name;
//     private int age;

//     Person() {
//         System.out.println("Constructor");
//     }

//     Person(String name, int age) {
//         this.name = name;
//         this.age = age;
//     }

//     String getName() {
//         return this.name;
//     }

//     int getAge() {
//         return this.age;
//     }

//     void setName(String name) {
//         this.name = name;
//     }

//     void setAge(int age) {
//         this.age = age;
//     }

// }

// class Animal {
//     void eat() {
//         System.out.println("Eat");
//     }

//     void breath() {
//         System.out.println("Breath");
//     }
// }

// class Fish extends Animal {
//     int fin;

//     void swim() {
//         System.out.println("Swim at very hight speed");
//     }
// }

// class Shark extends Fish {
//     int speed;
// }

// class Bird extends Animal {
//     void fly() {
//         System.out.println("Flying at a very high speed");
//     }
// }

// class Peacock extends Bird {
//     String legs;
//     String upLevel;
// }

// class Mammel extends Animal {
//     String color;
//     int age;

//     void Blod() {
//         System.out.println("Blood is woun");
//     }
// }

// class Dog extends Mammel {
//     String name;
//     String type;
// }

// class Cat extends Mammel {
//     String type;

// }

/**
 * * Java point
 */

/**
 * OPP
 */
public class OPP {

    public static void main(String[] args) {
        InnerOPP_1 o = new InnerOPP_1();
        System.out.print(InnerOPP_1.Min);
    }
}

// class Address {
// String city, state, country;

// Address(String city, String state, String country) {
// this.city = city;
// this.country = country;
// this.state = state;
// }

// }

/**
 * * Using aggregaion
 */

// class Employee {
// String name;
// int id;
// Address address;

// Employee(String name, int id, Address address) {
// this.name = name;
// this.id = id;
// this.address = address;
// }

// void display() {
// // System.out.println(this.name + " " + this.id);
// System.out.println(this.address);
// // System.out.println(this.address.city + " " + this.address.country);
// }

// }

/**
 * * Inheritance
 */
// class Employee extends Address {
// String name;
// int id;

// Employee(String name, int id, String city, String state, String country) {
// super(city, state, country);
// this.name = name;
// this.id = id;
// }

// void display() {
// System.out.println(this.id + " " + this.name);
// System.out.println(this.city + " " + this.country);
// }
// }

// class Animal {
// Animal() {
// System.out.println("Animal");
// }
// }

// class Dog extends Animal {
// Dog() {
// System.out.println("Dog");
// }
// }\

/**
 * InnerOPP
 */
interface InnerOPP {
    void print();

    int Min = 5;

    void heap();
}

/**
 * InnerOPP_1
 */
class InnerOPP_1 implements InnerOPP {
    public void print() {
        System.out.print("Print somethis");
    }

    public void heap() {
        System.out.print("Heaped");
    }

}