class Person {
    String name;

    void displayName() {
        System.out.println("Name: " + name);
    }
}

class Employee extends Person {
    int employeeId;

    void displayEmployee() {
        displayName();
        System.out.println("Employee ID: " + employeeId);
    }
}

class Manager extends Employee {
    String department;

    void displayManager() {
        displayEmployee();
        System.out.println("Department: " + department);
    }
}

public class Q8PersonEmployeeManager {
    public static void main(String[] args) {
        Manager m = new Manager();

        m.name = "Sameer";
        m.employeeId = 101;
        m.department = "Computer Science";

        m.displayManager();
    }
}