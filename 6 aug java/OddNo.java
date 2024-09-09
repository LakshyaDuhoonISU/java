// program to find odd numbers between 1 to 20
public class OddNo {
    public static void main(String[] args) {
        System.out.println("Odd Numbers from 1 to 20:");
        for (int i = 1; i <= 20; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}
