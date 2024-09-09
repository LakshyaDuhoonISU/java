import java.io.*;

public class FileInputStreamAvailableEx5 {
    public static void main(String[] args) {
        try (FileInputStream input = new FileInputStream(
                "/Users/lakshyaduhoon/Documents/java/4 sep java/File123.txt");) {
            // Returns the number of available bytes
            System.out.println("Available bytes at the beginning: " + input.available());
            // Reads 3 bytes from the file
            input.read();
            input.read();
            input.read();
            // Returns the number of available bytes
            System.out.println("Available bytes at the end: " + input.available());
        } catch (FileNotFoundException e) {
            System.out.println("File not found exc");
        } catch (IOException e) {
            System.out.println("IO Error");
        }
    }
}
