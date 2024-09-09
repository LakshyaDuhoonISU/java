import java.util.*;

class Student {
    private int rno;
    private String name;
    Student(int rno, String name) {
        this.rno = rno;
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public int getRno() {
        return rno;
    }
}

public class LinkedListObject {
    public static void main(String[] args) {
        LinkedList<Student> students = new LinkedList<Student>();
        students.add(new Student(1, "Alice"));
        students.add(new Student(2, "Bob"));
        students.add(new Student(3, "Charlie"));
        students.add(new Student(4, "David"));
        students.add(new Student(5, "Eve"));
        for (Student student:students) {
            System.out.println("Roll No: "+student.getRno() + ", Name: " + student.getName());
        }
    }
}
