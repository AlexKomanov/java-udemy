package variables.homeWork;

public class HomeWork {

    /*
1) Создать по одной переменной каждого типа данных, который ты знаешь.
2) Присвоить каждой переменной значение в диапазоне типа.
3) Вывести значение каждой переменной в консоль, каждое значение выводить с новой строки.
*/

    public static void main(String[] args) {

        byte b = -88;
        short sh = 230;
        char c = 'y';
        int i = 34543243;
        long lng = 3534534543324324324L;
        boolean bool = false;
        float fl = 3454.5F;
        double dbl = 4544645645645.67;

        System.out.println("\n********** Task 1 **********\n");
        System.out.println("b = " + b);
        System.out.println("sh = " + sh);
        System.out.println("c = " + c);
        System.out.println("i = " + i);
        System.out.println("lng = " + lng);
        System.out.println("bool = " + bool);
        System.out.println("fl = " + fl);
        System.out.println("dbl = " + dbl);

    /*
    1) Создать три переменных (number1, number2, number3) типа int, присвоить им значение 10, 18, 21 соответственно.
    2) Не используя чисел, сделать так, чтобы значение у переменной number1 изменилось на 18
    3) Не используя чисел, сделать так, чтобы значение у переменной number2 изменилось на 21
    4) Не используя чисел, сделать так, чтобы значение у переменной number3 изменилось на 10
    5) Вывести значение каждой переменной в консоль, каждое значение выводить с новой строки.
    */

        System.out.println("\n********** Task 2 **********\n");
        int number1 = 10;
        int number2 = 18;
        int number3 = 21;
        int temp = number1;
        number1 = number2;
        number2 = number3;
        number3 = temp;

        System.out.println("number1 = " + number1);
        System.out.println("number2 = " + number2);
        System.out.println("number3 = " + number3);



    }

}
