package part_3.collections.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Example1 {
    public static void main(String[] args) {

        /*
          Map Structure:

          Default capacity = 16
          Load_Factor = 0.75f -> if 3/4 of map is full - it grows twice.

          0[16 - Text, null - Text] 1[17 - Text] 2[] 3[19 - Text, 35 - Text] 4[4 - Text] 5[] 6[] 7[] 8[] 9[] 10[] 11[] 12[] 13[] 14[] 15[]
            Collision -> Division result is a same, Hashcode equals = false
            It builds a LinkedList in the basket

          17 % 16 = 1 <- divided by 16 (current number of baskets in the map).
          4 % 16 = 4
          19 % 16 = 3
          35 % 16 = 3
          16 % 16 = 0
          null % 16 = 0

          ** From Java 8 - if we have a lot of collisions, in order to optimize
          time complexity - can be used Balanced tree structure instead of LinkedList
        */

        Map<Integer, String> map = new HashMap<>();
        map.put(17, "Text");
        map.put(4, "Text");
        map.put(19, "Text");
        map.put(35, "Text");
        map.put(16, "Text");
        map.put(null, "Text");


        for(Map.Entry<Integer, String> entry : map.entrySet()){
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}
