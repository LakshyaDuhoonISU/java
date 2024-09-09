// abstract class

abstract class Shape3D {
    abstract double volume();

    abstract double surfaceArea();
}

class Sphere extends Shape3D {
    private double radius;

    Sphere(double radius) {
        this.radius = radius;
    }

    public double volume() {
        return 4.0 / 3.0 * Math.PI * Math.pow(radius, 3);
    }

    public double surfaceArea() {
        return 4 * Math.PI * Math.pow(radius, 2);
    }
}

class Cube extends Shape3D {
    private double side;

    Cube(double side) {
        this.side = side;
    }

    public double volume() {
        return Math.pow(side, 3);
    }

    public double surfaceArea() {
        return 6 * Math.pow(side, 2);
    }
}

public class AbstractShape {
    public static void main(String[] args) {
        Shape3D sphere = new Sphere(5);
        System.out.println("Volume of sphere: " + sphere.volume());
        System.out.println("Surface area of sphere: " + sphere.surfaceArea());

        Shape3D cube = new Cube(5);
        System.out.println("Volume of cube: " + cube.volume());
        System.out.println("Surface area of cube: " + cube.surfaceArea());
    }
}
