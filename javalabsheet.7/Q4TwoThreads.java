class CountThread extends Thread {

    public CountThread(String name) {
        super(name);
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(getName() + " : " + i);
        }
    }
}

public class Q4TwoThreads {
    public static void main(String[] args) {

        CountThread t1 = new CountThread("Thread-1");
        CountThread t2 = new CountThread("Thread-2");

        t1.start();
        t2.start();
    }
}