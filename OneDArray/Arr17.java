package RaghuSir.OneDArray;

import java.util.Scanner;

public class Arr17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " values");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        printfreqArray(arr);
    }
    public static void printfreqArray(int[] arr) {
        int big = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (big < arr[i]) {
                big = arr[i];
            }
        }
        int[] brr = new int[big + 1];
        for (int i = 0; i < arr.length; i++) {
           brr[arr[i]]++;
        }
        for (int i = 0; i < brr.length; i++) {
            if (brr[i] != 0)
                System.out.println(i+" ----> "+brr[i]);
        }
    }
}
