class MyThread extends Thread {

    public MyThread(String name) {
        super(name);
    }

    public void run() {
        System.out.println(getName() + " is running");
    }
}

public class Q8Priority {
    public static void main(String[] args) {

        MyThread high = new MyThread("High Priority");
        MyThread low = new MyThread("Low Priority");

        high.setPriority(Thread.MAX_PRIORITY);
        low.setPriority(Thread.MIN_PRIORITY);

        System.out.println(high.getName() + " Priority: " + high.getPriority());
        System.out.println(low.getName() + " Priority: " + low.getPriority());

        high.start();
        low.start();
    }
}