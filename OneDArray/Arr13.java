package RaghuSir.OneDArray;

import java.util.Arrays;
import java.util.Scanner;

public class Arr13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " values");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the Index you want to insert the element");
        int in = sc.nextInt();
        System.out.println("Enter the Element");
        int ele = sc.nextInt();
        System.out.println("Final Array is " + Arrays.toString(insertEle(arr, in, ele)));
    }

    public static int[] insertEle(int[] arr, int in, int ele) {
        int[] br = new int[arr.length + 1];
        br[in] = ele;
        for (int i = 0; i < arr.length; i++) {
            if (i < in)
                br[i] = arr[i];
            else
                br[i + 1] = arr[i];
        }
        return br;
    }
}
