class Student2 {
    String name;
    int age;

    Student2() {
        name = "Unknown";
        age = 0;
    }

    Student2(String name) {
        this.name = name;
    }

    Student2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println(name + " " + age);
    }
}
public class Demo2 {
    public static void main(String[] args) {
        Student2 s1 = new Student2();
        Student2 s2 = new Student2("purple cat");
        Student2 s3 = new Student2("purple dog", 20);

        s1.display();
        s2.display();
        s3.display();
    }
}
