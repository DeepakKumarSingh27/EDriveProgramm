package RaghuSir.OneDArray;

import java.util.Arrays;
import java.util.Scanner;

public class Arr14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " values");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the index you want to delete the Array Element");
        int ind = sc.nextInt();
        System.out.println("Final Array Element is " + Arrays.toString(deleteArrayEle(arr, ind)));
    }

    public static int[] deleteArrayEle(int[] arr, int ind) {
        int[] br = new int[arr.length - 1];
        for (int i = 0; i < arr.length - 1; i++) {
            if (i < ind)
                br[i] = arr[i];
            else
                br[i] = arr[i + 1];
        }
        return br;
    }
}
