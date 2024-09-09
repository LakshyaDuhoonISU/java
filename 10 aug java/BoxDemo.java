// Different types of constructors

class Box {
    private double w, h, d;

    Box() {
        w = h = d = 0;
    }

    Box(double w, double h, double d) {
        this.w = w;
        this.h = h;
        this.d = d;
    }

    Box(double a) {
        w = h = d = a;
    }

    Box(Box obj) {
        w = obj.w;
        h = obj.h;
        d = obj.d;
    }

    public double volume() {
        return w * h * d;
    }

    public String toString() {
        return ("Width: " + w + " , Height: " + h + ", Depth: " + d);
    }
}

public class BoxDemo {
    public static void main(String[] args) {
        Box b1 = new Box();
        Box b2 = new Box(10, 5, 15);
        Box b3 = new Box(5);
        Box b4 = new Box(b2);
        Box b5 = b3;
        System.out.println("Volume of b1: " + b1.volume());
        System.out.println("Volume of b2: " + b2.volume());
        System.out.println("Volume of b3: " + b3.volume());
        System.out.println("Volume of b4: " + b4.volume());
        System.out.println("Volume of b5: " + b5.volume());
        System.out.println(b2);
    }
}
