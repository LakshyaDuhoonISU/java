// Q4
// WAP to demonstrate the how to handle
// ArrayIndexOutOfBoundException, StringIndexOutOfBoundException in a
// program using multiple catch clause.

public class IndexException {
    public static void main(String[] args) {
        try {
            int[] arr = new int[5];
            System.out.println(arr[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bounds");
        }

        try {
            String str = "Hello";
            System.out.println(str.charAt(5));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("String index out of bounds");
        }
    }
}
