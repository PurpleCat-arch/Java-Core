class Person {
    String name = "purple cat";
}

class Student extends Person {
    void display() {
        System.out.println("Name: " + name); // inherited
    }
}
public class Main5 {
    public static void main(String[] args) {
        Student s = new Student();
        s.display();
    }
}
