// CheckedException

// import java.io.BufferedReader;
// import java.io.FileReader;

// public class CheckedExc_Eg {
//     public static void main(String[] args) {
//         FileReader file = new FileReader("C:\\test\\a.txt");
//         BufferedReader fileInput = new BufferedReader(file);
//         for (int counter = 0; counter < 3; counter++) {
//             System.out.println(fileInput.readLine());
//         }
//     }
// }

import java.io.*;

public class CheckedExc_Eg {
    public static void main(String[] args) throws IOException {
        FileReader file = new FileReader("/Users/lakshyaduhoon/Documents/java/20 aug java/CompareToExample.java");
        BufferedReader fileInput = new BufferedReader(file);
        for (int counter = 0; counter < 3; counter++) {
            System.out.println(fileInput.readLine());
        }
        fileInput.close();
    }
}

