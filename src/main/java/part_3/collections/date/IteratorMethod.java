package part_3.collections.date;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IteratorMethod {
    public static void main(String[] args) {

        System.out.println("\nIterator\n");

        List<String> list = new ArrayList<>();
        list.add("text1");
        list.add("text2");
        list.add("text3");
        list.add("text4");
        list.add("text5");

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            String element = iterator.next();
            System.out.println(element);
        }

        System.out.println("\nFor Each\n");

        for (String s : list) {
            System.out.println(s);
        }

        System.out.println("\n Manual For Each\n");
        List<Integer> integerList = Arrays.asList(12, 34, 67);
        for (Iterator i = integerList.iterator(); i.hasNext(); ) {
            Integer integer = (Integer) i.next();
            System.out.println(integer);
        }
    }
}
