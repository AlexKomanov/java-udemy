package part_3.collections.set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetCollection {
    public static void main(String[] args) {

        // TreeSet -> Sorts the elements

        Set<String> set = new TreeSet<>();
        set.add("text2");
        set.add("text1");
        set.add("text");
        set.add("text2");

        for (String s : set) {
            System.out.println(s);
        }
    }

}
