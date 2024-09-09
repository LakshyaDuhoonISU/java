// Q8
// WAP to demonstrate application of try, catch, finally in exception
// handling. Demonstrate the sequence in which these clauses will be
// executed.

public class TryCatchFinally {
    public static void main(String[] args) {
        try {
            throw new Exception("Exception thrown");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Finally block executed");
        }
    }
}
