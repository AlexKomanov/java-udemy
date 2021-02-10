package part_3.collections.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListListCollection {
    public static void main(String[] args) {

        /*
        ***** ArrayList ****

            DEFAULT_CAPACITY = 10
            New capacity -> (old capacity * 3) / 2 + 1
            Example (10 * 3) / 2 + 1 = 16

            *
        */

        List<Integer> listWithDefinedCapacity = new ArrayList<>(50);
        System.out.println("listWithDefinedCapacity.size() = " + listWithDefinedCapacity.size());
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        System.out.println("list.get(1) = " + list.get(1));
        list.add(1, 9); // Adding element by index
        list.add(10);
        System.out.println("list.get(1) = " + list.get(1));
        list.set(3, 100); //Replacing element by index
        for (Integer integer : list) {
            System.out.println(integer);
        }
        System.out.println("list.size() = " + list.size());
    }
}
