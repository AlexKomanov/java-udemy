package part_3.collections.list;

import java.util.LinkedList;
import java.util.List;

public class LinkedListCollection {
    public static void main(String[] args) {


    /*    ***** LinkedList ****

        []-[]{-[]-}[]-[]
        |       |      |
        first   Node   last

        transient int size = 0;
        transient LinkedList.Node<E> first;
        transient LinkedList.Node<E> last;

        private static class Node<E> {
        E item;
        Node<E> next;
        Node<E> prev;

        In LinkedList we passing every Node until we get the required Node (no indexes as in ArrayList).

*/


        List<Integer> list = new LinkedList<>();
        list.add(25);
        list.add(25);
        list.add(25);
        list.add(25);
        list.add(25);
        list.add(25);
        list.add(25);
        list.add(2, 45);
        list.set(4, 100);


        for (Integer integer : list) {
            System.out.println(integer);
        }
        System.out.println("list.size() = " + list.size());

    }
}
