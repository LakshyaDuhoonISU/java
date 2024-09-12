import java.io.*;

class Dog implements Serializable {
    String breed;
    String name;

    Dog(String breed, String name) {
        this.breed = breed;
        this.name = name;
    }

    public String toString() {
        return "breed = " + this.breed + ", name = " + this.name;
    }
}

public class SerializationEx2 {
    public static void main(String[] args) throws IOException {
        Dog s1 = new Dog("Rottweiler", "ABC");
        try (ObjectOutputStream os = new ObjectOutputStream(
                new FileOutputStream("/Users/lakshyaduhoon/Documents/java/12 sep java/Dog.ser"));) {
            os.writeObject(s1);
        }
        try (ObjectInputStream os = new ObjectInputStream(
                new FileInputStream("/Users/lakshyaduhoon/Documents/java/12 sep java/Dog.ser"));) {
            Dog s = (Dog) os.readObject();
            System.out.println(s);
        } catch (IOException e) {
            System.out.println("Exception in Serialization: " + e);
        } catch (ClassNotFoundException e) {
            System.out.println("Exception in Deserialization: " + e);
        }
    }
}