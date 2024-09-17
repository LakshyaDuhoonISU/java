public class TestDeadlockEx1 {
    public static void main(String[] args) {
        final String food = "Food";
        final String water = "Water";

        Thread t1 = new Thread(() -> {
            synchronized (food) {
                System.out.println("Thread 1: locked resource 1 (food)");
                try {
                    Thread.sleep(100);
                } catch (Exception e) {
                }

                synchronized (water) {
                    System.out.println("Thread 1: locked resource 2 (water)");
                }
            }
        });

        Thread t2 = new Thread(() -> {
            synchronized (water) {
                System.out.println("Thread 2: locked resource 2 (water)");
                try {
                    Thread.sleep(100);
                } catch (Exception e) {
                }

                synchronized (food) {
                    System.out.println("Thread 2: locked resource 1 (food)");
                }
            }
        });

        t1.start();
        t2.start();
    }
}