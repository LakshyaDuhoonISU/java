// Q10

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

class BoxWt extends Box {
    private double wt;

    BoxWt() {
        super();
        wt = 0;
    }

    BoxWt(double w, double h, double d, double wt) {
        super(w, h, d);
        this.wt = wt;
    }

    BoxWt(double a, double wt) {
        super(a);
        this.wt = wt;
    }

    BoxWt(BoxWt obj) {
        super(obj);
        wt = obj.wt;
    }

    public String print_BoxWt() {
        return ("Weight: " + wt);
    }

    public String toString() {
        return (super.toString() + " , " +  print_BoxWt());
    }
}

public class SuperVarMain {
    public static void main(String[] args) {
        Box obj1 = new BoxWt(10, 20, 30, 40);
        Box obj2 = new BoxWt(5, 10);

        System.out.println("Box 1: " + obj1);
        System.out.println("Box 2: " + obj2);
    }
}
