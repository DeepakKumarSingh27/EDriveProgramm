package RaghuSir.OneDArray;

import java.util.Arrays;

public class Arr10 {
    public static void main(String[] args) {
        ArrayOperation ao = new ArrayOperation();
        int[] x = ao.readArray();
        System.out.println("sum of Odd and Even element is "+ Arrays.toString(oddEvenSum(x)));
    }
    public static int[] oddEvenSum(int[] arr) {
        int oc = 0, ec = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0)
                ec+= arr[i];
            else
                oc += arr[i];
        }
        return new int[]{ec,oc};
    }
}
