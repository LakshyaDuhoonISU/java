class Rectangle {
    private int length, breadth;

    Rectangle() {
        length = breadth = 0;
    }

    Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public int area() {
        return length * breadth;
    }

    public int perimeter() {
        return 2 * (length + breadth);
    }

    public String toString() {
        return "Length = " + length + ", Breadth = " + breadth;
    }
}

public class RectangleDemo {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(4, 5);
        System.out.println("Rectangle 1: " + r1);
        System.out.println("Rectanlge 2: " + r2);
        System.out.println("Area of r1 = " + r1.area());
        System.out.println("Perimeter of r1 = " + r1.perimeter());
        System.out.println("Area of r2 = " + r2.area());
        System.out.println("Perimeter of r2 = " + r2.perimeter());
    }
}
