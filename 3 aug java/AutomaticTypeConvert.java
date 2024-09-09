public class AutomaticTypeConvert {
    public static void main(String args[]) {
        int i = 100;
        long l = i;
        float f = l;
        System.out.println("Int value: " + i);
        System.out.println("Long value: " + l);
        System.out.println("Float value: " + f);
    }
}