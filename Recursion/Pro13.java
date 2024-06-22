package RaghuSir.Recursion;

import java.util.ArrayList;
import java.util.List;

public class Pro13 {
    public static void main(String[] args) {

    }

    public static void printF(int ind, int[] arr, int target, List<List<Integer>> ans, List<Integer> ds) {
        if (ind == arr.length) {
            if (target == 0) {
                ans.add(new ArrayList<>(ds));
            }
            return;
        }
        if (arr[ind] <= target) {
            ds.add(arr[ind]);
            printF(ind + 1, arr, target, ans, ds);
            ds.remove(ds.size() - 1);
        }
        printF(ind + 1, arr, target, ans, ds);
    }

    public List<List<Integer>> combnationSum(int[] arr, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        printF(0, arr, target, ans, new ArrayList<>());
        return ans;
    }
}
