// Q2

class Thread1 implements Runnable {
    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("Java");
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Class1 thread interrupted");
        }
    }
}

class Thread2 implements Runnable {
    public void run() {
        try {
            for (int i = 0; i < 8; i++) {
                System.out.println("Python");
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Class2 thread interrupted");
        }
    }
}

class Thread3 implements Runnable {
    public void run() {
        try {
            for (int i = 0; i < 7; i++) {
                System.out.println("C++");
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Class3 thread interrupted");
        }
    }
}

public class ImplementRunnable {
    public static void main(String[] args) {
        Thread1 obj1 = new Thread1();
        Thread2 obj2 = new Thread2();
        Thread3 obj3 = new Thread3();
        Thread t1=new Thread(obj1);
        Thread t2=new Thread(obj2);
        Thread t3=new Thread(obj3);
        System.out.println("Begin");
        t1.start();
        t2.start();
        t3.start();
        System.out.println("End");
    }
}
