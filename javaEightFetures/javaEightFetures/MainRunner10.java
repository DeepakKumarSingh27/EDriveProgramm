package RaghuSir.javaEightFetures.javaEightFetures;

import java.util.Comparator;
import java.util.TreeSet;

public class MainRunner10 {
    public static void main(String[] args) {
        //Comparator<Integer> com = Comparator.reverseOrder();
        TreeSet<Integer> ts = new TreeSet<>(Comparator.reverseOrder());
        ts.add(23);
        ts.add(45);
        ts.add(98);
        ts.add(56);
        ts.add(38);
        System.out.println(ts);
    }
}
