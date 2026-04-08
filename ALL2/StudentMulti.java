public class StudentMulti {
    int id;
    String name;

    StudentMulti() {
        id = 0;
        name = "Unknown";
    }

    StudentMulti(int id) {
        this.id = id;
        name = "Only ID";
    }

    StudentMulti(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void display() {
        System.out.println(id + " " + name);
    }

    public static void main(String[] args) {
        new StudentMulti().display();
        new StudentMulti(10).display();
        new StudentMulti(20, "purple cat").display();
    }
}
