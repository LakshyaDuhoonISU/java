// Q5

// WAP to create HashMaps using following constructors:
// • HashMap( )
// • HashMap(Map<? extends K, ? extends V> m) HashMap(int capacity)
// • HashMap(int capacity, float fillRatio)
// Create a Map using Map.of() and Map.copyof()
// Implement the following methods:
// 1. V get(Object key)
// 2. V getOrDefault(Object key, V defaultValue)
// 3. V put(K key, K value)
// 4. int hashCode()
// 5. boolean isEmpty()
// 6. boolean containsKey(Object k)
// 7. boolean containsValue (Object v)
// 8. V remove(Object k)
// 9. boolean remove(Object key, Object value)
// 10.putIfAbsent(K key, V value)
// 11.V replace(K key, V value)
// 12.boolean replace(K key, V oldValue, V newValue)
// 13.void clear()
// 14.int size()
// 15.Collection values()
// 16.Set<K> keySet()
// 17.Set<Map.Entry<K,V>> entrySet()
// 18.K getKey() of Map.Entry
// 19.V getValue() of Map.Entry

import java.util.*;

public class HashMapEx {
    public static void main(String[] args) {
        // HashMap()
        Map<Integer, String> map1 = new HashMap<>();
        map1.put(1, "One");
        map1.put(2, "Two");
        map1.put(3, "Three");
        System.out.println("HashMap() : " + map1);

        // HashMap(Map m)
        Map<Integer, String> map2 = new HashMap<>(map1);
        System.out.println("HashMap(Map m) : " + map2);

        // HashMap(int capacity)
        Map<Integer, String> map3 = new HashMap<>(10);
        map3.put(4, "Four");
        map3.put(5, "Five");
        map3.put(6, "Six");
        System.out.println("HashMap(int capacity) : " + map3);

        // HashMap(int capacity, float fillRatio)
        Map<Integer, String> map4 = new HashMap<>(10, 0.75f);
        map4.put(7, "Seven");
        map4.put(8, "Eight");
        map4.put(9, "Nine");
        System.out.println("HashMap(int capacity, float fillRatio) : " + map4);

        // Map.of()
        Map<Integer, String> map5 = Map.of(10, "Ten", 11, "Eleven", 12, "Twelve");
        System.out.println("Map.of() : " + map5);

        // Map.copyOf()
        Map<Integer, String> map6 = Map.copyOf(map5);
        System.out.println("Map.copyOf() : " + map6);

        // V get(Object key)
        System.out.println("V get(Object key) : " + map1.get(1));

        // V getOrDefault(Object key, V defaultValue)
        System.out.println("V getOrDefault(Object key, V defaultValue) : " + map1.getOrDefault(2, "Default"));

        // V put(K key, K value)
        map1.put(1, "Uno");
        System.out.println("V put(K key, K value) : " + map1);

        // int hashCode()
        System.out.println("int hashCode() : " + map1.hashCode());

        // boolean isEmpty()
        System.out.println("boolean isEmpty() : " + map1.isEmpty());

        // boolean containsKey(Object k)
        System.out.println("boolean containsKey(Object k) : " + map1.containsKey(1));

        // boolean containsValue (Object v)
        System.out.println("boolean containsValue (Object v) : " + map1.containsValue("Uno"));

        // V remove(Object k)
        System.out.println("V remove(Object k) : " + map1.remove(1));

        // boolean remove(Object key, Object value)
        System.out.println("boolean remove(Object key, Object value) : " + map1.remove(2, "Two"));

        // putIfAbsent(K key, V value)
        map1.putIfAbsent(2, "Two");
        System.out.println("putIfAbsent(K key, V value) : " + map1);

        // V replace(K key, V value)
        map1.replace(2, "Dos");
        System.out.println("V replace(K key, V value) : " + map1);

        // boolean replace(K key, V oldValue, V newValue)
        System.out.println("boolean replace(K key, V oldValue, V newValue) : " + map1.replace(2, "Dos", "Two"));

        // void clear()
        map1.clear();
        System.out.println("void clear() : " + map1);

        // int size()
        System.out.println("int size() : " + map2.size());

        // Collection values()
        System.out.println("Collection values() : " + map2.values());

        // Set<K> keySet()
        System.out.println("Set<K> keySet() : " + map2.keySet());

        // Set<Map.Entry<K,V>> entrySet()
        System.out.println("Set<Map.Entry<K,V>> entrySet() : " + map2.entrySet());

        // K getKey() of Map.Entry
        System.out.println("K getKey() of Map.Entry : " + map2.entrySet().iterator().next().getKey());

        // V getValue() of Map.Entry
        System.out.println("V getValue() of Map.Entry : " + map2.entrySet().iterator().next().getValue());
    }
}
