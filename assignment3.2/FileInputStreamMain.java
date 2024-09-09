// Q2. WAP to demonstrate how to read a file using FileInputStream using different
// read methods (read(), read(byte b[], read(byte b[], int off, int len). Use try, catch
// finally to handle exceptions and close the resources.
import java.io.*;

public class FileInputStreamMain {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("hello.txt")) {
            int content;
            while ((content = fis.read()) != -1) {
                System.out.print((char) content);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("I/O error: " + e.getMessage());
        }
    }
}
