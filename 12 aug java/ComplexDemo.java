import java.util.Scanner;

class Complex {
    private double real, imag;

    public Complex() {
        real = imag = 0;
    }

    public Complex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public double getReal() {
        return real;
    }

    public double getImag() {
        return imag;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }

    public String toString() {
        return real + " + " + imag + "i";
    }

    public Complex add(Complex c) {
        return new Complex(real + c.real, imag + c.imag);
    }

    public Complex subtract(Complex c) {
        return new Complex(real - c.real, imag - c.imag);
    }
}

public class ComplexDemo {
    public static void main(String[] args) {
        Complex c1 = new Complex();
        Complex c2 = new Complex(4, 5);
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter real part of c1: ");
        c1.setReal(sc.nextDouble());
        System.out.print("Enter imaginary part of c1: ");
        c1.setImag(sc.nextDouble());
        System.out.println("Real part of c1 = " + c1.getReal());
        System.out.println("Imaginary part of c1 = " + c1.getImag());
        System.out.println(c1);
        System.out.println("c1 = " + c1);
        System.out.println("c2 = " + c2);
        System.out.println("c1 + c2 = " + c1.add(c2));
        System.out.println("c1 - c2 = " + c1.subtract(c2));
        System.out.println(c2);
        sc.close();
    }
}