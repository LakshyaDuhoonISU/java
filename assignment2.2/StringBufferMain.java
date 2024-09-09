// Q3
// WAP to demonstrate the functionality of the following methods of
// StringBuffer class.
// 1. intcapacity()
// 2. char charAt(int index)]
// 3. StringBuffer delete(int start, int end)
// 4. StringBuffer deleteCharAt(int index)
// 5. void getChars(int srcBegin, int srcEnd, char[] dst, int dstBegin)
// 6. int indexOf(String str)
// 7. int indexOf(String str, int fromIndex)
// 8. int lastIndexOf(String str)
// 9. int lastIndexOf(String str, int fromIndex)
// 10.int length()
// 11.StringBuffer replace(int start, int end, String str)
// 12.StringBuffer reverse()
// 13.void setCharAt(int index, char ch)
// 14.StringBuffer replace(int start, int end, String str)
// 15.StringBuffer reverse()
// 16.void setCharAt(int index, char ch)
// 17.String substring(int start)
// 18.String substring(int start, int end)
// 19.String toString()

public class StringBufferMain {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello World");

        System.out.println("Capacity: " + sb.capacity());
        System.out.println("Char at index 5: " + sb.charAt(5));
        System.out.println("Delete from index 4 to 5: " + sb.delete(4, 5));
        System.out.println("Delete char at index 5: " + sb.deleteCharAt(5));
        char[] destination = new char[5];
        sb.getChars(0, 5, destination, 0);
        System.out.println("Get chars: " + new String(destination));
        System.out.println("Index of 'llo': " + sb.indexOf("llo"));
        System.out.println("Index of 'llo' from index 5: " + sb.indexOf("llo", 5));
        System.out.println("Last index of 'o': " + sb.lastIndexOf("o"));
        System.out.println("Last index of 'o' from index 5: " + sb.lastIndexOf("o", 5));
        System.out.println("Length: " + sb.length());
        System.out.println("Replace from index 4 to 5 with '0': " + sb.replace(4, 5, "0"));
        System.out.println("Reverse: " + sb.reverse());
        sb.setCharAt(5, 'o');
        System.out.println("Set char at index 5 to 'o': " + sb);
        System.out.println("Substring from index 6: " + sb.substring(6));
        System.out.println("Substring from index 6 to 8: " + sb.substring(6, 8));
        System.out.println("To string: " + sb.toString());
    }
}
