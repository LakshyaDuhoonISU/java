//Q13

class Animal {
    public void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    public void sound() {
        System.out.println("Dog barks");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        myAnimal.sound(); // Calls the method from Animal class

        Dog myDog = new Dog();
        myDog.sound(); // Calls the overridden method from Dog class
    }
}