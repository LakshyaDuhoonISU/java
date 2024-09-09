//Q2

class Rectangle {
    private float length, width;

    Rectangle() {
        length = 1.0f;
        width = 1.0f;
    }

    Rectangle(float length, float width) {
        this.length = length;
        this.width = width;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public double getArea() {
        return length * width;
    }

    public double getPerimeter() {
        return 2 * (length + width);
    }

    public String toString() {
        return "Rectangle[length=" + length + ",width=" + width + "]";
    }
}

public class RectangleMain {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(2.0f, 3.0f);
        System.out.println("Rectangle 1: " + r1 + ", Area = " + r1.getArea() + ", Perimeter = " + r1.getPerimeter());
        System.out.println("Rectangle 2: " + r2 + ", Area = " + r2.getArea() + ", Perimeter = " + r2.getPerimeter());
    }
}
