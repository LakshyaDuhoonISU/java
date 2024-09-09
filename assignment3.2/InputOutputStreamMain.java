// Q6. WAP to copy an image file using the concept of InputStream and OutputStream.
import java.io.*;

public class InputOutputStreamMain {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("input.png");
                FileOutputStream fos = new FileOutputStream("output.png")) {
            int content;
            while ((content = fis.read()) != -1) {
                fos.write(content);
            }
        } catch (IOException e) {
            System.out.println("Error reading input file: " + e);
        }
    }
}
