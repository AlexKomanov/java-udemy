package part_1.conditions.homeWork;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HomeWork2 {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter first number:");
        int num1 = Integer.parseInt(reader.readLine());

        /* Реализовать метод compare(int a). Метод должен выводить строку на экран "Число меньше 5", если параметр метода меньше 5 -
        выводить строку "Число больше 5", если параметр метода больше 5 - и, и выводить строку "Число равно 5", если параметр метода равен 5. */
        compare(num1);

        /* Ввести с клавиатуры число. Если число положительное, то увеличить его в два раза. Если число отрицательное, то увеличить его на 10.
        Вывести результат на экран. */
        checkIfPositive(num1);

        /* Реализовать метод checkInterval. Метод должен проверять попало ли целое число в интервал от 20 до 50 и сообщить результат
        на экран в следующем виде: "Число а не содержится в интервале." или "Число а содержится в интервале.", где а - аргумент метода. */
        checkInterval(num1);

        /* Реализовать метод closeToFive. Метод должен выводить на экран ближайшее к 5 из двух чисел, записанных в аргументах метода.
        Например, среди чисел 3 и 6 ближайшее к пяти 6. Если оба числа на равной длине к 5, то вывести на экран любое из них. */
        System.out.println("Enter second number:");
        int num2 = Integer.parseInt(reader.readLine());
        closeToFive(num2, num1);
    }

    public static void compare(int a){
        if(a > 5){
            System.out.println("Число больше 5");
        }
        else if (a < 5){
            System.out.println("Число меньше 5");
        }
        else {
            System.out.println("Число равно 5");
        }
    }

    public static void checkIfPositive(int a){
        if(a > 0){
            System.out.println(a * 2);
        }
        else {
            System.out.println(a + 10);
        }
    }

    public static void checkInterval(int a){
        if (a >= 20 && a <= 50){
            System.out.println("Число а содержится в интервале.");
        }
        else {
            System.out.println("Число а не содержится в интервале.");
        }
    }

    public static void closeToFive(int a, int b){
        if(Math.abs(5 - a) <= Math.abs(5 - b)){
            System.out.println(a);
        }
        else {
            System.out.println(b);
        }
    }


}
