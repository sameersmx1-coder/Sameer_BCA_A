class Employee {
    private String name;
    private int employeeId;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public void displayEmployee() {
        System.out.println("Name: " + name);
        System.out.println("Employee ID: " + employeeId);
    }
}

interface Programmer {
    void writeCode();
}

interface Researcher {
    void conductResearch();
}

class Developer extends Employee implements Programmer, Researcher {

    @Override
    public void writeCode() {
        System.out.println("Developer is writing code.");
    }

    @Override
    public void conductResearch() {
        System.out.println("Developer is conducting research.");
    }
}

public class Q19Developer {
    public static void main(String[] args) {
        Developer d = new Developer();

        d.setName("Sameer");
        d.setEmployeeId(101);

        d.displayEmployee();
        d.writeCode();
        d.conductResearch();
    }
}