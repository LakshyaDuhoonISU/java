// abstract class

import java.util.Scanner;

abstract class Figure {
    double dim1, dim2;

    Figure(double a, double b) {
        dim1 = a;
        dim2 = b;
    }

    abstract double area();

    abstract double perimeter();
}

class Rectangle extends Figure {
    Rectangle(double a, double b) {
        super(a, b);
    }

    double area() {
        return dim1 * dim2;
    }

    double perimeter() {
        return 2 * (dim1 + dim2);
    }
}

class Triangle extends Figure {
    Triangle(double a, double b) {
        super(a, b);
    }

    double area() {
        return 0.5 * dim1 * dim2;
    }

    double perimeter() {
        return dim1 + dim2 + Math.sqrt(dim1 * dim1 + dim2 * dim2);
    }
}

public class AbstractAreas {
    public static void main(String[] args) {
        double a, b;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of rectangle: ");
        a = sc.nextDouble();
        System.out.print("Enter breadth of rectangle: ");
        b = sc.nextDouble();
        Figure f;
        f = new Rectangle(a, b);
        System.out.println();
        System.out.println("Area of rectangle: " + f.area());
        System.out.println("Perimeter of rectangle: " + f.perimeter());
        System.out.println();
        System.out.print("Enter base of triangle: ");
        a = sc.nextDouble();
        System.out.print("Enter height of triangle: ");
        b = sc.nextDouble();
        f = new Triangle(a, b);
        System.out.println();
        System.out.println("Area of triangle: " + f.area());
        System.out.println("Perimeter of triangle: " + (float) f.perimeter());
        sc.close();
    }
}
