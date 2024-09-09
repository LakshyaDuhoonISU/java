// Q6

// WAP to create TreeMaps using following constructors:
// • TreeMap( )
// • TreeMap(Comparator<? super K> comp)
// • TreeMap(Map<? extends K, ? extends V> m)
// • TreeMap(SortedMap<K, ? extends V> sm)
// Implement following methods for Tree Map:
// 1. K firstKey()
// 2. SortedMap<K, V> headMap(K end)
// 3. K lastKey()
// 4. SortedMap<K, V> subMap(K start, K end)
// 5. SortedMap<K, V> tailMap(K start)
// 6. Map.Entry<K,V> ceilingEntry(K obj)
// 7. K ceilingKey(K obj)
// 8. Map.Entry<K,V> floorEntry(K obj)
// 9. K floorKey(K obj)
// 10.Map.Entry<K,V> higherEntry(K obj)
// 11.NavigableSet<K> navigableKeySet()
// 12.Map.Entry<K,V> pollFirstEntry()
// 13.Map.Entry<K,V> pollLastEntry()
// 14.NavigableMap<K,V> subMap(K lowerBound,
// 15.boolean lowincl, K upperBound boolean highIncl)
// 16.NavigableMap<K,V> tailMap(K lowerBound, boolean incl)
// 17.NavigableSet<K> descendingKeySet()
// 18.NavigableMap<K,V> descendingMap()
// 19.Map.Entry<K,V> firstEntry()
// 20.NavigableMap<K,V> headMap(K upperBound, boolean incl)
// 21.Map.Entry<K,V> lastEntry()

import java.util.*;

public class TreeMapEx {
    public static void main(String[] args) {
        // TreeMap()
        Map<Integer, String> map1 = new TreeMap<>();
        map1.put(1, "One");
        map1.put(2, "Two");
        map1.put(3, "Three");
        System.out.println("TreeMap() : " + map1);

        // TreeMap(Comparator comp)
        Map<Integer, String> map2 = new TreeMap<>(Comparator.reverseOrder());
        map2.put(1, "One");
        map2.put(2, "Two");
        map2.put(3, "Three");
        System.out.println("TreeMap(Comparator comp) : " + map2);

        // TreeMap(Map m)
        Map<Integer, String> map3 = new TreeMap<>(map1);
        System.out.println("TreeMap(Map m) : " + map3);

        // TreeMap(SortedMap sm)
        SortedMap<Integer, String> sortedMap = new TreeMap<>();
        sortedMap.put(4, "Four");
        sortedMap.put(5, "Five");
        sortedMap.put(6, "Six");
        Map<Integer, String> map4 = new TreeMap<>(sortedMap);
        System.out.println("TreeMap(SortedMap sm) : " + map4);

        // K firstKey()
        System.out.println("K firstKey() : " + ((TreeMap<Integer, String>) map1).firstKey());

        // SortedMap<K, V> headMap(K end)
        System.out.println("SortedMap<K, V> headMap(K end) : " + ((TreeMap<Integer, String>) map1).headMap(2));

        // K lastKey()
        System.out.println("K lastKey() : " + ((TreeMap<Integer, String>) map1).lastKey());

        // SortedMap<K, V> subMap(K start, K end)
        System.out
                .println("SortedMap<K, V> subMap(K start, K end) : " + ((TreeMap<Integer, String>) map1).subMap(1, 3));

        // SortedMap<K, V> tailMap(K start)
        System.out.println("SortedMap<K, V> tailMap(K start) : " + ((TreeMap<Integer, String>) map1).tailMap(2));

        // Map.Entry<K,V> ceilingEntry(K obj)
        System.out.println("Map.Entry<K,V> ceilingEntry(K obj) : " + ((TreeMap<Integer, String>) map1).ceilingEntry(2));

        // K ceilingKey(K obj)
        System.out.println("K ceilingKey(K obj) : " + ((TreeMap<Integer, String>) map1).ceilingKey(2));

        // Map.Entry<K,V> floorEntry(K obj)
        System.out.println("Map.Entry<K,V> floorEntry(K obj) : " + ((TreeMap<Integer, String>) map1).floorEntry(2));

        // K floorKey(K obj)
        System.out.println("K floorKey(K obj) : " + ((TreeMap<Integer, String>) map1).floorKey(2));

        // Map.Entry<K,V> higherEntry(K obj)
        System.out.println("Map.Entry<K,V> higherEntry(K obj) : " + ((TreeMap<Integer, String>) map1).higherEntry(2));

        // NavigableSet<K> navigableKeySet()
        System.out
                .println("NavigableSet<K> navigableKeySet() : " + ((TreeMap<Integer, String>) map1).navigableKeySet());

        // Map.Entry<K,V> pollFirstEntry()
        System.out.println("Map.Entry<K,V> pollFirstEntry() : " + ((TreeMap<Integer, String>) map1).pollFirstEntry());

        // Map.Entry<K,V> pollLastEntry()
        System.out.println("Map.Entry<K,V> pollLastEntry() : " + ((TreeMap<Integer, String>) map1).pollLastEntry());

        // NavigableMap<K,V> subMap(K lowerBound, boolean lowincl, K upperBound boolean
        // highIncl)
        System.out.println("NavigableMap<K,V> subMap(K lowerBound, boolean lowincl, K upperBound boolean highIncl) : "
                + ((TreeMap<Integer, String>) map1).subMap(1, true, 3, true));

        // NavigableMap<K,V> tailMap(K lowerBound, boolean incl)
        System.out.println("NavigableMap<K,V> tailMap(K lowerBound, boolean incl) : "
                + ((TreeMap<Integer, String>) map1).tailMap(2, true));

        // NavigableSet<K> descendingKeySet()
        System.out.println(
                "NavigableSet<K> descendingKeySet() : " + ((TreeMap<Integer, String>) map1).descendingKeySet());

        // NavigableMap<K,V> descendingMap()
        System.out.println("NavigableMap<K,V> descendingMap() : " + ((TreeMap<Integer, String>) map1).descendingMap());

        // Map.Entry<K,V> firstEntry()
        System.out.println("Map.Entry<K,V> firstEntry() : " + ((TreeMap<Integer, String>) map1).firstEntry());

        // NavigableMap<K,V> headMap(K upperBound, boolean incl)
        System.out.println("NavigableMap<K,V> headMap(K upperBound, boolean incl) : "
                + ((TreeMap<Integer, String>) map1).headMap(2, true));

        // Map.Entry<K,V> lastEntry()
        System.out.println("Map.Entry<K,V> lastEntry() : " + ((TreeMap<Integer, String>) map1).lastEntry());
    }
}
