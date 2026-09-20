class ElectricBill {
    int units;

    static double fixedCharge = 100;

    ElectricBill(int units) {
        this.units = units;
    }

    void calculateBill() {
        double energyCharge;

        if (units <= 100)
            energyCharge = units * 5;
        else if (units <= 200)
            energyCharge = units * 7;
        else
            energyCharge = units * 10;

        double totalBill = energyCharge + fixedCharge;

        System.out.println("Units: " + units);
        System.out.println("Total Bill: Rs. " + totalBill);
    }

    public static void main(String[] args) {
        ElectricBill e = new ElectricBill(150);
        e.calculateBill();
    }
}