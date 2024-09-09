import java.util.*;

public class CollectionsSortEx1 {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("TT");
        list1.add("SS");
        list1.add("RR");
        list1.add("BB");
        list1.add("AA");
        list1.add("CC");
        System.out.println(list1);

        // Collections.sort: sorting elements of ArrayList in ascending order
        Collections.sort(list1);
        System.out.println("List after Collections.sort(list1): \n"+list1);
        System.out.println("Binary Search(index of CC): " + Collections.binarySearch(list1, "CC"));

        // Collections.sort and reverseOrder: sorting elements of ArrayList in descending order
        Collections.sort(list1,Collections.reverseOrder());
        System.out.println("List after Collections.sort and reverseOrder(): \n"+list1);
    }
}
