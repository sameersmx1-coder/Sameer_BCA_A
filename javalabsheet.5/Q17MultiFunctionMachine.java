interface Printer {
    void print();
}

interface Scanner {
    void scan();
}

class MultiFunctionMachine implements Printer, Scanner {
    private String machineName;
    private int machineId;

    public String getMachineName() {
        return machineName;
    }

    public void setMachineName(String machineName) {
        this.machineName = machineName;
    }

    public int getMachineId() {
        return machineId;
    }

    public void setMachineId(int machineId) {
        this.machineId = machineId;
    }

    @Override
    public void print() {
        System.out.println("Machine is printing.");
    }

    @Override
    public void scan() {
        System.out.println("Machine is scanning.");
    }
}

public class Q17MultiFunctionMachine {
    public static void main(String[] args) {
        MultiFunctionMachine machine = new MultiFunctionMachine();

        machine.setMachineName("HP LaserJet");
        machine.setMachineId(101);

        System.out.println("Machine Name: " + machine.getMachineName());
        System.out.println("Machine ID: " + machine.getMachineId());

        machine.print();
        machine.scan();
    }
}