import java.io.*;

class Address implements Serializable {
    String flatNo, society;

    Address(String f, String s) {
        flatNo = f;
        society = s;
    }

    public String toString() {
        return "Flat No: " + flatNo + ", Society: " + society;
    }
}

class Person implements Serializable {
    int id;
    String name;

    Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() {
        return "Id: " + id + ", Name: " + name;
    }
}

class Student extends Person {
    int rollno;
    String course;
    Address addr;

    Student(int id, String name, int rollno, String course, Address ad) {
        super(id, name);
        this.rollno = rollno;
        this.course = course;
        addr = ad;
    }

    public String toString() {
        System.out.println(super.toString());
        return "RollNo: " + rollno + ", Course: " + course + ", Address: " + addr;
    }
}

public class SerializationEx1Aggregation {
    public static void main(String[] args) {
        Student s1 = new Student(1, "ABC", 101, "Java", new Address("101", "Society1"));
        System.out.println(s1);

        try (ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("student.ser"));) {
            os.writeObject(s1);
        } catch (IOException e) {
            System.out.println("Exception in serialization " + e);
        }

        try (ObjectInputStream is = new ObjectInputStream(new FileInputStream("student.ser"));) {
            Student s2 = (Student) is.readObject();
            System.out.println(s2);
        } catch (IOException e) {
            System.out.println("Exception in deserialization " + e);
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found exception " + e);
        }
    }
}
