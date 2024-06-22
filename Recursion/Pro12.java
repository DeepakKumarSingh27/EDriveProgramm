package RaghuSir.Recursion;

import java.util.ArrayList;
import java.util.List;

public class Pro12 {

    public static void main(String[] args) {
        int[] arr = {1, 2, 1};
        int n = 3, sum = 2;
        List<Integer> ds = new ArrayList<>();
        // printFun(0, ds, 0, sum, arr, n);
        System.out.println(printFunction(0, 0, sum, arr, n));
    }

    public static void printF(int ind, List<Integer> ds, int s, int sum, int[] arr, int n) {
        if (ind == n) {
            if (s == sum) {
                for (int it : ds) System.out.print(it + " ");
                System.out.println();
            }
            return;
        }
        ds.add(arr[ind]);
        s += arr[ind];
        printF(ind + 1, ds, s, sum, arr, n);
        s -= arr[ind];
        ds.remove(ds.size() - 1);
        printF(ind + 1, ds, s, sum, arr, n);
        ;
    }

    public static boolean printFun(int ind, List<Integer> ds, int s, int sum, int[] arr, int n) {
        if (ind == n) {
            if (s == sum) {
                for (int it : ds) System.out.print(it + " ");
                System.out.println();
                return true;
            }
            return false;
        }
        ds.add(arr[ind]);
        s += arr[ind];
        if (printFun(ind + 1, ds, s, sum, arr, n) == true) return true;
        s -= arr[ind];
        ds.remove(ds.size() - 1);
        if (printFun(ind + 1, ds, s, sum, arr, n) == true) return true;
        return false;
    }

    public static int printFunction(int ind, int s, int sum, int[] arr, int n) {
        if (ind == n) {
            if (s == sum) {
                return 1;
            }
            return 0;
        }
        s += arr[ind];
        int l = printFunction(ind + 1, s, sum, arr, n);
        s -= arr[ind];
        int r = printFunction(ind + 1, s, sum, arr, n);
        return l + r;
    }

}
