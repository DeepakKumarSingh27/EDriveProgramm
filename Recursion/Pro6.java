package RaghuSir.Recursion;

import java.math.BigInteger;

public class Pro6 {
    public static void main(String[] args) {
        System.out.println(fib(BigInteger.valueOf(34)));
    }
    public static BigInteger fib(BigInteger n) {
            if (n.equals(BigInteger.ZERO)) {
                return BigInteger.ZERO;
            } else if (n.equals(BigInteger.ONE)) {
                return BigInteger.ONE;
            } else {
                return fib(n.subtract(BigInteger.ONE)).add(fib(n.subtract(BigInteger.TWO)));
            }
        }

    }
