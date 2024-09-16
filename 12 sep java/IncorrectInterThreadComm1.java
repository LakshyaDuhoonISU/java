class Q {
    int n;

    synchronized int get() {
        System.out.println("Got: " + n);
        System.out.println();
        return n;
    }

    synchronized void put(int n) {
        this.n = n;
        System.out.println("Put :" + n);
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
            q.put(i++);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
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
            q.get();
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
            }
        }
    }
}

public class IncorrectInterThreadComm1 {
    public static void main(String[] args) {
        Q q = new Q();
        Producer p = new Producer(q);
        Consumer c = new Consumer(q);
        Thread t1 = new Thread(p, "Producer");
        Thread t2 = new Thread(c, "Consumer");
        t1.start();
        t2.start();
        System.out.println("Press ctrl-c to stop");
    }
}