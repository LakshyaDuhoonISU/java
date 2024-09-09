// Q4

// WAP to create aTreeSet using following constructors:
// • TreeSet( )
// • TreeSet(Collection<? extends E> c)
// • TreeSet(SortedSet<E> ss)
// Create a Set using Set.of() and Set.copyof()
// Implement the following methods:
// 1. E ceiling(E obj)
// 2. Iterator<E> descendingIterator()
// 3. NavigableSet<E> descendingSet()
// 4. E floor(E obj)
// 5. NavigableSet<E>headSet(E, boolean)
// 6. NavigableSet<E> subSet(E lowerBound, boolean lowIncl, E upperBound, boolean highIncl)
// 7. E upperBound, boolean highIncl)
// 8. E higher(E obj)
// 9. E lower(E obj)
// 10.E pollFirst()
// 11.E pollLast()
// 12.NavigableSet<E> tailSet(E lowerBound, boolean incl)

import java.util.*;

public class TreeSetEx {
    public static void main(String[] args) {
        // TreeSet()
        Set<Integer> set1 = new TreeSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        System.out.println("TreeSet() : " + set1);

        // TreeSet(Collection c)
        Set<Integer> set2 = new TreeSet<>(set1);
        System.out.println("TreeSet(Collection c) : " + set2);

        // TreeSet(SortedSet ss)
        SortedSet<Integer> sortedSet = new TreeSet<>();
        sortedSet.add(4);
        sortedSet.add(5);
        sortedSet.add(6);
        Set<Integer> set3 = new TreeSet<>(sortedSet);
        System.out.println("TreeSet(SortedSet ss) : " + set3);

        // Set.of()
        Set<Integer> set4 = Set.of(7, 8, 9);
        System.out.println("Set.of() : " + set4);

        // Set.copyOf()
        Set<Integer> set5 = Set.copyOf(set4);
        System.out.println("Set.copyOf() : " + set5);

        // E ceiling(E obj)
        System.out.println("E ceiling(E obj) : " + ((TreeSet<Integer>) set1).ceiling(2));

        // Iterator<E> descendingIterator()
        Iterator<Integer> descendingIterator = ((TreeSet<Integer>) set1).descendingIterator();
        System.out.print("Iterator<E> descendingIterator() : ");
        while (descendingIterator.hasNext()) {
            System.out.print(descendingIterator.next() + " ");
        }
        System.out.println();

        // NavigableSet<E> descendingSet()
        NavigableSet<Integer> descendingSet = ((TreeSet<Integer>) set1).descendingSet();
        System.out.println("NavigableSet<E> descendingSet() : " + descendingSet);

        // E floor(E obj)
        System.out.println("E floor(E obj) : " + ((TreeSet<Integer>) set1).floor(2));

        // NavigableSet<E>headSet(E, boolean)
        NavigableSet<Integer> headSet = ((TreeSet<Integer>) set1).headSet(2, true);
        System.out.println("NavigableSet<E>headSet(E, boolean) : " + headSet);

        // NavigableSet<E> subSet(E lowerBound, boolean lowIncl, E upperBound, boolean
        // highIncl)
        NavigableSet<Integer> subSet = ((TreeSet<Integer>) set1).subSet(1, true, 2, true);
        System.out.println("NavigableSet<E> subSet(E lowerBound, boolean lowIncl, E upperBound, boolean highIncl) : "
                + subSet);
        

        // E higher(E obj)
        System.out.println("E higher(E obj) : " + ((TreeSet<Integer>) set1).higher(2));

        // E lower(E obj)
        System.out.println("E lower(E obj) : " + ((TreeSet<Integer>) set1).lower(2));

        // E pollFirst()
        System.out.println("E pollFirst() : " + ((TreeSet<Integer>) set1).pollFirst());

        // E pollLast()
        System.out.println("E pollLast() : " + ((TreeSet<Integer>) set1).pollLast());

        // NavigableSet<E> tailSet(E lowerBound, boolean incl)
        NavigableSet<Integer> tailSet = ((TreeSet<Integer>) set1).tailSet(2, true);
        System.out.println("NavigableSet<E> tailSet(E lowerBound, boolean incl) : " + tailSet);
    }
}
