// Q1. WAP to demonstrate the constructors and methods of File class.
import java.io.*;

public class FileMain {
    public static void main(String[] args) {
        File file = new File("assignment3.2/FileMain.java");
        System.out.println("File Name: " + file.getName());
        System.out.println("File Path: " + file.getPath());
        System.out.println("File Absolute Path: " + file.getAbsolutePath());
        System.out.println("File Parent: " + file.getParent());
        System.out.println("File Exists: " + file.exists());
        System.out.println("File is Directory: " + file.isDirectory());
        System.out.println("File is File: " + file.isFile());
        System.out.println("File is Hidden: " + file.isHidden());
        System.out.println("File Last Modified: " + file.lastModified());
        System.out.println("File Length: " + file.length());
    }
}