import java.util.Random;

class MyTask extends Thread {

    public MyTask(String name) {
        super(name);
    }

    public void run() {
        Random random = new Random();
        int time = random.nextInt(501);

        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        System.out.println(getName() + " - Task completed");
    }
}

public class Q5RandomThreads {
    public static void main(String[] args) {

        Thread reader = new MyTask("Reader");
        Thread writer = new MyTask("Writer");
        Thread logger = new MyTask("Logger");

        reader.start();
        writer.start();
        logger.start();
    }
}