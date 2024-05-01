package RaghuSir.javaEightFetures;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MainRunner11 {
    public static void main(String[] args) {
        int[] ar = {23,45,67,43,89,24,34};
        int big = IntStream.of(ar).max().getAsInt();
        System.out.println(big);
        double avg = IntStream.of(ar).average().getAsDouble();
        System.out.println(avg);
        int sum = IntStream.of(ar).sum();
        System.out.println(sum);
        int product = IntStream.of(ar).reduce(1,(a,b)->a*b);
        System.out.println(product);
        int esum = IntStream.of(ar).filter(a->a%2==0).sum();
        System.out.println(esum);
        int[] ear = IntStream.of(ar).filter(a->a%2==0).toArray();
        System.out.println(Arrays.toString(ear));
        ar = IntStream.of(ar).filter(a->a%2==1).map(a->a+10).toArray();
        System.out.println(Arrays.toString(ar));
        //names.forEach(System.out::println);

    }
}
