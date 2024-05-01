package RaghuSir.javaEightFetures.javaEightFetures;

import java.util.stream.IntStream;

public class MainRunner13 {
    static class Prime
    {
        static boolean isPrime(int n)
        {
//            for (int i = 2; i <= n / 2; i++) {
//                if (n % i == 0) return false;
//            }
//            return true;
            return IntStream.rangeClosed(2,n/2).noneMatch(i->n%i==0);
        }
        public static boolean isPrime1(int n)
        {
            int sum = IntStream.rangeClosed(1,n/2).reduce(0,(sm,b)->n%b==0?sm+b:sm);
            System.out.println(sum);
            return sum == n;
        }
        public static int isFact(int n)
        {
             return IntStream.rangeClosed(2,n).reduce(1,(prod,i)->prod*i);
        }
    }

    public static void main(String[] args) {
       // IntStream.range(1,100).filter(Prime::isPrime).forEach(System.out::println);
        //IntStream.range(1,100).filter(n->IntStream.rangeClosed(2,n/2).noneMatch(i->n%i==0)).forEach(System.out::println);

       // int ct = (int) IntStream.range(1,100).filter(n->IntStream.rangeClosed(2,n/2).noneMatch(i->n%i==0)).count();
        //System.out.println("Total prime number is "+ct);
       // System.out.println(Prime.isPrime1(28));
        System.out.println(Prime.isFact(5));
    }
}
