// Q1

class Circle {
    private double radius;

    Circle() {
        radius = 1.0;
    }

    Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }
}

public class CircleMain {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        Circle c2 = new Circle(2.0);
        System.out.println("Circle 1: Radius = " + c1.getRadius() + ", Area = " + c1.calculateArea()
                + ", Circumference = " + c1.calculateCircumference());
        System.out.println("Circle 2: Radius = " + c2.getRadius() + ", Area = " + c2.calculateArea()
                + ", Circumference = " + c2.calculateCircumference());
    }
}
