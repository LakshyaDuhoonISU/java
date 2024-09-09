import java.util.*;

public class AnimalArrayList {
    public static void main(String[] args) {
        ArrayList<String> animals1 = new ArrayList<String>();
        animals1.add("Cat");
        animals1.add("Dog");
        animals1.add("Cow");
        animals1.add("Lion");
        System.out.println(animals1);
        animals1.add(0, "Tiger");
        animals1.add(3, "Zebra");
        System.out.println(animals1);

        ArrayList<String> animals2 = new ArrayList<String>();
        animals2.add("Kangaroo");
        animals2.add("Donkey");
        animals2.add("Cow");
        animals1.addAll(animals2);
        System.out.println(animals2);

        System.out.println(animals1);
        System.out.println(animals1.get(2));
        System.out.println(animals1.indexOf("Cow"));
        System.out.println(animals1.lastIndexOf("Cow"));
        if (animals1.contains("Dog")) {
            System.out.println("Dog is present");
        } else {
            System.out.println("Dog is not present");
        }
        if (animals1.contains("Rat")) {
            System.out.println("Rat is present");
        } else {
            System.out.println("Rat is not present");
        }

        if (animals1.isEmpty()) {
            System.out.println("The list is empty");
        } else {
            System.out.println("The list is not empty");
        }
        System.out.println(animals1.size());

        animals1.remove("Cow");
        animals1.remove(2);
        animals1.add(2, "Ant");
        animals1.set(2, "Antelope");
        System.out.println();

        System.out.println("Iterating by for loop");
        for (int i = 0; i < animals1.size(); i++) {
            System.out.println(animals1.get(i));
        }
        System.out.println();

        System.out.println("Iterating by for each loop");
        for (String animal : animals1) {
            System.out.println(animal);
        }
        System.out.println();

        System.out.println("Iterating by Iterator");
        Iterator<String> it = animals1.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println();

        System.out.println("Iterating by ListIterator");
        ListIterator<String> lit = animals1.listIterator();
        while (lit.hasNext()) {
            System.out.println(lit.next());
        }
    }
}
