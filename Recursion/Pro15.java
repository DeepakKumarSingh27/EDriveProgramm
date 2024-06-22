package RaghuSir.Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Pro15 {
    public static void main(String[] args) {
        List<int[]> ans = new ArrayList<>();
        int[] arr = {1,2,3,4};
       ans = Arrays.asList(arr);

    }
    ArrayList<Integer> subsetSums(ArrayList<Integer> arr, int N) {
        // code here
        ArrayList<Integer> sb = new ArrayList<>();
        func(0,0,arr,N,sb);
        Collections.sort(sb);
        return sb;
    }
    public static void func(int ind,int sum,ArrayList<Integer> arr,int N,ArrayList<Integer> sb) {
        if (ind == N) {
            sb.add(sum);
            return;
        }
        func(ind +1,sum+arr.get(ind),arr,N,sb);

        func(ind + 1,sum,arr,N,sb);
    }
}
