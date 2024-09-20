// Q9 - WAP to demonstrate the working of Thread.sleep() method.

public class SleepEx {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(1000);
                System.out.println(i);
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted");
            }
        }
    }
}
