public class Student2 {
    int id;
    String name;

    void display() {
        System.out.println(id + " " + name);
    }

    public static void main(String[] args) {
        Student2 s1 = new Student2();
        Student2 s2 = new Student2();

        s1.id = 1;
        s1.name = "purple cat";

        s2.id = 2;
        s2.name = "purple dog";

        s1.display();
        s2.display();
    }
}
