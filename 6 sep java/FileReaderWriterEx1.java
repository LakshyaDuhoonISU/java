import java.io.*;

public class FileReaderWriterEx1 {
    public static void main(String[] args) {
        try (FileReader fin = new FileReader("/Users/lakshyaduhoon/Documents/java/6 sep java/File1.txt");
                FileWriter fout = new FileWriter("/Users/lakshyaduhoon/Documents/java/6 sep java/FileOut1.txt");) {
            int b;
            while ((b = fin.read()) != -1) {
                fout.write(b);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e);
        } catch (IOException e) {
            System.out.println("Error in File Handling: " + e);
        }
    }
}
