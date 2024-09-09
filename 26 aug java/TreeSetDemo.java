import java.util.*;

public class TreeSetDemo {
    public static void main(String[] args) {
        NavigableSet<String> ts = new TreeSet<String>();
        ts.add("AA");
        ts.add("BB");
        ts.add("CC");
        ts.add("FF");
        System.out.println("ts: " + ts);

        TreeSet<String> s = (TreeSet<String>) ts.headSet("II");
        System.out.println("s: " + s);
        System.out.println(s.add("GG"));
        System.out.println("s: " + s); // GG is added in s
        System.out.println("ts: " + ts); // GG has been added in ts also

        System.out.println("tailSet and add");
        System.out.println(ts.tailSet("CC").add("DD"));
        System.out.println(ts.tailSet("CC").add("CC"));
        System.out.println("ts: " + ts);
        System.out.println("s: " + s);
        System.out.println("ts.subSet(CC, FF): " + ts.subSet("CC", "FF"));
        System.out.println("ts.first(): " + ts.first());
        System.out.println("ts.last(): " + ts.last());
        System.out.println("floor of BB: " + ts.floor("BB"));
        System.out.println("ceiling of DD: " + ts.ceiling("DD"));
        System.out.println("ceiling of EE: " + ts.ceiling("EE"));
        System.out.println("ceiling of II: " + ts.ceiling("II"));
        System.out.println("higher of CC: " + ts.higher("CC"));
        System.out.println("higher of GG: " + ts.higher("GG"));
        System.out.println("lower of FF: " + ts.lower("FF"));
        System.out.println("pollFirst(): " + ts.pollFirst());
        System.out.println("pollLast(): " + ts.pollLast());
        System.out.println("ts after pollFirst() and pollLast(): " + ts);
        System.out.println("s after pollFirst() and pollLast(): " + s);

        TreeSet<String> sh = (TreeSet<String>) ts.descendingSet();
        System.out.println(sh);
        System.out.println(sh.add("27"));
        System.out.println(sh);

        System.out.println("headSet(BB, true): " + ts.headSet("BB", true));
        System.out.println("headSet(BB, true): " + ts.headSet("BB", true));
        System.out.println("headSet(BB, false): " + ts.headSet("BB", false));

        System.out.println("tailSet(BB, true): " + ts.tailSet("BB", true));
        System.out.println("tailSet(BB, false): " + ts.tailSet("BB", false));

        System.out.println("subSet(BB, false, FF, false): " + ts.subSet("BB", false, "FF", false));
        System.out.println("subSet(BB, false, FF, true): " + ts.subSet("BB", false, "FF", true));
        System.out.println("subSet(BB, true, FF, true): " + ts.subSet("BB", true, "FF", true));

        System.out.println("Descending Iterator:");
        Iterator<String> desItr = ts.descendingIterator();
        while (desItr.hasNext()) {
            System.out.println(desItr.next());
        }

        System.out.println("Iterator:");
        Iterator<String> itr = ts.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        List<Integer> list = List.of(44, 22, 11, 33, 22);
        System.out.println("List: " + list);
        TreeSet<Integer> ts1 = new TreeSet<>(list);
        System.out.println("TreeSet from list: " + ts1);

        HashSet<Double> hs = new HashSet<>();
        hs.add(55.9);
        hs.add(54.4);
        hs.add(55.7);
        hs.add(35.7);
        hs.add(51.4);

        Set<Double> s1 = new TreeSet<>(hs);
        System.out.println("Created TreeSet from HashSet: " + s1);

        LinkedList<Double> ll = new LinkedList<>(hs);
        ll.add(55.9);
        System.out.println("Created LinkedList from HashSet: " + ll);

        TreeSet<Double> s3 = new TreeSet<>(ll);
        System.out.println("Created TreeSet from LinkedList: " + s3);

        // Will get Exception for the following statement
        // Set sof=Set.of(77,44,33,22,44,22); // java.lang.IllegalArgumentException:
        // duplicate element: 44
        Set<Integer> sof = Set.of(77, 44, 33, 22);
        System.out.println("Set.of: " + sof);

        // remove duplicate values of another collection
        Set<Double> sof1 = Set.copyOf(ll);
        System.out.println("Set.copyOf: " + sof1);

        // System.out.println("sof1.add(20.5)" + sof1.add(20.5)) //
        // java.lang.UnsupportedOperationException
    }
}