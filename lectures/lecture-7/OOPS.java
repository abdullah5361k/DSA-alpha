public class OOPS {
    public static void main(String[] args) {
        Student s1 = new Student("Ab");
        s1.rollNo = 123;
        Student s2 = new Student(s1);
        System.out.println(s2.rollNo);

    }
}

class Pen {
    private String color;
    private int tip;

    String getColor() {
        return this.color;
    }

    int getTip() {
        return this.tip;
    }

    void setColor(String color) {
        this.color = color;
    }

    void setTip(int tip) {
        this.tip = tip;
    }

}

class Student {
    String name;
    int rollNo;

    Student(Student s1) {
        this.name = s1.name;
        this.rollNo = s1.rollNo;
    }

    Student(String name) {
        this.name = name;
    }
}
