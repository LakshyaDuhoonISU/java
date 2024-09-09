public class NestTry {
    public static void main(String[] args) {
        try {
            int a = args.length;
            // if no command-line args, generate a division-by-zero exception
            int b = 42 / a;
            System.out.println("a = " + a);
            try { // nested try block, one command-line args
                if (a == 1) {
                    a = a / (a - a); // division by zero
                }
                if (a == 2) { // two command-line args
                    int c[] = { 1 };
                    c[42] = 99; // generate an out-of-bounds exception
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Array index out-of-bounds: " + e);
            }
        } catch (ArithmeticException e) {
            System.out.println("Divide by 0: " + e);
        }
    }
}
