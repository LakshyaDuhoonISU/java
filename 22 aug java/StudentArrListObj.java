import java.util.*;

class Student {
    private int rno;
    private String name, course;

    public Student(int rno, String name, String course) {
        this.rno = rno;
        this.name = name;
        this.course = course;
    }

    public int getRno() {
        return rno;
    }

    public String getName() {
        return name;
    }

    public String getCourse() {
        return course;
    }
}

public class StudentArrListObj {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Rajeev", "Java"));
        students.add(new Student(2, "John", "Python"));
        students.add(new Student(3, "Steve", "C++"));
        students.add(new Student(4, "Raj", "Java"));
        students.add(new Student(5, "Ram", "Javascript"));
        for (Student student : students) {
            System.out.println("Roll No: " + student.getRno() + ", Name: " + student.getName() + ", Course: "
                    + student.getCourse());
        }
    }
}
