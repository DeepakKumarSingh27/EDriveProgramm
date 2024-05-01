package RaghuSir.javaEightFetures;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MainRunner12 {
    public static void main(String[] args) {
        IntStream.range(1,10).forEach(System.out::println);
        IntStream.rangeClosed(1,10).forEach(System.out::println);

        int[] eve = IntStream.range(1,100).filter(x->x%2==0).toArray();
        System.out.println(Arrays.toString(eve));

    }
}
