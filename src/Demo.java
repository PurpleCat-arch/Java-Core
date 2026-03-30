class Student {
    int id;
    String name;

    Student(int i, String n) {
        id = i;
        name = n;
    }

    void display() {
        System.out.println("ID: " + id + ", Name: " + name);
    }
}

public class Demo {
    public static void main(String[] args) {
        Student s1 = new Student(101, "purple cat");
        s1.display();
    }
}