class MyThread extends Thread {

    public MyThread(String name, int priority) {
        super(name);
        setPriority(priority);
    }

    public void run() {
        System.out.println(getName() +
                " Priority = " + getPriority());
    }
}

public class Q9FiveThreads {
    public static void main(String[] args) {

        Thread t1 = new MyThread("Thread-1", 1);
        Thread t2 = new MyThread("Thread-2", 3);
        Thread t3 = new MyThread("Thread-3", 5);
        Thread t4 = new MyThread("Thread-4", 7);
        Thread t5 = new MyThread("Thread-5", 10);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}