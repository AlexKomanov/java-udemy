package part_3.collections.general.homeWork;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HomeWork2 {
    public static void main(String[] args) throws IOException {

        /*
        Создать массив на 5 чисел.
        Заполнить его числами с клавиатуры.
        Найти максимальное и минимальное числа в массиве.
        Вывести на экран максимальное и минимальное числа через пробел.
*/

        int[] array = new int[5];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter a number: ");
            array[i] = Integer.parseInt(reader.readLine());
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        int minNumber = Integer.MAX_VALUE;
        int maxNumber = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < minNumber){
                minNumber = array[i];
            }
            if (array[i] > maxNumber){
                maxNumber = array[i];
            }
        }

        System.out.println("minNumber = " + minNumber);
        System.out.println("maxNumber = " + maxNumber);
    }
}
