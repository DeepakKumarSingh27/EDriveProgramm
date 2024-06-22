package RaghuSir.Recursion;

import java.util.Arrays;
import java.util.Scanner;

public class Pro9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " values");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        reverse(0,arr,n);
        System.out.println("Reversed array element is ");
        System.out.println(Arrays.toString(arr));
    }
    public static void reverse(int i,int[] arr,int n) {
        if (i >= n / 2) return;
        swap(arr,i,n - i - 1);
        reverse(i + 1,arr,n);
    }
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
