class Person {
    String name = "Generic Person";

    void showRole() {
        System.out.println("Role: Person");
    }
}

class Employee extends Person {
    String name = "Employee";

    void displayDetails() {
        System.out.println("Name in Employee: " + name);
        System.out.println("Name in Person: " + super.name);
    }

    void showRole() {
        super.showRole(); // Calling parent method
        System.out.println("Role: Employee");
    }
}

public class SuperKeyword {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.displayDetails();
        emp.showRole();
    }
}
