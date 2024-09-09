import java.io.*;

public class BufferedInputOutputStreamEx1 {
    public static void main(String[] args) {
        try (BufferedInputStream fin = new BufferedInputStream(
                new FileInputStream("/Users/lakshyaduhoon/Documents/java/4 sep java/File123.txt"));
                BufferedOutputStream fout = new BufferedOutputStream(
                        new FileOutputStream("/Users/lakshyaduhoon/Documents/java/4 sep java/OutFile1.txt"))) {
            byte buffer[] = new byte[1024];
            int lenRead;
            while ((lenRead = fin.read(buffer)) > 0) {
                fout.write(buffer, 0, lenRead);
                fout.flush();
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found exception");
        } catch (IOException e) {
            System.out.println("Error in file handling");
        }
    }
}
