class BankAccount {
    double balance;

    static String bankCode = "SBI001";

    BankAccount(double balance) {
        this.balance = balance;
    }

    void withdraw(double amount) {
        double withdrawal = amount;

        if (withdrawal <= balance) {
            balance = balance - withdrawal;
            System.out.println("Withdrawal Successful");
            System.out.println("Remaining Balance: " + balance);
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    public static void main(String[] args) {
        BankAccount b = new BankAccount(10000);
        b.withdraw(3000);
    }
}