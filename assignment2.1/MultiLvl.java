//Q11

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

class BoxColour extends BoxWt {
    private String colour;
    BoxColour(String colour) {
        super();
        this.colour = colour;
    }
    BoxColour(String colour, double w, double h, double d, double wt) {
        super(w, h, d, wt);
        this.colour = colour;
    }
    BoxColour(String colour, double a, double wt) {
        super(a, wt);
        this.colour = colour;
    }
    BoxColour(String colour, BoxColour obj) {
        super(obj);
        this.colour = colour;
    }
    public String toString() {
        return (super.toString() + " , Colour: " + colour);
    }
}

public class MultiLvl {
    public static void main(String[] args) {
        BoxColour box1 = new BoxColour("Red", 10, 20, 30, 40);
        BoxColour box2 = new BoxColour("Blue", 10, 20, 30, 40);
        BoxColour box3 = new BoxColour("Green", 10, 20, 30, 40);
        BoxColour box4 = new BoxColour("Yellow", 10, 20, 30, 40);
        BoxColour box5 = new BoxColour("Orange", 10, 20, 30, 40);
        System.out.println(box1);
        System.out.println(box2);
        System.out.println(box3);
        System.out.println(box4);
        System.out.println(box5);
    }
}
