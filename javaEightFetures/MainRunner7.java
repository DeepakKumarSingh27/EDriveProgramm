package RaghuSir.javaEightFetures;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MainRunner7 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Deepak","Vishal","Ravi");
//        Consumer<String> c1 = new Consumer<String>() {
//            @Override
//            public void accept(String s) {
//                System.out.println("Hello "+s);
//            }
//        };
//        names.forEach(c1);
//        names.forEach(t->System.out.println("Hello "+t));
//        names.forEach(System.out::println);
                                 //intermediate function              //terminal function
        names  = names.stream().filter(x->x.indexOf('e')>=0).collect(Collectors.toList());
        names.forEach(System.out::println);
    }
}
