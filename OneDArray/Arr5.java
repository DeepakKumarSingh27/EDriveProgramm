package RaghuSir.OneDArray;

import java.util.Arrays;
import java.util.Scanner;

public class Arr5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Array of Array");
        int n = sc.nextInt();
        int []arr = new int[n];
        System.out.println("Enter "+n+" values");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(reverseArray(arr)));
    }
    public static int[] reverseArray(int[] arr) {
       int start = 0, end = arr.length - 1;
       while (start < end) {
           int temp = arr[start];
           arr[start] = arr[end];
           arr[end] = temp;
           start++;
           end--;
       }
       return arr;
    }
}
