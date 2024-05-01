package RaghuSir.javaEightFetures;

import java.util.function.Predicate;

class PrimeNumber {
    boolean isPrime(int n)
    {
        for (int i = 2; i <= n/2; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
public class MinRunner9 {
    public static void main(String[] args) {
        PrimeNumber pm = new PrimeNumber();
       // Predicate<Integer> pr = pm::isPrime;
        Predicate<Integer> pr = new PrimeNumber()::isPrime;
        System.out.println(pr.test(11));
        System.out.println(pr.test(12));
    }
}
