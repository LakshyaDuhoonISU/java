import java.util.*;

public class SortedSetEx1 {
    public static void main(String[] args) {
        SortedSet<String> set = new TreeSet<>();
        set.add("PP");
        set.add("DD");
        set.add("ZZ");
        set.add("AA");
        set.add("XX");
        set.add("CC");
        set.add("BB");
        System.out.println(set);
        System.out.println("The first element is given as: " + set.first());
        System.out.println("The last element is given as: " + set.last());
        // Returns a view of the portion of the given set whose elements are strictly
        // less than the toElement.
        System.out.println(set.headSet("DD"));
        // Returns a view of the portion of the given set whose elements are greater
        // than or equal to the parameter fromElement.
        System.out.println(set.tailSet("BB"));
        // Returns a view of the portion of the given set whose elements range from
        // fromElement, inclusive, toElement, exclusive.
        System.out.println(set.subSet("BB", "PP"));
        SortedSet<String> s = set.subSet("BB", "PP");
        s.add("EE");
        System.out.println(s);
        System.out.println(set);
        
        // s.add("YY"); // IllegalArgumentException as toElement is PP and YY is beyond PP

    }
}
