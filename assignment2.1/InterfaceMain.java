//Q17

interface Figure {
    double PI = Math.PI;

    double area();

    double perimeter();
}

interface Draw {
    void draw_shape(double a, double b);
}

class Circle implements Figure, Draw {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    public double area() {
        return PI * radius * radius;
    }

    public double perimeter() {
        return 2 * PI * radius;
    }

    public void draw_shape(double a, double b) {
        System.out.println("Drawing Circle with radius: " + radius);
    }
}

class Rectangle implements Figure, Draw {
    double length, breadth;

    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public double area() {
        return length * breadth;
    }

    public double perimeter() {
        return 2 * (length + breadth);
    }

    public void draw_shape(double a, double b) {
        System.out.println("Drawing Rectangle with length: " + length + " and breadth: " + breadth);
    }
}

public class InterfaceMain {
    public static void main(String[] args) {
        Circle c = new Circle(5);
        Rectangle r = new Rectangle(5, 10);
        System.out.println("Area of circle: " + c.area());
        System.out.println("Perimeter of circle: " + c.perimeter());
        c.draw_shape(5, 5);
        
        System.out.println();
        System.out.println("Area of rectangle: " + r.area());
        System.out.println("Perimeter of rectangle: " + r.perimeter());
        r.draw_shape(5, 10);
    }
}
