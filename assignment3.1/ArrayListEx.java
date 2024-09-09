// Q1

// WAP to implement ArrayList.
// Demonstrate the implementation for the following constructors:
// • ArrayList(),
// • ArrayList(Collection c),
// • ArrayList(int capacity))
// Implement methods of Collection interface, List interface using ArrayList
// specified in Java notes.
// 1. public boolean add(Object obj)
// 2. public boolean addAll(Collection c)
// 3. public boolean remove(Object obj)
// 4. public boolean removeAll(Collection c)
// 5. public void clear()
// 6. public boolean contains(Object obj)
// 7. public boolean containsAll(Collection c)
// 8. public boolean retainAll(Collection c)
// 9. boolean isEmpty()
// 10. int size()
// 11. void add(int index, E element)
// 12. boolean add(E e)
// 13. boolean addAll(int index, Collection c)
// 14. E get(int index)
// 15. int indexOf(Object o)
// 16. boolean contains(Object o)
// 17. E remove(int index)
// 18. boolean remove(Object o)
// 19. E set(int index, E element)
// 20. ListIterator <E> listIterator()
// 21. List <E>subList(int start, int end)
// Iterate ArrayList using for loop, for each loop, Iterator, ListIterator.
// Use List.of(), List.copyOf(), List.asList() to create a list.

import java.util.*;

public class ArrayListEx {
    public static void main(String[] args) {
        // ArrayList()
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        System.out.println("ArrayList() : " + list1);

        // ArrayList(Collection c)
        List<Integer> list2 = new ArrayList<>(list1);
        System.out.println("ArrayList(Collection c) : " + list2);

        // ArrayList(int capacity)
        List<Integer> list3 = new ArrayList<>(5);
        list3.add(1);
        list3.add(2);
        list3.add(3);
        System.out.println("ArrayList(int capacity) : " + list3);

        // public boolean add(Object obj)
        list1.add(4);
        System.out.println("public boolean add(Object obj) : " + list1);

        // public boolean addAll(Collection c)
        list1.addAll(list3);
        System.out.println("public boolean addAll(Collection c) : " + list1);

        // public boolean remove(Object obj)
        list1.remove(4);
        System.out.println("public boolean remove(Object obj) : " + list1);

        // public boolean removeAll(Collection c)
        list1.removeAll(list3);
        System.out.println("public boolean removeAll(Collection c) : " + list1);

        // public void clear()
        list1.clear();
        System.out.println("public void clear() : " + list1);

        // public boolean contains(Object obj)
        list1.addAll(list3);
        System.out.println("public boolean contains(Object obj) : " + list1.contains(1));

        // public boolean containsAll(Collection c)
        System.out.println("public boolean containsAll(Collection c) : " + list1.containsAll(list3));

        // public boolean retainAll(Collection c)
        list1.retainAll(list3);
        System.out.println("public boolean retainAll(Collection c) : " + list1);

        // boolean isEmpty()
        System.out.println("boolean isEmpty() : " + list1.isEmpty());

        // int size()
        System.out.println("int size() : " + list1.size());

        // void add(int index, E element)
        list1.add(0, 0);
        System.out.println("void add(int index, E element) : " + list1);

        // boolean add(E e)
        list1.add(5);
        System.out.println("boolean add(E e) : " + list1);

        // boolean addAll(int index, Collection c)
        list1.addAll(1, list3);
        System.out.println("boolean addAll(int index, Collection c) : " + list1);

        // E get(int index)
        System.out.println("E get(int index) : " + list1.get(1));

        // int indexOf(Object o)
        System.out.println("int indexOf(Object o) : " + list1.indexOf(1));

        // boolean contains(Object o)
        System.out.println("boolean contains(Object o) : " + list1.contains(1));

        // E remove(int index)
        System.out.println("E remove(int index) : " + list1.remove(1));

        // boolean remove(Object o)
        System.out.println("boolean remove(Object o) : " + list1.remove((Integer) 1));

        // E set(int index, E element)
        list1.set(0, 1);
        System.out.println("E set(int index, E element) : " + list1);

        // ListIterator <E> listIterator()
        ListIterator<Integer> it = list1.listIterator();
        System.out.print("ListIterator <E> listIterator() : ");
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }

        // List <E>subList(int start, int end)
        List<Integer> subList = list1.subList(0, 2);
        System.out.println("\nList <E>subList(int start, int end) : " + subList);

        // Iterate ArrayList using for loop
        System.out.print("Iterate ArrayList using for loop : ");
        for (int i = 0; i < list1.size(); i++) {
            System.out.print(list1.get(i) + " ");
        }

        // Iterate ArrayList using for each loop
        System.out.print("\nIterate ArrayList using for each loop : ");
        for (Integer i : list1) {
            System.out.print(i + " ");
        }

        // Iterate ArrayList using Iterator
        System.out.print("\nIterate ArrayList using Iterator : ");
        Iterator<Integer> itr = list1.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }

        // Iterate ArrayList using ListIterator
        System.out.print("\nIterate ArrayList using ListIterator : ");
        ListIterator<Integer> listItr = list1.listIterator();
        while (listItr.hasNext()) {
            System.out.print(listItr.next() + " ");
        }

        // Use List.of(), List.copyOf(), List.asList() to create a list
        List<Integer> l1 = List.of(1, 2, 3);
        System.out.println("\nList.of() : " + l1);

        List<Integer> l2 = List.copyOf(list1);
        System.out.println("List.copyOf() : " + l2);

        List<Integer> l3 = List.of(1, 2, 3);
        List<Integer> l4 = List.copyOf(l3);
        System.out.println("List.copyOf() : " + l4);
    }
}
