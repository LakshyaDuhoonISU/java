// method overloading

class Sum {
    public void sum(int a,int b) {
        System.out.println(a+b);
    }

    public void sum(int a,int b,int c) {
        System.out.println(a+b+c);
    }

    public void sum(double a,double b) {
        System.out.println(a+b);
    }

    public void sum(int a,double b) {
        System.out.println(a+b);
    }

    public void sum(double a,int b) {
        System.out.println(a+b);
    }
}

public class SumMain {
    public static void main(String[] args) {
        Sum sum1=new Sum();
        Sum sum2=new Sum();
        Sum sum3=new Sum();
        Sum sum4=new Sum();
        Sum sum5=new Sum();
        sum1.sum(1, 2);
        sum2.sum(1, 2, 3);
        sum3.sum(1.5, 2.5);
        sum4.sum(1, 2.5);
        sum5.sum(1.5, 2);
    }
}
