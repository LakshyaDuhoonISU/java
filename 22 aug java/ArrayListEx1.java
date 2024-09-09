import java.util.*;

public class ArrayListEx1 {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<String>();
        list1.add("Tom");
        list1.add("Shyam");
        list1.add("Ravi");
        list1.add("Sam");
        list1.add("Pam");
        list1.add("Ram"); // using add method to add elements to list
        System.out.println(list1); // print the list

        list1.add(1, "Naina"); // add element "Naina" at index 1 of the list and shift the other elements
        System.out.println(list1);

        System.out.println(list1.get(3)); // retrieve the element at index 3 from the list

        System.out.println("Element at first index: " + list1.get(1));
        list1.set(1, "XYZ"); // set element "XYZ" at index 1 and remove the previous element at index 1
        System.out.println(list1);
        list1.remove(1); // remove the element at index 1 and shift the other elements
        list1.remove("Sam"); // remove the element "Sam" from the list

        System.out.println(list1);
        if (list1.contains("Ravi")) { // check if the list contains the element "Ravi"
            System.out.println("Ravi is present at the index " + list1.indexOf("Ravi")); // get the index of the element
        }

        System.out.println("Size of the list: " + list1.size());

        for (int i = 0; i < list1.size(); i++) { // using a for loop to iterate through the list and print the elements
            System.out.println(list1.get(i));
        }
        System.out.println();

        for (String name : list1) { // using a for each loop to iterate through the list and print the elements
            System.out.println(name);
        }

        System.out.println();
        Iterator<String> it = list1.iterator(); // creating an iterator to iterate through the list
        while (it.hasNext()) { // iterate while there is a next element available
            System.out.println(it.next()); // print the next element
        }

        System.out.println();
        ListIterator<String> listIt = list1.listIterator(list1.size()); // creating a list iterator to iterate through
                                                                        // the list
        while (listIt.hasPrevious()) { // iterate while there is a previous element available
            System.out.println(listIt.previous()); // print the previous element
        }
        System.out.println();

        if (list1.isEmpty()) { // if list is empty, print the appropriate message
            System.out.println("List1 is empty");
        } else {
            System.out.println("List1 is not empty");
        }

        ArrayList<String> list2 = new ArrayList<String>(); // creating another list
        list2.add("AAA");
        list2.add("BBB");
        list2.add("CCC");
        list2.add("DDD");
        ArrayList<String> list3 = new ArrayList<String>(list2); // creating a third list with the elements of the
                                                                // previous 2 lists(parameter is a collection)
        System.out.println(list3);

        List<Integer> l1 = List.of(11, 22, 33, 44); // creating an immutable list
        System.out.println(l1);
        List<Character> l2 = List.of('1', '2', '3');
        System.out.println(l2);
    }
}
