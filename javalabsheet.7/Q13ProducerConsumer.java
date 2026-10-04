class Buffer {

    private int value;
    private boolean available = false;

    public synchronized void produce(int value)
            throws InterruptedException {

        while (available) {
            wait();
        }

        this.value = value;
        available = true;

        System.out.println("Produced: " + value);

        notify();
    }

    public synchronized int consume()
            throws InterruptedException {

        while (!available) {
            wait();
        }

        int value = this.value;
        available = false;

        System.out.println("Consumed: " + value);

        notify();

        return value;
    }
}

class Producer extends Thread {

    Buffer buffer;

    Producer(Buffer buffer) {
        this.buffer = buffer;
    }

    public void run() {
        try {
            for (int i = 1; i <= 10; i++) {
                buffer.produce(i);
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

class Consumer extends Thread {

    Buffer buffer;

    Consumer(Buffer buffer) {
        this.buffer = buffer;
    }

    public void run() {
        try {
            for (int i = 1; i <= 10; i++) {
                buffer.consume();
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

public class Q13ProducerConsumer {
    public static void main(String[] args) {

        Buffer buffer = new Buffer();

        Producer p = new Producer(buffer);
        Consumer c = new Consumer(buffer);

        p.start();
        c.start();
    }
}