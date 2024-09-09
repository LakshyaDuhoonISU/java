// Q3. WAP to demonstrate how to write a file using FileOutputStream using different write methods.

import java.io.*;
public class FileOutputStreamMain {
    public static void main(String[] args) {
        try (FileOutputStream fos = new FileOutputStream("hello.txt");) {
            String content = "Hello, World!";
            fos.write(content.getBytes());
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("I/O error: " + e.getMessage());
        }
    }
}
