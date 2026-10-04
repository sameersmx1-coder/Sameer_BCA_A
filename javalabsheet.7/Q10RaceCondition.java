class BankAccount {
    int balance = 10000;

    public void withdraw(int amount) {
        if (balance >= amount) {
            int temp = balance;

            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                System.out.println(e);
            }

            balance = temp - amount;
        }
    }
}

class WithdrawThread extends Thread {

    BankAccount account;

    WithdrawThread(BankAccount account) {
        this.account = account;
    }

    public void run() {
        for (int i = 1; i <= 1000; i++) {
            account.withdraw(1);
        }
    }
}

public class Q10RaceCondition {
    public static void main(String[] args) throws InterruptedException {

        BankAccount account = new BankAccount();

        Thread t1 = new WithdrawThread(account);
        Thread t2 = new WithdrawThread(account);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Final Balance: " + account.balance);
    }
}