// interface 

interface Bank {
    float getRateOfInterest();
}

class SBI implements Bank {
    public float getRateOfInterest() {
        return 9.15f;
    }
}

class PNB implements Bank {
    public float getRateOfInterest() {
        return 9.7f;
    }
}

public class TestInference2 {
    public static void main(String[] args) {
        Bank b;
        b = new SBI();
        System.out.println("Rate of interest is: " + b.getRateOfInterest() + "%");
        b = new PNB();
        System.out.println("Rate of interest is: " + b.getRateOfInterest() + "%");
    }
}
