package RaghuSir.Recursion;


import java.util.ArrayList;
import java.util.List;

public class ThreadSleepDemo {
    public static void printF(int ind, List<Integer> ds, int[] arr, int n) {
        if (ind == n) {
            if (ds.size() == 0) {
                System.out.print("{}");
            } else {
                for (int it : ds) {
                    System.out.print(it + " ");
                }
            }
            System.out.println();
            return;
        }
        printF(ind + 1, ds, arr, n);
        ds.add(arr[ind]);
        printF(ind + 1, ds, arr, n);
        ds.remove(ds.size() - 1);

    }

    public static void main(String[] args) {
        int[] arr = {3, 1, 2};
        List<Integer> ds = new ArrayList<>();
        printF(0, ds, arr, arr.length);
    }
}
