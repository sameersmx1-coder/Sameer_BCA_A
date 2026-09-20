class Employee {
    int empId;
    double salary;

    static String companyName = "Tech Solutions";

    Employee(int empId, double salary) {
        this.empId = empId;
        this.salary = salary;
    }

    void display() {
        int id = empId;
        double employeeSalary = salary;

        System.out.println("Employee ID: " + id);
        System.out.println("Salary: " + employeeSalary);
        System.out.println("Company: " + companyName);
    }

    public static void main(String[] args) {
        Employee e = new Employee(101, 45000);
        e.display();
    }
}