import java.io.*;

class Student implements Serializable {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() {
        return "rollno = " + this.id + ", name = " + this.name;
    }
}

public class SerializationEx1 {
    public static void main(String[] args) throws IOException {
        Student s1 = new Student(111, "AAA");
        try (ObjectOutputStream os = new ObjectOutputStream(
                new FileOutputStream("/Users/lakshyaduhoon/Documents/java/6 sep java/SerialStud.ser"));) {
            os.writeObject(s1);
        }
        try (ObjectInputStream os = new ObjectInputStream(
                new FileInputStream("/Users/lakshyaduhoon/Documents/java/6 sep java/SerialStud.ser"));) {
            Student s = (Student) os.readObject();
            System.out.println(s);
        } catch (IOException e) {
            System.out.println("Exception in Serialization: " + e);
        } catch (ClassNotFoundException e) {
            System.out.println("Exception in Deserialization: " + e);
        }
    }
}
