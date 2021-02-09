package part_1.inputOutput.homeWork;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HomeWork {
    public static void main(String[] args) throws IOException {

        /*
        Ввести с клавиатуры число n. Вывести на экран надпись «Я зарабатываю $n в час».
        Пример: Я буду зарабатывать $50 в час
        */

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Ваш заработок:");
        int sum = Integer.parseInt(reader.readLine());
        System.out.println("Я буду зарабатывать $" + sum + " в час");

        /*
        Ввести с клавиатуры отдельно Имя, число1, число2.
        Вывести надпись: «Имя» будет получать «число1» через «число2» лет.
        Пример: Alex будет получать 4000 через 5 лет.
        */

        System.out.println("Введите Имя:");
        String name = reader.readLine();
        System.out.println("Введите число1:");
        int num1 = Integer.parseInt(reader.readLine());
        System.out.println("Введите число2:");
        int num2 = Integer.parseInt(reader.readLine());

        System.out.println(name + " будет получать " + num1 + " через " + num2 + " лет");
    }
}
