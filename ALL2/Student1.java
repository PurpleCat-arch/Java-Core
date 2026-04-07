public class Student1 {
    int id;
    String name;

    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
    }

    public static void main(String[] args) {
        Student1 s = new Student1();
        s.id = 101;
        s.name = "purple cat";
        s.display();
    }
}
