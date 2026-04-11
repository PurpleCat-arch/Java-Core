class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Student extends Person {
    int marks;

    Student(String name, int age, int marks) {
        super(name, age); // calling parent constructor
        this.marks = marks;
    }

    void display() {
        System.out.println(name + " " + age + " " + marks);
    }
}

public class Main11 {
    public static void main(String[] args) {
        Student s = new Student("purple cat", 20, 85);
        s.display();
    }
}
