package RaghuSir.OneDArray;

import java.util.Arrays;

public class Arr7 {
    public static void main(String[] args) {
        System.out.println("Enter first Array ");
        ArrayOperation ao = new ArrayOperation();
        int[] x = ao.readArray();
        System.out.println("user entered first array element is ");
        ao.disp(x);
        System.out.println("Enter the second Array");
        int[] y = ao.readArray();
        System.out.println("user entered second element is");
        ao.disp(y);
        int[] z = margedArray(x,y);
        System.out.println("Merged Array element is "+ Arrays.toString(z));
    }
    public static int[] margedArray(int[] a,int[] b){
        int[] cr = new int[a.length + b.length];
        for (int i = 0; i < a.length; i++) {
            cr[i] = a[i];
        }
        for (int i = 0; i < b.length; i++) {
            cr[i+a.length] = b[i];
        }
        return cr;
    }
}
