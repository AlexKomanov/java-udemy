package part_3.collections.set;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetCollection {
    public static void main(String[] args) {

        // LinkedHashSet -> prints elements according to how they were added. Works longer than HashSet

        Set<String> set = new LinkedHashSet<>();
        set.add("ad");
        set.add("text2");
        set.add("ac");
        set.add("text1");
        set.add("text");
        set.add("text2");

        for (String s : set) {
            System.out.println(s);
        }
    }
}
