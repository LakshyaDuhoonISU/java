//Q15

class Animal {
    boolean vegetarian;
    String food;
    int numOfLegs;

    Animal() {
        vegetarian = true;
        food = "plants";
        numOfLegs = 4;
    }

    Animal(boolean vegetarian, String food, int numOfLegs) {
        this.vegetarian = vegetarian;
        this.food = food;
        this.numOfLegs = numOfLegs;
    }

    public void setVegetarian(boolean vegetarian) {
        this.vegetarian = vegetarian;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public void setNumOfLegs(int numOfLegs) {
        this.numOfLegs = numOfLegs;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public String getFood() {
        return food;
    }

    public int getNumOfLegs() {
        return numOfLegs;
    }

    public String toString() {
        return ("Vegetarian: " + vegetarian + "\nFood: " + food + "\nNumber of legs: " + numOfLegs);
    }
}

class Cat extends Animal {
    String color;

    Cat() {
        super();
        color = "white";
    }

    Cat(boolean vegetarian, String food, int numOfLegs, String color) {
        super(vegetarian, food, numOfLegs);
        this.color = color;
    }

    public String toString() {
        return (super.toString() + "\nColor: " + color);
    }
}

class Cow extends Animal {
    String breed;

    Cow() {
        super();
        breed = "Jersey";
    }

    Cow(boolean vegetarian, String food, int numOfLegs, String breed) {
        super(vegetarian, food, numOfLegs);
        this.breed = breed;
    }

    public String toString() {
        return (super.toString() + "\nBreed: " + breed);
    }
}

public class AnimalInherit {
    public static void main(String[] args) {
        Cat c1 = new Cat();
        Cow cow1 = new Cow();
        System.out.println("\n" + c1 + "\n");
        System.out.println(cow1 + "\n");

        Cat c2 = new Cat(false, "meat", 4, "black");
        Cow cow2 = new Cow(false, "meat", 4, "brown swiss");
        System.out.println(c2.toString() + "\n");
        System.out.println(cow2.toString() + "\n");
        
        Cat c3 = new Cat();
        Cow cow3 = new Cow();
        c3.setVegetarian(true);
        c3.setFood("milk");
        c3.setNumOfLegs(5);
        c3.isVegetarian();
        c3.getFood();
        c3.getNumOfLegs();
        cow3.setVegetarian(true);
        cow3.setFood("cheese");
        cow3.setNumOfLegs(6);
        cow3.isVegetarian();
        cow3.getFood();
        cow3.getNumOfLegs();
        System.out.println(c3.toString() + "\n");
        System.out.println(cow3.toString() + "\n");
    }
}
