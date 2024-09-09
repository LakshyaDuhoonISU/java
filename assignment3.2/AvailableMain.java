// Q9. WAP to demonstrate the use of available() method.
import java.io.*;

public class AvailableMain {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("hello.txt")) {
            System.out.println("Total available bytes: " + fis.available());
        } catch (IOException e) {
            System.out.println("Error reading file: " + e);
        }
    }
}
