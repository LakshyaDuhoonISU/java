// Q2

// WAP to implement the following methods of LinkedList
// Demonstrate the implementation for the following constructors:
// • LinkedList()
// • LinkedList(Collection c)
// Implement following methods for LinkedList:
// a) to Insert Elements into the LinkedList at the last position
// b) Add an element or collection of elements at a specific position of a
// LinkedList
// c) to retrieve the first item from LinkedList
// d) to retrieve the First Occurrence of the Specified Elements in a LinkedList
// e) to retrieve the position of last occurrence of a given element in a LinkedList
// f) to Retrieve but does not Remove, the Last Element of a LinkedList
// g) to Get the number of elements in a LinkedList
// h) to Check if a Particular Element exists in a LinkedList
// i) to find out whether that element exist in a LinkedList or not. If it exist retrieve the position of that element?
// j) to Iterate through all Elements in a LinkedList
// k) to Iterate a LinkedList in Reverse Order
// l) to display the elements and their positions in a linked list
// m) to test an LinkedList is Empty or Not
// n) to Replace an Element in a LinkedList
// o) to Remove and Return the First Element of a LinkedList
// p) to remove a specified element from a linked list
// q) to remove last element from a linked list
// r) to remove all the elements from a linked list
// s) to pop items from the stack represented by the LinkedList
// t) to Check whether an item exists in the LinkedList collection or not
// u) to Convert a LinkedList to ArrayList
// v) to join two linked lists
// w) to join an ArrayList at the end of a LinkedList
// x) to Add LinkedList collection into another LinkedList collection on the specified index

import java.util.*;

public class LinkedListEx {
    public static void main(String[] args) {
        // LinkedList()
        List<Integer> list1 = new LinkedList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        System.out.println("LinkedList() : " + list1);

        // LinkedList(Collection c)
        List<Integer> list2 = new LinkedList<>(list1);
        System.out.println("LinkedList(Collection c) : " + list2);

        // a) to Insert Elements into the LinkedList at the last position
        list1.add(4);
        System.out.println("Insert Elements into the LinkedList at the last position : " + list1);

        // b) Add an element or collection of elements at a specific position of a
        // LinkedList
        list1.add(1, 5);
        System.out
                .println("Add an element or collection of elements at a specific position of a LinkedList : " + list1);

        // c) to retrieve the first item from LinkedList
        System.out.println("Retrieve the first item from LinkedList : " + list1.get(0));

        // d) to retrieve the First Occurrence of the Specified Elements in a
        // LinkedList
        System.out.println("Retrieve the First Occurrence of the Specified Elements in a LinkedList : " + list1.get(1));

        // e) to retrieve the position of last occurrence of a given element in a
        // LinkedList
        System.out.println("Retrieve the position of last occurrence of a given element in a LinkedList : "
                + list1.lastIndexOf(5));

        // f) to Retrieve but does not Remove, the Last Element of a LinkedList
        System.out.println(
                "Retrieve but does not Remove, the Last Element of a LinkedList : " + list1.get(list1.size() - 1));

        // g) to Get the number of elements in a LinkedList
        System.out.println("Get the number of elements in a LinkedList : " + list1.size());

        // h) to Check if a Particular Element exists in a LinkedList
        System.out.println("Check if a Particular Element exists in a LinkedList : " + list1.contains(5));

        // i) to find out whether that element exist in a LinkedList or not. If it
        // exist retrieve the position of that element?
        System.out.println(
                "Find out whether that element exist in a LinkedList or not. If it exist retrieve the position of that element : "
                        + list1.indexOf(list1.get(list1.size() - 1)));

        // j) to Iterate through all Elements in a LinkedList
        System.out.println("Iterate through all Elements in a LinkedList : ");
        for (int i = 0; i < list1.size(); i++) {
            System.out.println(list1.get(i));
        }

        // k) to Iterate a LinkedList in Reverse Order
        System.out.println("Iterate a LinkedList in Reverse Order : ");
        for (int i = list1.size() - 1; i >= 0; i--) {
            System.out.println(list1.get(i));
        }

        // l) to display the elements and their positions in a linked list
        System.out.println("Display the elements and their positions in a linked list : ");
        for (int i = 0; i < list1.size(); i++) {
            System.out.println("Element at position " + i + " is " + list1.get(i));
        }

        // m) to test an LinkedList is Empty or Not
        System.out.println("Test an LinkedList is Empty or Not : " + list1.isEmpty());

        // n) to Replace an Element in a LinkedList
        list1.set(1, 6);
        System.out.println("Replace an Element in a LinkedList : " + list1);

        // o) to Remove and Return the First Element of a LinkedList
        System.out.println("Remove and Return the First Element of a LinkedList : " + list1.remove(0));

        // p) to remove a specified element from a linked list
        list1.remove((Integer) 6);
        System.out.println("Remove a specified element from a linked list : " + list1);

        // q) to remove last element from a linked list
        list1.remove(list1.size() - 1);
        System.out.println("Remove last element from a linked list : " + list1);

        // r) to remove all the elements from a linked list
        list1.clear();
        System.out.println("Remove all the elements from a linked list : " + list1);

        // s) to pop items from the stack represented by the LinkedList
        list1.add(1);
        list1.add(2);
        list1.add(3);
        System.out
                .println("Pop items from the stack represented by the LinkedList : " + list1.remove(list1.size() - 1));

        // t) to Check whether an item exists in the LinkedList collection or not
        System.out.println("Check whether an item exists in the LinkedList collection or not : " + list1.contains(1));

        // u) to Convert a LinkedList to ArrayList
        List<Integer> list3 = new ArrayList<>(list1);
        System.out.println("Convert a LinkedList to ArrayList : " + list3);

        // v) to join two linked lists
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list3.add(4);
        list3.add(5);
        list3.add(6);
        list1.addAll(list3);
        System.out.println("Join two linked lists : " + list1);

        // w) to join an ArrayList at the end of a LinkedList
        list1.addAll(list3);
        System.out.println("Join an ArrayList at the end of a LinkedList : " + list1);

        // x) to Add LinkedList collection into another LinkedList collection on the
        // specified index
        list1.addAll(1, list3);
        System.out.println(
                "Add LinkedList collection into another LinkedList collection on the specified index : " + list1);
    }
}
