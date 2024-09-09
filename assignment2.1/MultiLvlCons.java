//Q12

class A {
    A() {
        System.out.println("Constructor of A"); // This will be invoked first as it is the superclass
    }
}

class B extends A {
    B() {
        System.out.println("Constructor of B"); // This will be invoked second
    }
}

class C extends B {
    C() {
        System.out.println("Constructor of C"); // This will be invoked last
    }
}

public class MultiLvlCons {
    public static void main(String[] args) {
        C obj = new C();
    }
}
