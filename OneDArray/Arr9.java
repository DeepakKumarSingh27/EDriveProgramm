package RaghuSir.OneDArray;

import java.util.Arrays;

public class Arr9 {
    public static void main(String[] args) {
        ArrayOperation ao = new ArrayOperation();
        int[] arr = ao.readArray();
        System.out.println("Sum of Array element is "+ Arrays.toString(sumOfEle(arr)));
    }
    public static int[] sumOfEle(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int sum  = 0;
            do {
                int d = arr[i] % 10;
                sum += d;
                arr[i] /= 10;
            }while (arr[i] != 0);
            arr[i] = sum;
        }
        return arr;
    }
}
