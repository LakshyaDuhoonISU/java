// Q6
class Q {
    int n;
    boolean isValueSet = false;

    synchronized int consume() {
        while (!isValueSet) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("Wait interrupted");
            }
        }
        System.out.println("Get: " + n);
        System.out.println();
        isValueSet = false;
        notify();
        return n;
    }

    synchronized void produce(int n) {
        while (isValueSet) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("Wait interrupted");
            }
        }
        this.n = n;
        isValueSet = true;
        System.out.println("Put: " + n);
        notify();
    }
}

class Producer implements Runnable {
    Q q;

    Producer(Q q) {
        this.q = q;
    }

    public void run() {
        int i = 0;
        while (true) {
            q.produce(i++);
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted");
            }
        }
    }
}

class Consumer implements Runnable {
    Q q;

    Consumer(Q q) {
        this.q = q;
    }

    public void run() {
        while (true) {
            q.consume();
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted");
            }
        }
    }
}

public class ProducerConsumer {
    public static void main(String[] args) {
        Q q = new Q();
        Producer p = new Producer(q);
        Consumer c = new Consumer(q);
        Thread t1 = new Thread(p);
        Thread t2 = new Thread(c);
        t1.start();
        t2.start();
    }
}
