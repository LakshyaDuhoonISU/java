// WAP to create your own thread by extending Thread class
class NewThread1 extends Thread {
    NewThread1() {
        super("Demo Thread");
    }

    public void run() {
        System.out.println("Child Thread: " + Thread.currentThread());
    }
}

public class Ex2ThreadCreateThruExtends1 {
    public static void main(String[] args) {
        NewThread1 nt = new NewThread1();
        nt.start();
        System.out.println("Main Thread: " + Thread.currentThread());
    }
}
