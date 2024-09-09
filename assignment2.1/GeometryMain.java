// Q8

class Geometry {
    public int calculateArea(int s) {
        return s * s;
    }

    public double calculateArea(double r) {
        return r * r * Math.PI;
    }

    public int calculateArea(int l, int b) {
        return l * b;
    }
}

public class GeometryMain {
    public static void main(String[] args) {
        Geometry square = new Geometry();
        Geometry circle = new Geometry();
        Geometry rectangle = new Geometry();
        System.out.println("Area of a square: " + square.calculateArea(5));
        System.out.println("Area of a circle: " + circle.calculateArea(4.4));
        System.out.println("Area of a rectangle: " + rectangle.calculateArea(5, 10));
    }
}
