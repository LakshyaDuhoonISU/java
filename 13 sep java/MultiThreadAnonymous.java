public class MultiThreadAnonymous {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
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
        });
        Thread t2 = new Thread(new Runnable() {
            public void run() {
                try {
                    for (int i = 0; i < 5; i++) {
                        System.out.println("Hi");
                        Thread.sleep(500);
                    }
                } catch (InterruptedException e) {
                    System.out.println("Class1 thread interrupted");
                }
            }
        });
        Thread t3 = new Thread(new Runnable() {
            public void run() {
                try {
                    for (int i = 0; i < 5; i++) {
                        System.out.println("Bye");
                        Thread.sleep(500);
                    }
                } catch (InterruptedException e) {
                    System.out.println("Class1 thread interrupted");
                }
            }
        });
        t1.start();
        t2.start();
        t3.start();
    }
}
