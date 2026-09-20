class BankAccount {
    String accountNumber;
    double balance;

    static String bankName = "State Bank";

    BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void deposit(double amount) {
        double depositAmount = amount;
        balance = balance + depositAmount;

        System.out.println("Deposited: " + depositAmount);
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args) {
        BankAccount b = new BankAccount("123456", 10000);
        b.deposit(2500);
    }
}