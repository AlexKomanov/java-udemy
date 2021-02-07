package methods.homeWork;

public class HomeWork {
    public static void main(String[] args) {

    }
    //1) Создать метод sum, который должен суммировать 2 числа.
    public static int sum(int n1, int n2){
        return n1 + n2;
    }

    //2) Создать метод multy, который должен умножить 2 числа.
    public static int multy(int n1, int n2){
        return n1 * n2;
    }

    //3) Создать метод subt, который должен вычесть второе число из первого.
    public static int subt(int n1, int n2){
        return n1 - n2;
    }

    //4) Создать метод div, который должен делить 2 числа.
    public static int div(int n1, int n2){
        return n1 / n2;
    }

    //1) Создать метод convert, который должен конвертировать евро в доллары. В метод должен приходить один аргумент (к-во евро).
    //   Метод должен возвращать к-во долларов.
    public static double convert(double euro){
        double dollars = euro * 0.9;
        return dollars;
    }

    //2) Создать метод percent, который принимает один аргумент (число) и возвращает это же число + 10% от него.
    public static double percent(double number){
        return number * 1.1;
    }

    //3) Создать метод print, который принимает один аргумент (строку) и выводит эту строку 4 раза в консоль.
    public static void print(String text){
        System.out.println(text);
        System.out.println(text);
        System.out.println(text);
        System.out.println(text);
    }

}
