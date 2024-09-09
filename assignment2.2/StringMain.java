// Q1
// WAP to demonstrate the functionality of all the methods of String
// class.
// 1. int length()
// 2. char charAt(int index)
// 3. int indexOf(int ch)
// 4. int indexOf(int ch, int fromIndex)
// 5. int indexOf(String substring)
// 6. int indexOf(String substring, int fromIndex)
// 7. lastIndexOf( )
// 8. String substring(int beginIndex)
// 9. String substring(int beginIndex, int endIndex)
// 10.boolean contains(CharSequence s)
// 11.String concat(String s)
// 12.boolean equals(Object o)
// 13.boolean equalsIgnoreCase(String s)
// 14.boolean isEmpty()
// 15.boolean equals(Object o)
// 16.boolean equalsIgnoreCase(String s)
// 17.String toLowerCase()
// 18.String toUpperCase()
// 19.int compareTo( String anotherString)
// 20.int compareToIgnoreCase( String anotherString)
// 21.String trim()
// 22. String replace (char oldChar, char newChar)
// 23.char[] toCharArray():
// 24. boolean startsWith(String s)
// 25.boolean endswith(String s)
// 26.static String join(CharSequence delim, CharSequence . . . strs)
// 27.byte[] getBytes()
// 28.public void getChars(int srcBeginIndex, int srcEndIndex, char[] destination, int dstBeginIndex)

import java.util.Arrays;

public class StringMain {
    public static void main(String[] args) {
        String str = "Hello World";

        System.out.println("Index of 'World': " + str.indexOf("World"));
        System.out.println("Index of 'World' from index 5: " + str.indexOf("World", 5));
        System.out.println("Last index of 'o': " + str.lastIndexOf('o'));
        System.out.println("Substring from index 6: " + str.substring(6));
        System.out.println("Substring from index 6 to 8: " + str.substring(6, 8));
        System.out.println("Contains 'World': " + str.contains("World"));
        System.out.println("Concat '!!': " + str.concat("!!"));
        System.out.println("Equals 'Hello World': " + str.equals("Hello World"));
        System.out.println("Equals ignore case 'hello world': " + str.equalsIgnoreCase("hello world"));
        System.out.println("Is empty: " + str.isEmpty());
        System.out.println("To lower case: " + str.toLowerCase());
        System.out.println("To upper case: " + str.toUpperCase());
        System.out.println("Compare to 'Hello World': " + str.compareTo("Hello World"));
        System.out.println("Compare to ignore case 'hello world': " + str.compareToIgnoreCase("hello world"));
        System.out.println("Trim: " + str.trim());
        System.out.println("Replace 'o' with '0': " + str.replace('o', '0'));
        System.out.println("To char array: " + Arrays.toString(str.toCharArray()));
        System.out.println("Starts with 'Hello': " + str.startsWith("Hello"));
        System.out.println("Ends with 'World': " + str.endsWith("World"));
        System.out.println("Join '!!': " + String.join("!!", "Hello", "World"));
        System.out.println("Get bytes: " + Arrays.toString(str.getBytes()));
        
        char[] destination = new char[5];
        str.getChars(0, 5, destination, 0);
        System.out.println("Get chars: " + Arrays.toString(destination));
    }
}