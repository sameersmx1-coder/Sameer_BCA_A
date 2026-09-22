class Employee {
    String employeeName;
    int employeeId;

    void displayEmployee() {
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Employee ID: " + employeeId);
    }
}

class Developer extends Employee {
    String programmingLanguage;

    void writeCode() {
        System.out.println("Developer is writing " + programmingLanguage + " code.");
    }
}

class Manager extends Employee {
    String department;

    void conductMeeting() {
        System.out.println("Manager is conducting a meeting in " + department + ".");
    }
}

public class Q12EmployeeDeveloperManager {
    public static void main(String[] args) {
        Developer d = new Developer();
        d.employeeName = "Sameer";
        d.employeeId = 101;
        d.programmingLanguage = "Java";

        Manager m = new Manager();
        m.employeeName = "Rahul";
        m.employeeId = 102;
        m.department = "IT";

        d.displayEmployee();
        d.writeCode();

        System.out.println();

        m.displayEmployee();
        m.conductMeeting();
    }
}