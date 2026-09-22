class Employee {
    private String name;
    private double salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

class Manager extends Employee {
    private String department;

    public void setDepartment(String department) {
        this.department = department;
    }

    public void displayManager() {
        System.out.println("Name: " + getName());
        System.out.println("Salary: " + getSalary());
        System.out.println("Department: " + department);
    }
}

public class Q6EmployeeManager {
    public static void main(String[] args) {
        Manager m = new Manager();

        m.setName("Sameer");
        m.setSalary(60000);
        m.setDepartment("IT");

        m.displayManager();
    }
}