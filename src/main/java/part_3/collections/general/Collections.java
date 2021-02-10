package part_3.collections.general;

import java.util.*;

public class Collections {
    public static void main(String[] args) {

        /*
        *   - Iterable
        *       - Collection
        *           - List
        *           - Set
        *           - Queue
        *
        *   - Map
        */

        /* ArrayList */
        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(24);
        arrayList.add(24);
        arrayList.add(25);
        arrayList.add(26);
        arrayList.add(27);
        System.out.println("arrayList = " + arrayList);

        /* Set */
        Set<String> set = new HashSet<>();
        set.add("abcd");
        set.add("bcde");
        set.add("abcd");
        System.out.println("set = " + set);

        /* Map */
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "a");
        map.put(2, "b");
        map.put(1, "c");
        System.out.println("map = " + map);
    }
}
