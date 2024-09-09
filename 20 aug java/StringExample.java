// Demonstrating string methods

public class StringExample {
    public static void main(String[] args) {
        String s1 = "java";
        char ch[] = { 's', 't', 'r', 'i', 'n', 'g', 's' };
        String s2 = new String(ch);
        String s3 = new String("example");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        System.out.println("Hello".length()); // returns 5
        System.out.println("Hello".charAt(3)); // returns 'l'
        System.out.println("Hello".substring(3)); // returns 'lo'
        System.out.println("Hello".substring(2, 5)); // returns 'llo'
        System.out.println(s1.concat(s3)); // returns 'javaexample'
        System.out.println(s1.indexOf("java")); // returns 0
        System.out.println(s1.indexOf("example")); // returns -1
        System.out.println(s1.indexOf('a', 2)); // returns 3
        System.out.println(s1.equals(s3)); // returns false
        System.out.println(s1.equals("java")); // returns true
        System.out.println(s1.equalsIgnoreCase("JAVA")); // returns true
        System.out.println(s1.compareTo(s3)); // returns 5
        System.out.println(s1.compareToIgnoreCase("JAVA")); // returns 0
        System.out.println(s3.compareTo(s1)); // returns -5
        System.out.println(s1.toUpperCase()); // returns 'JAVA'
        System.out.println("Hello".toLowerCase()); // returns 'hello'
        System.out.println("  Hello  ".trim()); // returns 'Hello'
        System.out.println("fadaf".replace('f', 'r')); // returns 'radar'
        System.out.println("abc".contains("ab")); // returns true
        
        char ch1[] = s3.toCharArray(); // returns an array of characters from the string
        for (int i = 0; i < ch1.length; i++) {
            System.out.print(ch1[i]);
        }
        System.out.println();
        System.out.println("Hello".startsWith("He")); // returns true
        System.out.println("Hello".endsWith("lo")); // returns true
        int value = 30;
        String s4 = String.valueOf(value);
        System.out.println(s4 + 10); // returns 3010

        String s5 = "Welcome to Java world";
        int count = 0;
        for (int i = 0; i < s5.length(); i++) {
            if (s5.charAt(i) == 'o') {
                count++;
            }
        }
        System.out.println("Frequency of o is: " + count);

        // String str = "Hello World";
        // System.out.println(str.length());
        // System.out.println(str.charAt(0));
        // System.out.println(str.substring(0, 5));
        // System.out.println(str.substring(6));
        // System.out.println(str.indexOf("o"));
        // System.out.println(str.lastIndexOf("o"));
        // System.out.println(str.toUpperCase());
        // System.out.println(str.toLowerCase());
        // System.out.println(str.replace("World", "Java"));
        // System.out.println(str.startsWith("Hello"));
        // System.out.println(str.endsWith("World"));
        // System.out.println(str.contains("Hello"));
        // System.out.println(str.equals("Hello World"));
        // System.out.println(str.equalsIgnoreCase("hello world"));
        // System.out.println(str.isEmpty());
    }
}
