import java.util.*;

public class MapEx1 {
    public static void main(String[] args) {
        System.out.println("Hash Map");
        Map<String, String> map3 = new HashMap<String, String>();
        map3.put("koala", "bamboo");
        map3.put("lion", "meat");
        map3.put("giraffe", "leaf");
        String food = map3.get("koala");
        System.out.println("Koala eats: " + food);

        System.out.println("Lion eats: " + map3.getOrDefault("lion", "default"));
        System.out.println("Lion eats: " + map3.get("lion"));
        System.out.println("Cow eats: " + map3.getOrDefault("cow", "default"));
        System.out.println("Cow eats: " + map3.get("cow"));

        map3.put("cow", "grass");
        for (Map.Entry<String, String> me : map3.entrySet()) {
            System.out.println("key = " + me.getKey() + ", value = " + me.getValue());
        }
        map3.put("cow", "plants");

        for (String key : map3.keySet()) {
            System.out.println(key + " = " + map3.get(key));
        }

        System.out.println("map3.containsKey(\"koala\"):" + map3.containsKey("koala"));
        System.out.println("map3.containsValue(\"leaf\"):" + map3.containsValue("bread"));
        System.out.println(map3.size());

        System.out.println("remove " + map3.remove("koala"));
        System.out.println("replace " + map3.replace("koala", "gr"));
        System.out.println("replace " + map3.replace("cow", "gr"));

        System.out.println("replace value for non existing key "+map3.replace("koala","gr")); // return null and value won't be added
        System.out.println("replace "+map3.replace("cow", "gr")); // return previous value and replace value
        
        for (Map.Entry<String, String> me : map3.entrySet()) {
            System.out.println("Key = "+me.getKey()+" Value = "+me.getValue());
        }
        System.out.println("remove "+map3.remove("koala")); // return null if value does not exist

        // remove(Object key,Object value): Removes the entry for the specified key only if it is currently mapped to the specified value
        System.out.println("remove boolean remove(k,v) "+map3.remove("cow","gr"));
        System.out.println(map3);

        System.out.println("putIfAbsent: "+map3.putIfAbsent("cow", "gr"));
        System.out.println(map3);

        System.out.println("putIfAbsent: "+map3.putIfAbsent("cow", "gr"));
        System.out.println(map3);

        Map<String,String> map4 = new HashMap<>();
        map4.put("horse","chickpea");
        map4.put("sparrow","seeds");
        map4.put("giraffe","tree leaves");
        map4.put("cow",null);
        map4.put(null,null); // allowed
        map4.put(null,null); // allowed
        System.out.println(map4);
        map3.putAll(map4);
        System.out.println(map3);
    }
}
