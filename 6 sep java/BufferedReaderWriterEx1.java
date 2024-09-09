import java.io.*;

public class BufferedReaderWriterEx1 {
    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(
                new FileReader("/Users/lakshyaduhoon/Documents/java/6 sep java/File1.txt"));
                BufferedWriter writer = new BufferedWriter(
                        new FileWriter("/Users/lakshyaduhoon/Documents/java/6 sep java/FileOut1.txt"));) {
            String s;
            while ((s = reader.readLine()) != null) {
                writer.write(s);
                writer.newLine();
                writer.flush();
            }
        }
    }
}
