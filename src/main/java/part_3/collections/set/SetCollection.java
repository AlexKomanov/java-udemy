package part_3.collections.set;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetCollection {
    public static void main(String[] args) {

     /*
     HashSet - Part of HashMap!

     public HashSet() {
            map = new HashMap<>();
        }*/

        Set<String> set = new HashSet<>();
        set.add("text");
        set.add("text1");
        set.add("text2");
        set.add("text2");

//        for (String s : set) {
//            System.out.println(s);
//        }

        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()){
            String next = iterator.next();
            System.out.println(next);
        }
    }
}
