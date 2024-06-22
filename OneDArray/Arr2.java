package RaghuSir.OneDArray;

import java.util.Scanner;

public class Arr2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Array of Array");
        int n = sc.nextInt();
        int []arr = new int[n];
        System.out.println("Enter "+n+" values");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int big = 0;
        for (int i = 0; i < arr.length; i++) {
            if ( arr[i] > big){
               big = arr[i];
            }
        }
        System.out.println("Biggest Element is "+big);
    }
}
