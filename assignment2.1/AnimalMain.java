//Q19 & Q20

abstract class Animal {
    abstract void sound();
}

class Lion extends Animal {
    void sound() {
        System.out.println("Roar");
    }
}

class Cat extends Animal {
    void sound() {
        System.out.println("Meow");
    }
}

public class AnimalMain {
    public static void main(String[] args) {
        Animal lion = new Lion();
        lion.sound();
        Animal cat = new Cat();
        cat.sound();
    }
}
