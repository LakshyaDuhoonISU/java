//Q16

import java.util.Scanner;

class Figure {
    double dim1, dim2;

    Figure(double a, double b) {
        dim1 = a;
        dim2 = b;
    }

    double area() {
        return 0;
    }
}

class Rectangle extends Figure {
    Rectangle(double a, double b) {
        super(a, b);
    }

    double area() {
        return dim1 * dim2;
    }
}

class Triangle extends Figure {
    Triangle(double a, double b) {
        super(a, b);
    }

    double area() {
        return 0.5 * dim1 * dim2;
    }
}

public class FigureMain {
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
        System.out.println();

        System.out.print("Enter base of triangle: ");
        a = sc.nextDouble();
        System.out.print("Enter height of triangle: ");
        b = sc.nextDouble();
        f = new Triangle(a, b);
        System.out.println();
        System.out.println("Area of triangle: " + f.area());
        sc.close();
    }
}
