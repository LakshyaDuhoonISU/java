import java.io.*;

public class FileMarkResetSkip {
    public static void main(String[] args) throws IOException {
        try (BufferedReader is=new BufferedReader(new FileReader("/Users/lakshyaduhoon/Documents/java/6 sep java/File1.txt"));) {
            System.out.println((char)is.read());
            System.out.println("If mark supported: "+is.markSupported());
            if (is.markSupported()) {
                is.mark(100);
                System.out.print((char)is.read());
                System.out.print((char)is.read());
                is.reset();
            }
            System.out.print((char)is.read());
            System.out.print((char)is.read());
            System.out.print((char)is.read());
            is.skip(2);
            System.out.print((char)is.read());
            System.out.print((char)is.read());
            System.out.print((char)is.read());
        }
    }
}
