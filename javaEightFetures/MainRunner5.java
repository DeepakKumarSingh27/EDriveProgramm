package RaghuSir.javaEightFetures;

import java.util.function.Consumer;

public class MainRunner5 {
    public static void main(String[] args) {
        Consumer<String> c1 = new Consumer<String>() {
            @Override
            public void accept(String t) {
                System.out.println(t);
            }
        };
        c1.accept("Rama");
        Consumer<String> c2 = System.out::println;
        c2.accept("Deepak");
    }
}
