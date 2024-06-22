package RaghuSir.javaEightFetures;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test1 {
    public static void main(String[] args) {
//        String[] str = {"A", "C", "B"};
//        List<String> ll = Arrays.stream(str)
//                .filter(a -> a.compareTo("B") > 0)
//                .sorted() // Sort the elements in ascending order
//                .collect(Collectors.toList());
//
//        ll.forEach(System.out::print);

    }

    public static boolean searchInARotatedSortedArrayII(int[] A, int key) {
        // Write your code here.
        for (int i = 0; i < A.length; i++) {
            if (A[i] == key) return true;
        }
        return false;
    }
}
