// Q11. WAP to demonstrate the use of BufferedReader and BufferedWriter. Use
// readLine(), new Line(), read(String) methods
import java.io.*;

public class BufferedReaderWriterMain {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("hello.txt"));
            BufferedWriter bw = new BufferedWriter(new FileWriter("hello_copy.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                bw.write(line);
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e);
        }
    }
}
