package part_1.methods;

public class Methods {

    /** 4 Access types: public, protected, default, private **/

    public static void main(String[] args) {

        int result = sum(20, 25);
        System.out.println("result = " + result);
        System.out.println("result2 = " + sum(2, 50));
        String convertResult = convert("Text");
        System.out.println("convertResult = " + convertResult);
        System.out.println("Method printTwice:");
        printTwice("Text to print");
    }

    public static int sum(int n1, int n2){
        return  n1 + n2;
    }

    public static String convert(String str){
        String res = str + " end";
        return res;
    }

    /** Method with 'void' type - doesn't return anything **/
    public static void printTwice(String text){
        System.out.println(text);
        System.out.println(text);
    }
}
