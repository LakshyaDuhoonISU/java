// Q4. WAP to demonstrate how to read a file using BufferedInputStream.

import java.io.*;


public class BufferedInputStreamMain {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("input.txt");
            BufferedInputStream bis = new BufferedInputStream(fis)) {
            int content;
            while ((content = bis.read()) != -1) {
                System.out.print((char) content);
            }
        } catch (IOException e) {
            System.out.println("Error reading input file: " + e);
        }
    }
}
