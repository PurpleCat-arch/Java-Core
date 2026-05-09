import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Employee {
    String name;
    Employee(String name) { this.name = name; }
    public String toString() { return name; }
}

public class ComparatorDemo {
    public static void main(String[] args) {
        ArrayList<Employee> emps = new ArrayList<>();
        emps.add(new Employee("Charlie"));
        emps.add(new Employee("Alice"));
        emps.add(new Employee("Bob"));
        
        Collections.sort(emps, new Comparator<Employee>() {
            public int compare(Employee e1, Employee e2) {
                return e1.name.compareTo(e2.name);
            }
        });
        
        System.out.println("Sorted Employees by Name: " + emps);
    }
}
