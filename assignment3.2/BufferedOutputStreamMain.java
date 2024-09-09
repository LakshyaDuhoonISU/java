// Q5. WAP to demonstrate how to write a file using BufferedOutputStream.

import java.io.*;
public class BufferedOutputStreamMain {
    public static void main(String[] args) {
        try (FileOutputStream fos = new FileOutputStream("hello.txt");
             BufferedOutputStream bos = new BufferedOutputStream(fos)) {
            String content = "Hello, World again";
            bos.write(content.getBytes());
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("I/O error: " + e.getMessage());
        }
    }
}
