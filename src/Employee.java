public class Employee {
    private double salary;

    public void setSalary(double salary) {
        if (salary > 0)
            this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public static void main(String[] args) {
        Employee e = new Employee();
        e.setSalary(30000);
        System.out.println("Salary: " + e.getSalary());
    }
}
