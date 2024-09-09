public class StringBuilderEx1 {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("Hello World");
        System.out.println(sb1);
        StringBuilder reverseSb = sb1.reverse();
        System.out.println("Reverse String = " + reverseSb);
        System.out.println("Modified StringBuilder = " + sb1); // the original string is also modified

        StringBuilder sb2 = new StringBuilder();
        System.out.println("Capacity of StringBuilder = " + sb2.capacity()); // by default, capacity is 16

        sb2.append("Hello");
        sb2.append(" ");
        sb2.append("World!");
        System.out.println(sb2.toString());

        sb2.insert(6,"beautiful "); // beautiful is inserted at index 6
        System.out.println(sb2.toString());

        StringBuilder sb3 = new StringBuilder("Hello");
        sb3.replace(1, 3, "Java"); // replaces characters from index 1 to 2(3-1) with Java
        System.out.println("After replace() String = "+sb3.toString());

        StringBuilder sb4 = new StringBuilder("Hello");
        sb4.delete(1,3);
        System.out.println(sb4); // deletes characters from index 1 to 2(3-1)

        StringBuilder sb5 = new StringBuilder();
        System.out.println(sb5.capacity()); // 16
        sb5.append("Hello");
        System.out.println(sb5.capacity()); // still 16 (as no.of characters appended is less than the capacity)

        sb5.append("Java is my favourite language");
        System.out.println(sb5.capacity()); // now 34 (16*2)+2 i.e. (oldcapacity*2)+2 as no.of characters is more than the original capacity of 16

        sb5.ensureCapacity(10); // no change
        System.out.println(sb5.capacity()); // 34
        sb5.ensureCapacity(50); // (34*2)+2 = 70 (as min capacity of 50 is less than the current capacity 34)
        System.out.println(sb5.capacity()); // 70

        StringBuilder sb6 = new StringBuilder("Hello");
        System.out.println(sb6.charAt(1)); // returns 'e'
        System.out.println(sb6.length());
        System.out.println(sb6.substring(1,5)); // returns 'ello'
        System.out.println(sb6.substring(1)); // returns 'ello'
    }
}
