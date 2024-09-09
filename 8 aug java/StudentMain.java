// program to define the class Student(roll_no,name,marks) methods-add_info,display

import java.util.Scanner;

class Student {
    private int roll_no;
    String name;
    double marks;

    Student() {
        roll_no = 0;
        name = "";
        marks = 0;
    }

    Student(int r, String n, double m) {
        roll_no = r;
        name = n;
        marks = m;
    }

    public void add_infos() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Student Roll No: ");
        int r = sc.nextInt();
        this.roll_no = r;
        System.out.print("Enter Student Name: ");
        sc.nextLine(); // Consume the newline character
        String n = sc.nextLine();
        this.name = n;
        System.out.print("Enter Student Marks: ");
        double m = sc.nextDouble();
        this.marks = m;
        sc.close();
    }

    public void add_info(int roll_no, String name, double marks) {
        this.roll_no = roll_no;
        this.name = name;
        this.marks = marks;
    }

    public void display() {
        System.out.println("Student Roll No: " + this.roll_no);
        System.out.println("Student Name: " + this.name);
        System.out.println("Student Marks: " + this.marks);
    }

    public void setRoll_no(int roll_no) {
        this.roll_no = roll_no;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    public void getRoll_no() {
        System.out.println("Student Roll No: " + roll_no);
    }

    public void getName() {
        System.out.println("Student Name: " + name);
    }

    public void getMarks() {
        System.out.println("Student Marks: " + marks);
    }
}

class StudentMain {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
        s1.add_info(1, "ABC", 90);
        s3.add_infos();
        System.out.println();
        s1.display();
        System.out.println();
        s2.display(); // empty object so instance variables will have default values of their data types
        System.out.println();
        s3.display();
        System.out.println();
        Student s4= new Student();
        s4.setRoll_no(14);
        s4.setName("XYZ");
        s4.setMarks(57.5);
        s4.getRoll_no();
        s4.getName();
        s4.getMarks();
    }
}