class SimpleInterest {
    double principal, rate, time;

    static String bank = "SBI";

    SimpleInterest(double principal, double rate, double time) {
        this.principal = principal;
        this.rate = rate;
        this.time = time;
    }

    void calculate() {
        double interest = (principal * rate * time) / 100;
        double totalAmount = principal + interest;

        System.out.println("Simple Interest: " + interest);
        System.out.println("Total Amount: " + totalAmount);
        System.out.println("Bank: " + bank);
    }

    public static void main(String[] args) {
        SimpleInterest s = new SimpleInterest(10000, 5, 2);
        s.calculate();
    }
}