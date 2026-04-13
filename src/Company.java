class Employee {
    double calculateSalary() {
        return 0;
    }
}

class FullTimeEmployee extends Employee {
    double salary = 50000;

    @Override
    double calculateSalary() {
        return salary;
    }
}

class PartTimeEmployee extends Employee {
    int hours = 5;
    double rate = 500;

    @Override
    double calculateSalary() {
        return hours * rate;
    }
}
public class Company {
    public static void main(String[] args) {
        Employee e;

        e = new FullTimeEmployee();
        System.out.println("Full Time Salary: " + e.calculateSalary());

        e = new PartTimeEmployee();
        System.out.println("Part Time Salary: " + e.calculateSalary());
    }
}
