// Q12. WAP to demonstrate the serialization and deserialization of objects. Also
// demonstrate transient, static data member for Cat class. Cat class has instance
// variable: String color, String breed, int age, String country.

import java.io.*;

class Cat implements Serializable {
    String color;
    String breed;
    int age;
    String country;
    static String owner;
    transient String address;
    Cat() {
        color = "Black";
        breed = "Persian";
        age = 2;
        country = "India";
        owner = "ABC";
        address = "Mumbai";
    }
}

public class CatSerialize {
    public static void main(String[] args) {
        Cat cat = new Cat();
        try (FileOutputStream fos = new FileOutputStream("cat.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(cat);
        } catch (IOException e) {
            System.out.println("Error serializing cat: " + e);
        }
        try (FileInputStream fis = new FileInputStream("cat.ser");
            ObjectInputStream ois = new ObjectInputStream(fis)) {
            Cat deserializedCat = (Cat) ois.readObject();
            System.out.println("Deserialized Cat:");
            System.out.println("Color: " + deserializedCat.color);
            System.out.println("Breed: " + deserializedCat.breed);
            System.out.println("Age: " + deserializedCat.age);
            System.out.println("Country: " + deserializedCat.country);
            System.out.println("Owner: " + Cat.owner);
            System.out.println("Address: " + deserializedCat.address);
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error deserializing cat: " + e);
        }
    }
}
