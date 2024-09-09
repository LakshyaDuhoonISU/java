//Q21

abstract class Shape {
    abstract double calculateArea();

    abstract double calculateCircumference();
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    double calculateArea() {
        return Math.PI * radius * radius;
    }

    double calculateCircumference() {
        return 2 * Math.PI * radius;
    }
}

class Semicircle extends Shape {
    double radius;

    Semicircle(double radius) {
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    double calculateArea() {
        return 0.5 * Math.PI * radius * radius;
    }

    double calculateCircumference() {
        return Math.PI * radius + 2 * radius;
    }
}

public class ShapeMain {
    public static void main(String[] args) {
        Circle c = new Circle(5);
        System.out.println("Area of Circle: " + c.calculateArea());
        System.out.println("Circumference of Circle: " + c.calculateCircumference() + "\n");

        Semicircle s = new Semicircle(5);
        System.out.println("Area of Semicircle: " + s.calculateArea());
        System.out.println("Circumference of Semicircle: " + s.calculateCircumference());
    }
}
