package RaghuSir.OneDArray;

import java.util.Arrays;

public class Arr12 {
    public static void main(String[] args) {
        ArrayOperation ao = new ArrayOperation();
        System.out.println("Enter first Array");
        int[] x = ao.readArray();
        ao.disp(x);
        System.out.println("Enter second Array");
        int[] y = ao.readArray();
        ao.disp(y);
        System.out.println("Merged sorted  Array Element is " + Arrays.toString(mergedArray(x, y)));
    }

    public static int[] mergedArray(int[] ar, int[] br) {
        int[] cr = new int[ar.length + br.length];
        int i = 0, j = 0, k = 0;
        while (i < ar.length && j < br.length) {
            if (ar[i] < br[j]) {
                cr[k] = ar[i];
                i++;
            } else {
                cr[k] = br[j];
                j++;
            }
            k++;
        }
        while (i < ar.length)
            cr[k++] = ar[i++];
        while (j < br.length)
            cr[k++] = br[j++];
        return cr;
    }

}
