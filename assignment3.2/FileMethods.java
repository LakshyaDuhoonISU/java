// Q10. WAP to demonstrate the use of the following methods:
// markSupported()
// mark()
// reset()
// skip()
import java.io.*;

public class FileMethods {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("hello.txt")) {
            System.out.println("markSupported(): " + fis.markSupported());
            System.out.println("Total available bytes: " + fis.available());
            System.out.println("mark() at current position");
            fis.mark(0);
            System.out.println("mark() at current position");
            fis.mark(0);
            System.out.println("mark() at current position");
            fis.mark(0);
            System.out.println("reset() to last mark");
            fis.reset();
            System.out.println("skip(5) bytes");
            fis.skip(5);
        } catch (IOException e) {
            System.out.println("Error reading file: " + e);
        }
    }
}
