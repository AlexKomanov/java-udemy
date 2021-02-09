package arrays;

import java.util.Arrays;
import java.util.Random;

public class ArraysLesson {
    public static void main(String[] args) {

        /** Array
         * @type: Object
         * */

        int[] array = new int[10];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(50);
        }


        array[6] = 10;
        for (int j : array) {
            System.out.print(j + " ");
        }

        /* Arrays.sort method */

        Arrays.sort(array);
        System.out.println("\n\nSorted array\n");
        for (int j : array) {
            System.out.print(j + " ");
        }

        /* Static init of arrays ->  initialized during declaration */

        String[] strings = {"First", "Second"};
        System.out.println("\n\nStrings array\n");
        for (String string : strings) {
            System.out.println(string);
        }
    }
}
