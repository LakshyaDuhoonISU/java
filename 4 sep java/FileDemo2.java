// create File123.txt on desktop, check properties of file, 
// create another file File456.txt on desktop using createNewFile() method, 
// create directory Dir1 with mkdir(), create Dir2/SubDir1 with mkdirs(), 
// rename File456.txt to File654.txt, create 2 files - File11.txt, File22.txt in Dir2, 
// find files and subdirectories which are available in Dir2, print length of File123.txt

import java.io.*;

public class FileDemo2 {
    public static void main(String[] args) throws IOException {
        File f1 = new File("/Users/lakshyaduhoon/Desktop/File123.txt");
        f1.createNewFile();
        if (f1.exists()) {
            System.out.println("File exists");
            System.out.println("File name: " + f1.getName());
            System.out.println("File path: " + f1.getPath());
            System.out.println("File length: " + f1.length());
            System.out.println("File parent: " + f1.getParent());
            System.out.println("File absolute path: " + f1.getAbsolutePath());
            System.out.println("File is directory: " + f1.isDirectory());
            System.out.println("File is file: " + f1.isFile());
            System.out.println("File last modified: " + f1.lastModified());
        }
        File f2 = new File("/Users/lakshyaduhoon/Desktop/File456.txt");
        f2.createNewFile();
        File dir1 = new File("/Users/lakshyaduhoon/Desktop/Dir1");
        dir1.mkdir();
        File dir2 = new File("/Users/lakshyaduhoon/Desktop/Dir2/SubDir1");
        dir2.mkdirs();
        File f3 = new File("/Users/lakshyaduhoon/Desktop/File456.txt");
        f3.renameTo(new File("/Users/lakshyaduhoon/Desktop/File654.txt"));
        File f4 = new File("/Users/lakshyaduhoon/Desktop/Dir2/File11.txt");
        f4.createNewFile();
        File f5 = new File("/Users/lakshyaduhoon/Desktop/Dir2/File22.txt");
        f5.createNewFile();
        File dir3 = new File("/Users/lakshyaduhoon/Desktop/Dir2");
        File[] files = dir3.listFiles();
        for (File file : files) {
            System.out.println(file.getName());
        }
    }
}
