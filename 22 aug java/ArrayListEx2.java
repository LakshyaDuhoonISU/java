import java.util.ArrayList;

public class ArrayListEx2 {
    public static void main(String[] args) {
        ArrayList<String> list4= new ArrayList<String>();
        list4.add("C");
        list4.add("D");
        ArrayList<String> list5= new ArrayList<String>();
        list5.add("A");
        list5.add("B");
        list5.add("C");
        list5.add("D");
        list5.add("E");
        list5.add("C");
        System.out.println(list5);
        System.out.println(list5.indexOf("c"));
        System.out.println(list5.indexOf("C"));
        System.out.println(list5.lastIndexOf("C"));
        System.out.println(list5.containsAll(list4));
        list5.retainAll(list4);
        System.out.println(list5);
    }
}
