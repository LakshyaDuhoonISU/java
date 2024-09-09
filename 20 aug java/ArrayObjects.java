// array of objects

import java.util.Scanner;

class Student {
    private int roll;
    private String name;

    Student(int roll, String name) {
        this.roll = roll;
        this.name = name;
    }

    public String toString() {
        return "Roll: " + roll + " Name: " + name;
    }
}

public class ArrayObjects {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of students: ");
        int n = sc.nextInt();
        Student[] students = new Student[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter roll number: ");
            int roll = sc.nextInt();
            System.out.println("Enter name: ");
            String name = sc.next();
            students[i] = new Student(roll, name);
        }
        System.out.println();
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }
        sc.close();
    }
}
