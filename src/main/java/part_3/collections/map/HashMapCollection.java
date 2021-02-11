package part_3.collections.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapCollection {
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        map.put("text", 5);
        map.put("text", 7);
        map.put("text1", 7);
        map.put(null, 5);
        map.put("StringKey", null);

        System.out.println("\nFor Each Method\n");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + " - Value: " + entry.getValue());
        }

        System.out.println("\nIterator Method\n");

        //entrySet() -> SetCollection. With entrySet() we can use methods from Collection interface. For Example -> iterator().
        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String, Integer> entry = iterator.next();
            System.out.println("Key: " + entry.getKey() + " - Value: " + entry.getValue());
        }

    }
}
