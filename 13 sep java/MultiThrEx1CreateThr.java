// WAP to create 3 threads in your program
// 1. Thread1: Print "hello" 5 times
// 2. Thread2: Print "hi" 5 times
// 3. Thread3: Print "bye" 5 times
// Print "begin" and "end" in main thread

class Class1Ex1 extends Thread {
    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("Hello");
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Class1 thread interrupted");
        }
    }
}

class Class2Ex1 extends Thread {
    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("Hi");
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Class2 thread interrupted");
        }
    }
}

class Class3Ex1 extends Thread {
    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("Bye");
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Class3 thread interrupted");
        }
    }
}

public class MultiThrEx1CreateThr {
    public static void main(String[] args) {
        Class1Ex1 t1 = new Class1Ex1();
        Class2Ex1 t2 = new Class2Ex1();
        Class3Ex1 t3 = new Class3Ex1();
        System.out.println("Begin");
        t1.start();
        t2.start();
        t3.start();
        System.out.println("End");
    }
}