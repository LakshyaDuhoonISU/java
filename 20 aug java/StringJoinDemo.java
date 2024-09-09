public class StringJoinDemo {
    public static void main(String[] args) {
        String joinString1 = String.join(" ", "Alpha", "Beta", "Gamma");
        System.out.println(joinString1); // returns 'Alpha Beta Gamma'

        String date = String.join(", ", "John", "ID#: 569", "E-mail: John@HerbSchildt.com");
        System.out.println(date); // returns 'John, ID#: 569, E-mail: John@HerbSchildt.com'
    }
}
