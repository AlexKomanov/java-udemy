package part_3.collections.equalsAndHashCode;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CollectionsClassMethods {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        Collections.addAll(list, "Elem1", "Elem5", "Elem4");

        for (String s : list) {
            System.out.println(s);
        }
        Collections.sort(list);

        System.out.println("-----------------");
        for (String s : list) {
            System.out.println(s);
        }

        System.out.println("-----------------");
        List<String> strings = Collections.synchronizedList(list);
        for (String string : strings) {
            System.out.println(string);
        }
    }
}
