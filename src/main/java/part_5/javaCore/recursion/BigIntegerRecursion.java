package part_5.javaCore.recursion;

import java.math.BigInteger;

public class BigIntegerRecursion {
    public static void main(String[] args) {

        System.out.println("factorial(120) = " + factorial(120));
    }

    public static BigInteger factorial(int n){
        if (n == 1) {
            return BigInteger.ONE;
        }
        return BigInteger.valueOf(n).multiply(factorial(n - 1));
    }
}
