// Q8. WAP to demonstrate how to write a text file using FileWriter. Use all the write
// methods and append methods

import java.io.*;

public class FileWriterMain {
    public static void main(String[] args) {
        try (FileWriter fw = new FileWriter("hello.txt")) {
            String content = "Hello, World!";
            fw.write(content);
            fw.append(" again");
        } catch (IOException e) {
            System.out.println("Error writing file: " + e);
        }
    }
}
