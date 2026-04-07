public class Employee {
    int id;
    String name;
    double salary;
    
    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("-----------------------");
    }

    public static void main(String[] args) {
        Employee e1 = new Employee(1, "purple cat", 50000);
        e1.display();
        Employee e2 = new Employee(2, "orange cat", 60000);
        e2.display();
        Employee e3 = new Employee(3, "green cat", 70000);
        e3.display();

    }
}
