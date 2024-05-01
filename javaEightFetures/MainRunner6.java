package RaghuSir.javaEightFetures;

import java.util.function.Function;

public class MainRunner6 {
    public static void main(String[] args) {
        Function<String, Integer> f = Integer::parseInt;
        Integer x = f.apply("123");
        System.out.println(x);
    }
}
