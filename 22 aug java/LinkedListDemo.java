import java.util.*;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> l1 = new LinkedList<String>(); // creating a linked list
        // add elements to the linked list
        l1.add("F");
        l1.add("B");
        l1.add("D");
        l1.add("E");
        l1.add("C");
        l1.addLast("Z");
        l1.addFirst("A");
        l1.add(1, "A2");

        System.out.println("Original contents of l1: " + l1);

        // remove elements from linked list
        l1.remove("F");
        l1.remove(2);

        System.out.println("Contents of l1 after deletion: " + l1);

        // remove first and last elements
        l1.removeFirst();
        l1.removeLast();

        System.out.println("l1 after deleting first and last: " + l1);

        // Get and set a value
        String val = l1.get(2);
        l1.set(2, val + " Changed");

        System.out.println("l1 after change: " + l1);

        System.out.println("First element: " + l1.getFirst());
        System.out.println("Last element: " + l1.getLast());

        System.out.println("First element using peek: " + l1.peekFirst());
        System.out.println("Last element using peek: " + l1.peekLast());

        l1.pollFirst();
        l1.pollLast();

        l1.offerFirst("A");
        l1.offerLast("Z");
        System.out.println("Linked List: " + l1);
    }
}
