package part_5.javaCore.recursion;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

public class MapCacheRecursion {
    public static void main(String[] args) {

        System.out.println("factorial(120) = " + factorial(5));
        System.out.println("factorial(30) = " + factorial(4));

    }

    static Map<Integer, BigInteger> cache = new HashMap<>();

    public static BigInteger factorial(int n){
        BigInteger result;

        if(n == 1){
            return BigInteger.ONE;
        }
        if ((result = cache.get(n)) != null){
            return result;
        }

        result = BigInteger.valueOf(n).multiply(factorial(n - 1));
        cache.put(n, result);
        return result;
    }
}
