package RaghuSir.Recursion;

import java.math.BigInteger;

public class Pro7 {
    public static void main(String[] args) {
       // System.out.println(fact(BigInteger.valueOf(100)));
        System.out.println(fact(50));
    }

    public static BigInteger fact(BigInteger n) {
        if (n.equals(BigInteger.ZERO))
            return BigInteger.ONE;
            return n.multiply(fact(n.subtract(BigInteger.ONE)));
    }
    public static long fact(long n) {
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}
