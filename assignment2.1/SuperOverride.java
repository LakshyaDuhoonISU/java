//Q14

class Parent {
    String name = "Parent";

    public void display() {
        System.out.println("Display method in Parent class");
    }
}

// Derived class
class Child extends Parent {
    String name = "Child";

    public void display() {
        System.out.println("Display method in Child class");
    }

    public void show() {
        super.display();
        System.out.println("Name from Parent class: " + super.name);
        System.out.println("Name from Child class: " + this.name);
    }
}

public class SuperOverride {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.show();
    }
}
