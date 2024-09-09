// Q5
// WAP to demonstrate nested try catch statements.

public class NestedTry {
    public static void main(String[] args) {
        try {
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
        } catch (Exception e) {
            System.out.println("Exception caught");
        }
    }
}
