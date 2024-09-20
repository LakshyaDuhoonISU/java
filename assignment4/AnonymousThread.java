// Q3

class Thread2 extends Thread {
    public void run() {
        try {
            for (int i = 0; i < 6; i++) {
                System.out.println(Thread.currentThread().getName());
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Class2 thread interrupted");
        }
    }
}

public class AnonymousThread {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            public void run() {
                try {
                    for (int i = 0; i < 5; i++) {
                        System.out.println(Thread.currentThread().getName());
                        Thread.sleep(500);
                    }
                } catch (InterruptedException e) {
                    System.out.println("Class1 thread interrupted");
                }
            }
        });
        Thread t2 = new Thread();
        t1.start();
        t2.start();
    }
}
