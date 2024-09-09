import java.io.*;

public class FileInputOutputStreamEx1 {
    public static void main(String[] args) {
        try (FileInputStream fin = new FileInputStream(
                "/Users/lakshyaduhoon/Documents/java/4 sep java/File123.txt");
                FileOutputStream fout = new FileOutputStream(
                        "/Users/lakshyaduhoon/Documents/java/4 sep java/OutFile1.txt");) {
            int b;
            while ((b = fin.read()) != -1) {
                fout.write(b);
            }
            System.out.println("File copied successfully");
        } catch (FileNotFoundException e) {
            System.out.println("File not found exc");
        } catch (IOException e) {
            System.out.println("IO Error");
        }
    }
}
