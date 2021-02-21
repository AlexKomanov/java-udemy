package part_5.javaCore.recursion;

public class MainRecursion {
    public static void main(String[] args) {
        System.out.println("factorial(4) = " + factorial(4));

    }

    public static int factorial(int n ){
        if (n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    /*
    * factorial(4)      4 * factorial(3)
    * factorial(3)      3 * factorial(2)
    * factorial(2)      2 * factorial(1)
    * factorial(1)      return 1
    */
}
