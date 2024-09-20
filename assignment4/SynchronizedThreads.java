// Q4
class CounterEx2 {
    int count;

    public synchronized void increment() {
        count++;
    }
}

class Class1WO implements Runnable {
    CounterEx2 c;

    Class1WO(CounterEx2 c) {
        this.c = c;
    }

    public void run() {
        for (int i = 0; i < 1000; i++) {
            c.increment();
        }
    }
}

class Class2WO implements Runnable {
    CounterEx2 c;

    Class2WO(CounterEx2 c) {
        this.c = c;
    }

    public void run() {
        for (int i = 0; i < 1000; i++) {
            c.increment();
        }
    }
}

public class SynchronizedThreads {
    public static void main(String[] args) {
        CounterEx2 c = new CounterEx2();
        Class1WO obj1 = new Class1WO(c);
        Class2WO obj2 = new Class2WO(c);
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }
        System.out.println(c.count);
    }
}
