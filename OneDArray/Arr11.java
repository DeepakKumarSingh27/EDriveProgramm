package RaghuSir.OneDArray;

import java.util.Arrays;

public class Arr11 {
    public static void main(String[] args) {
        ArrayOperation ao = new ArrayOperation();
        System.out.println("Enter first Array");
        int[] x = ao.readArray();
        ao.disp(x);
        System.out.println("Enter second Array");
        int[] y = ao.readArray();
        ao.disp(y);
        System.out.println("zig zag Array Element is " + Arrays.toString(zigZagArray(x, y)));
    }

    public static int[] zigZagArray(int[] ar, int[] br) {
        int[] cr = new int[ar.length + br.length];
        int i = 0, j = 0, k = 0;
        while (i < ar.length && j < br.length) {
            cr[k] = ar[i];
            k++;
            i++;
            cr[k] = br[j];
            k++;
            j++;
        }
        while (i < ar.length)
            cr[k++] = ar[i++];
        while (j < br.length)
            cr[k++] = br[j++];
        return cr;
    }
}
/*
1 2 3 4 5 6
1 4 2 5 3 6
 */