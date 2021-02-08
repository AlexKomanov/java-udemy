package conditions.homeWork;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HomeWork {
    public static void main(String[] args) throws IOException {

        /* Ввести с клавиатуры два числа, вывести на экран максимальное из них. */
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter first number:");
        int num1 = Integer.parseInt(reader.readLine());
        System.out.println("Enter second number:");
        int num2 = Integer.parseInt(reader.readLine());
        biggerNumber(num1, num2);

        /* Ввести с клавиатуры три числа, вывести на экран минимальное из них. */
        System.out.println("Enter third number:");
        int num3 = Integer.parseInt(reader.readLine());
        smallerOfThree(num1, num2, num3);

        /* Ввести с клавиатуры три числа, вывести на экран среднее из них. */
        middleOfThree(num1, num2, num3);

    }

    public static void biggerNumber(int n1, int n2){
        if (n1 > n2){
            System.out.println(n1);
        }
        else if (n2 > n1){
            System.out.println(n2);
        }
        else {
            System.out.println("Numbers are equals.");
        }
    }

    public static void smallerOfThree(int n1, int n2, int n3){
        if(n1 <= n2 && n1 <= n3){
            System.out.println(n1);
        }
        else if(n2 <= n1 && n2 <= n3){
            System.out.println(n2);
        }
        else {
            System.out.println(n3);
        }
    }

    public static void middleOfThree(int n1, int n2, int n3){
        if((n1 <= n2 && n1 >= n3) || (n1 >= n2 && n1 <= n3)){
            System.out.println(n1);
        }
        else if((n2 <= n1 && n2 >= n3) || (n2 >= n1 && n2 <= n3)){
            System.out.println(n2);
        }
        else {
            System.out.println(n3);
        }
    }
}
