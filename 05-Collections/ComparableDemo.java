import java.util.ArrayList;
import java.util.Collections;

class Student implements Comparable<Student> {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int compareTo(Student other) {
        return Integer.compare(this.id, other.id);
    }

    public String toString() {
        return id + "-" + name;
    }
}

public class ComparableDemo {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(2, "Bob"));
        students.add(new Student(1, "Alice"));
        
        Collections.sort(students);
        System.out.println("Sorted Students by ID: " + students);
    }
}
