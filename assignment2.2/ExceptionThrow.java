// Q6
// WAP to demonstrate application of throw in exception handling.

public class ExceptionThrow {
    public static void main(String[] args) {
        try {
            throw new Exception("Exception thrown");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
