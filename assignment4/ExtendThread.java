// Q1

class Thread1 extends Thread {
    public void run() {
        try {
            for (int i = 0; i < 6; i++) {
                System.out.println("Lakshya");
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Class1 thread interrupted");
        }
    }
}

class Thread2 extends Thread {
    public void run() {
        try {
            for (int i = 0; i < 7; i++) {
                System.out.println("Duhoon");
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Class2 thread interrupted");
        }
    }
}

public class ExtendThread {
    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();
        System.out.println("Begin");
        t1.start();
        t2.start();
        System.out.println("End");
    }
}
