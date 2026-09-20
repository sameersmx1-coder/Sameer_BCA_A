class EmployeeSalary {
    String name;
    double salary;

    static String organization = "ABC Technologies";

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    static void compareSalary(Employee e1, Employee e2) {
        double salary1 = e1.salary;
        double salary2 = e2.salary;

        System.out.println("Organization: " + organization);

        if (salary1 > salary2)
            System.out.println(e1.name + " has higher salary.");
        else if (salary2 > salary1)
            System.out.println(e2.name + " has higher salary.");
        else
            System.out.println("Both have equal salary.");
    }

    public static void main(String[] args) {
        Employee e1 = new Employee("Sameer", 50000);
        Employee e2 = new Employee("Rahul", 45000);

        compareSalary(e1, e2);
    }
}