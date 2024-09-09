// creating lists via of, asList, and copyOf methods

import java.util.List;

public class AsListOfCopyOf {
    public static void main(String[] args) {
        // create an immutable list
        List<Integer> l1=List.of(1,2,3);
        System.out.println(l1);

        // create another list from a previous list
        List<Integer> l2 = List.of(4,5,6);
        System.out.println(l2);

        // create a copy of the list
        List<Integer> l3 = List.copyOf(l1);
        System.out.println(l3);
    }
}
