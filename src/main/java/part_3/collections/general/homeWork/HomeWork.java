package part_3.collections.general.homeWork;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HomeWork {
    public static void main(String[] args) {


/* Задача по алгоритмам.
Есть массив чисел, в котором все числа дублируются, кроме одного. Найдите число, которое не имеет дубликатов в массиве.
Пример ввода: {1, 2, 3, 3, 4, 5, 7, 5, 6, 2, 4, 7, 6}
Пример вывода: 1
*/
        int[] array = {1, 2, 3, 3, 4, 5, 7, 5, 6, 2, 4, 7, 6};
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
           if (map.get(array[i]) == null){
               map.put(array[i], 1);
           }
           else {
               map.put(array[i], map.get(array[i]) + 1);
           }
        }

        System.out.println("map = " + map);

        System.out.println("Non duplicated numbers in array:");
        for (Map.Entry<Integer, Integer> entry : map.entrySet()){
            if (entry.getValue() == 1){
                System.out.print(entry.getKey() + " ");
            }
        }

    }
}
