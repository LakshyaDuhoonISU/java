//Q3

// WAP to implement the following constructors and following operations on
// HashSet
// • HashSet( )
// • HashSet(Collection<? extends E> c)

// • HashSet(int capacity)
// • HashSet(int capacity, float fillRatio)
// •
// 1. to convert a hash set to a List/ArrayList
// 2. to convert a hash set to a tree set
// 3. to convert a hash set to an array
// 4. to test a hash set is empty or not
// 5. to empty an hash set
// 6. to get the number of elements in a hash set
// 7. to iterate through all elements in a hash list
// 8. to add the specified element in hash set
// 9. to Remove the specified element from the hashset
// 10. Try to add duplicate elements to HashSet
// 11. to add ArrayList elements to HashSet
// 12. to Copy Set content to another HashSet
// 13. to Create a HashSet with string items
// 14. to Print a HashSet collection using the foreach loop
// 15. to Check whether a HashSet contains a specified item or not
// 16. to Create a set of Box objects using HashSet (Hint: create a class Box with
// instance variable: length, height, width. Create a Hash Set which stores the
// objects of Box class)
// 17. to Find the union of HashSet collections
// 18. to Find the intersection of HashSet collection
// 19. to compare two sets and retain elements which are same on both sets
// 20. to compare two hash sets
// 21. to remove all of the elements from a hash set

import java.util.*;

class Box {
    int length;
    int height;
    int width;

    public Box(int length, int height, int width) {
        this.length = length;
        this.height = height;
        this.width = width;
    }

    public String toString() {
        return "Box [height=" + height + ", length=" + length + ", width=" + width + "]";
    }
}

public class HashSetEx {
    public static void main(String[] args) {
        // HashSet()
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        System.out.println("HashSet() : " + set1);

        // HashSet(Collection c)
        Set<Integer> set2 = new HashSet<>(set1);
        System.out.println("HashSet(Collection c) : " + set2);

        // 1. to convert a hash set to a List/ArrayList
        List<Integer> list = new ArrayList<>(set1);
        System.out.println("Convert a hash set to a List/ArrayList : " + list);

        // 2. to convert a hash set to a tree set
        Set<Integer> treeSet = new TreeSet<>(set1);
        System.out.println("Convert a hash set to a tree set : " + treeSet);

        // 3. to convert a hash set to an array
        Integer[] arr = new Integer[set1.size()];
        set1.toArray(arr);
        System.out.println("Convert a hash set to an array : " + Arrays.toString(arr));

        // 4. to test a hash set is empty or not
        System.out.println("Test a hash set is empty or not : " + set1.isEmpty());

        // 5. to empty an hash set
        set1.clear();
        System.out.println("Empty an hash set : " + set1);

        // 6. to get the number of elements in a hash set
        System.out.println("Get the number of elements in a hash set : " + set2.size());

        // 7. to iterate through all elements in a hash list
        for (Integer i : set2) {
            System.out.println(i);
        }

        // 8. to add the specified element in hash set
        set2.add(4);
        System.out.println("Add the specified element in hash set : " + set2);

        // 9. to Remove the specified element from the hashset
        set2.remove(4);
        System.out.println("Remove the specified element from the hashset : " + set2);

        // 10. Try to add duplicate elements to HashSet
        set2.add(2);
        System.out.println("Try to add duplicate elements to HashSet : " + set2);

        // 11. to add ArrayList elements to HashSet
        List<Integer> list1 = new ArrayList<>();
        list1.add(5);
        list1.add(6);
        list1.add(7);
        set2.addAll(list1);
        System.out.println("Add ArrayList elements to HashSet : " + set2);

        // 12. to Copy Set content to another HashSet
        Set<Integer> set3 = new HashSet<>(set2);
        System.out.println("Copy Set content to another HashSet : " + set3);

        // 13. to Create a HashSet with string items
        Set<String> set4 = new HashSet<>();
        set4.add("Hello");
        set4.add("World");
        set4.add("Java");
        System.out.println("Create a HashSet with string items : " + set4);

        // 14. to Print a HashSet collection using the foreach loop
        for (String s : set4) {
            System.out.println(s);
        }

        // 15. to Check whether a HashSet contains a specified item or not
        System.out.println("Check whether a HashSet contains a specified item or not : " + set4.contains("Java"));

        // 16. to Create a set of Box objects using HashSet
        Set<Box> boxSet = new HashSet<>();
        boxSet.add(new Box(1, 2, 3));
        boxSet.add(new Box(4, 5, 6));
        boxSet.add(new Box(7, 8, 9));
        System.out.println("Create a set of Box objects using HashSet : " + boxSet);

        // 17. to Find the union of HashSet collections
        Set<Integer> set5 = new HashSet<>();
        set5.add(1);
        set5.add(2);
        set5.add(3);
        Set<Integer> set6 = new HashSet<>();
        set6.add(3);
        set6.add(4);
        set6.add(5);
        set5.addAll(set6);
        System.out.println("Find the union of HashSet collections : " + set5);

        // 18. to Find the intersection of HashSet collection
        Set<Integer> set7 = new HashSet<>();
        set7.add(1);
        set7.add(2);
        set7.add(3);
        Set<Integer> set8 = new HashSet<>();
        set8.add(3);
        set8.add(4);
        set8.add(5);
        set7.retainAll(set8);
        System.out.println("Find the intersection of HashSet collection : " + set7);

        // 19. to compare two sets and retain elements which are same on both sets
        Set<Integer> set9 = new HashSet<>();
        set9.add(1);
        set9.add(2);
        set9.add(3);
        Set<Integer> set10 = new HashSet<>();
        set10.add(3);
        set10.add(4);
        set10.add(5);
        set9.retainAll(set10);
        System.out.println("Compare two sets and retain elements which are same on both sets : " + set9);

        // 20. to compare two hash sets
        System.out.println("Compare two hash sets : " + set9.equals(set10));

        // 21. to remove all of the elements from a hash set
        set9.clear();
        System.out.println("Remove all of the elements from a hash set : " + set9);
    }
}
