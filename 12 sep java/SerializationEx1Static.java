import java.io.*;

class Student2 implements Serializable {
    int rollno;
    String name;
    static String college="SSS";
    public Student2(int rollno,String name) {
        this.rollno = rollno;
        this.name = name;
    }
    public String toString() {
        return "rollno = " + this.rollno + ", name = " + this.name + ", college = " + college;
    }
}

public class SerializationEx1Static {
    public static void main(String[] args) {
        Student2 s=new Student2(111, "AAA");
        Student2.college="ttt";
        try(ObjectOutputStream os=new ObjectOutputStream(new FileOutputStream("/Users/lakshyaduhoon/Documents/java/12 sep java/SerialStud.ser"));) {
            os.writeObject(s);
        } catch (IOException e) {
            System.out.println("Exception in Serialization: "+e);
        }
        try(ObjectInputStream os=new ObjectInputStream(new FileInputStream("/Users/lakshyaduhoon/Documents/java/12 sep java/SerialStud.ser"));) {
            Student2 s1=(Student2)os.readObject();
            System.out.println(s1);
        } catch (IOException e) {
            System.out.println("Exception in Deserialization: "+e);
        } catch (ClassNotFoundException e) {
            System.out.println("Exception in Deserialization: "+e);
        }
    }
}
