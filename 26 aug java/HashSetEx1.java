// WAP to demonstrate  different methods of HashSet

import java.util.*;

public class HashSetEx1 {
    public static void main(String[] args) {
        HashSet<String> h = new HashSet<String>();
        // Adding elements into HashSet using add() method
        h.add("BB");
        h.add("AA");
        h.add("DD");
        h.add("CC");
        // Adding duplicate elements
        System.out.println(h.add("BB")); // return false
        System.out.println(h);
        System.out.println("List contains DD or not: " + h.contains("DD"));
        // Removing items from HashSet using remove() method
        h.remove("AA");
        System.out.println("List after removing AA: " + h);
        System.out.println("Iterating over list: ");

        Iterator<String> itr = h.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        System.out.println();

        // Using enhanced for loop to iterate over the HashSet
        System.out.println("Using enhanced for loop: ");
        for (String element : h) {
            System.out.print(element + ", ");
        }
    }
}
