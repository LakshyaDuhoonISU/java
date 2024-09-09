// Q7. WAP to demonstrate how to read a text file using FileReader.
import java.io.*;

public class FileReaderMain {
    public static void main(String[] args) {
        try (FileReader fr = new FileReader("hello.txt")) {
            int content;
            while ((content = fr.read()) != -1) {
                System.out.print((char) content);
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e);
        }
    }
}
