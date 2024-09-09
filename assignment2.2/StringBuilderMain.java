// Q2
// WAP to demonstrate the functionality of all the methods of
// StringBuilder class.
// 1. append() method for all data types

// 2. insert() method for all data types
// 3. StringBuilder insert​(int offset, char[] str)
// 4. StringBuilder insert​(int index, char[] str, int offset, int len)
// 5. StringBuilder insert​(int dstOffset, CharSequence s)
// 6. StringBuilder insert​(int dstOffset, CharSequence s, int start, int
// end)
// 7. StringBuilder insert​(int offset, Object obj)
// 8. StringBuilder replace(int startIndex, int endIndex, String str)
// 9. StringBuilder delete(int startIndex, int endIndex)
// 10.public StringBuilder reverse()
// 11.public int capacity()
// 12.public void ensureCapacity(int minimumCapacity)
// 13.public char charAt(int index)
// 14.public int length()
// 15.public String substring(int beginIndex)
// 16.public String substring(int beginIndex, int endIndex)
// 17.int compareTo​(StringBuilder another)
// 18.void getChars​(int srcBegin, int srcEnd, char[] dst, int dstBegin)
// 19.StringBuilderdeleteCharAt​(int index)
// 20.int lastIndexOf​(String str)
// 21.int lastIndexOf​(String str, int fromIndex)
// 22.int indexOf​(String str)
// 23.int indexOf​(String str, int fromIndex)
// 24.void setCharAt​(int index, char ch)
// 25.String toString()

public class StringBuilderMain {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello World");

        System.out.println("Append '!!': " + sb.append("!!"));
        System.out.println("Insert '!!' at index 5: " + sb.insert(5, "!!"));
        System.out.println("Insert '!!' at index 5: " + sb.insert(5, "!!".toCharArray()));
        System.out.println("Insert '!!' at index 5: " + sb.insert(5, "!!".toCharArray(), 0, 2));
        System.out.println("Insert '!!' at index 5: " + sb.insert(5, "!!".subSequence(0, 2)));
        System.out.println("Insert '!!' at index 5: " + sb.insert(5, "!!".subSequence(0, 2), 0, 2));
        System.out.println("Insert '!!' at index 5: " + sb.insert(5, new Object()));
        System.out.println("Replace 'o' with '0': " + sb.replace(4, 5, "0"));
        System.out.println("Delete from index 4 to 5: " + sb.delete(4, 5));
        System.out.println("Reverse: " + sb.reverse());
        System.out.println("Capacity: " + sb.capacity());
        sb.ensureCapacity(20);
        System.out.println("Ensure capacity: " + sb.capacity());
        System.out.println("Char at index 5: " + sb.charAt(5));
        System.out.println("Length: " + sb.length());
        System.out.println("Substring from index 6: " + sb.substring(6));
        System.out.println("Substring from index 6 to 8: " + sb.substring(6, 8));
        System.out.println("Compare to 'Hello World': " + sb.compareTo(new StringBuilder("Hello World")));
        char[] destination = new char[5];
        sb.getChars(0, 5, destination, 0);
        System.out.println("Get chars: " + new String(destination));
        System.out.println("Delete char at index 5: " + sb.deleteCharAt(5));
        System.out.println("Last index of 'o': " + sb.lastIndexOf("o"));
        System.out.println("Last index of 'o' from index 5: " + sb.lastIndexOf("o", 5));
        System.out.println("Index of 'llo': " + sb.indexOf("llo"));
        System.out.println("Index of 'llo' from index 5: " + sb.indexOf("llo", 5));
        sb.setCharAt(5, 'o');
        System.out.println("To string: " + sb.toString());
    }
}